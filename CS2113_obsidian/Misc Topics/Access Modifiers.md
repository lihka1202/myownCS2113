There are two levels of access control:

1.  **At the class level**:
    
    -   **`public`**: the class is visible to all classes everywhere
    -   **no modifier (the default, also known as _package-private_)**: it is visible only within its own package  
          
        
2.  **At the member level**:
    
    -   **`public`** or **no modifier (_package-private_)**: same meaning as when used with top-level classes
    -   **`private`**: the member can only be accessed in its own class
    -   **`protected`**: the member can only be accessed within its own package (as with package-private) and, in addition, by a subclass of its class in another package
- ![[Pasted image 20230207082954.png]]

Also means the **public and protected members** are inheritable, while the others are not

Access levels affect you in two ways:

1.  When you use classes that come from another source, such as the classes in the Java platform, access levels determine which members of those classes your own classes can use.
   Basically some information is restricted for good reason, the others might just be to implement OOP Better
1.  When you use classes that come from another source, such as the classes in the Java platform, access levels determine which members of those classes your own classes can use.
   The default is **public**, but that is generally not a good idea
