**_Casting_ is the action of converting from one type to another**. You can use the `(newType)` syntax to cast a value to a type named `newType`.

Note, when you cast a primitive data type to another data type, depending on the size allocations made to them, there is some chance of some data being lost.

An example is in a case of this sort:
```java
double d = 5.3;
System.out.println("Before casting to an int: " + d);
int i = (int)d; // cast d to an int
System.out.println("After casting to an int: " + i);
d = (double)i; // cast i back to a double
System.out.println("After casting back a double: " + d);

```

[[Downcasting]] is when you cast an object reference from a superclass to a subclass

Consider the code examples below:
```java
class Animal{
    void speak(){
        System.out.println("I'm an animal");
    }
}

class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("I'm a Cat");
    }
}

class DomesticCat extends Cat{
    @Override
    void speak() {
        System.out.println("I'm a DomesticCat");
    }
    void catchMice(){
        // ...
    }
}

```

```java
public static void foo(Animal a){
    a.speak();
    Cat c = (Cat)a; // downcast a to a Cat
    c.speak();
    DomesticCat dc = (DomesticCat)a; // downcast a to a DomesticCat
    dc.speak();
    dc.catchMice();
}

```

So one important thing to note here is that you cannot downcast **Between subclasses**, in a simpler sense, assume **Dog** and **cat** are also classes under animal, you cannot downcast **Dog** to the **cat** class. This is because one of the main criteria for downcasting is that an object cannot be cast to another class unless the object is of that class to begin with. This usually leads to a [[ClassCastException]].

[[UpCasting]] is when you cast an object reference from a subclass to a super class. Although, this is pretty redundant as all of the features from the super class are already **in the subclass**, However do note that *private* access modifier cannot be inherited. Only protected can so maybe that is one reason to [[UpCasting]].

