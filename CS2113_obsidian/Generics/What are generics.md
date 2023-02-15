What if wanted to write code to deal with multiple different types, you could use polymorphism to write this, but this has many shortcomings.

In much simpler terms, **generics alllow types to be parameters when defining classes, a lot like templates in C++**

*Type parameters allow you to use the same code with different kinds of types*

You could generalize polymorphism with the following:


```java
public class Box {
    private Object x;

    public void set(Object x) {
        this.x = x;
    }
    public Object get() {
        return x;
    }
}

```

But do note that the issues which come with this are many, imagine you want to send in object of the type int, and send in a string by mistake. This could result in a TypeExcpetion and your whiole code could come crashing down


