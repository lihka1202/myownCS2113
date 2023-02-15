You can throw exceptions to indicate some kind of stoppage.

```java
public static void printTodo(String userInput) throws EmptyTodo {  
    String[] holder = userInput.split(" ");  
    while(holder.length<2)  
    {  
        throw new EmptyTodo();  
    }  
    printLine();  
    String input = userInput.replace("todo ", "");  
    taskList[currentIndex] = new Todos(input);  
    currentIndex+=1;  
    printNoTasks(currentIndex);  
    printLine();  
}
```

This combined with the end of the file input taking scheme, allows us to have a farily powerful exit mechanism

the try catch mechanism can look like this:

```java
try {  
    printTodo(userInput);  
}  
catch (EmptyTodo e) {  
    printLine();  
    System.out.println("\tPlease ensure that the todo has a description!");  
    printLine();  
}
```