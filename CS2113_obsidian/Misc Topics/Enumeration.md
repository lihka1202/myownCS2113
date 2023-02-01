**An _Enumeration_ is a fixed set of values that can be considered as a data type.** An enumeration is often useful when using a regular data type such as `int` or `String` would allow invalid values to be assigned to a variable.

This is often used in **variables with discreet values,** and these values are fixed.
EG;

Suppose you want a variable called `priority` to store the priority of something. There are only three priority levels: high, medium, and low. You can declare the variable `priority` as of type `int` and use only values `2`, `1`, and `0` to indicate the three priority levels. However, this opens the possibility of an invalid value such as `9` being assigned to it. But if you define an enumeration type called `Priority` that has three values `HIGH`, `MEDIUM` and `LOW` only, a variable of type `Priority` will never be assigned an invalid value because the compiler is able to catch such an error.

# How to implement

**You can define an enum type by using the `enum` keyword.**. An important thing to note is that all the discreet values that an enum can take, **are deemed to be constants, hence they must be in all caps**.

``` java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

```

```java
Day today = Day.MONDAY;
Day[] holidays = new Day[]{Day.SATURDAY, Day.SUNDAY};

switch (today) {
case SATURDAY:
case SUNDAY:
    System.out.println("It's the weekend");
    break;
default:
    System.out.println("It's a week day");
}

// this should OP "Its a week day!"
```


Responses to Key Exercise

```java 

public class Main {  
  
    public enum Priority {  
        HIGH, MEDIUM, LOW  
    }  
    public static void describe(String colour, Priority status) {  
        switch(status) {  
        case HIGH :  
            System.out.println(colour + " indicates high priority");  
            break;        case MEDIUM :  
            System.out.println(colour + " indicates medium priority");  
            break;        case LOW:  
            System.out.println(colour + " indicates low priority");  
            break;        }  
    }  
  
    public static void main(String[] args) {  
        describe("Red", Priority.HIGH);  
        describe("Orange", Priority.MEDIUM);  
        describe("Blue", Priority.MEDIUM);  
        describe("Green", Priority.LOW);  
    }  
}

```
