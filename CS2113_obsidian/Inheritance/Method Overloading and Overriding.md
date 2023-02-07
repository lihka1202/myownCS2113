**Method overloading** is when there are multiple methods with the same name but different [[Type signatures]].  However do note that [[polymorphism]] is only possible when the [[function signatures]] are different.

**Method Overriding** is when a sub class changes the behavior inherited from the parent class by re-implementing the method. Overridden methods have the **same name, same type signature and the same return type**. In some ways, this might be the exact same thing as [[shadowing]] a variable out of existence in the sub class, but now this is more for methods.

An example of this is as such:

```
class Time{

     //...

     @Override
     public String toString() {
         return String.format("%02d:%02d:%02d\n",
                 this.hours, this.minutes, this.seconds);
     }
}

```


Another key thing to note when it comes to **overrides**, need to ensure that some things are constant between the same function in both classes:
- **Name**, naturally
- **Return type**
- **Access modifier**


# @Override
This is just an annotation, it tells the compiler that this method is actually written somewhere else and we want to override that




