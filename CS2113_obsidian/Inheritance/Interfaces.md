**An interface is a behavior specification**.

Generically, you can think of this as a template, or in the words of the oracle docs

"There are a number of situations in software engineering when it is important for disparate groups of programmers to agree to a "contract" that spells out how their software interacts. Each group should be able to write their code without any knowledge of how the other group's code is written. Generally speaking, interfaces are such contracts."

In other terms, check this example out:

Suppose `SalariedStaff` is an interface that contains two methods `setSalary(int)` and `getSalary()`. `AcademicStaff` can declare itself as _implementing_ the `SalariedStaff` interface, which means the `AcademicStaff` class must implement all the methods specified by the `SalariedStaff` interface i.e., `setSalary(int)` and `getSalary()`.

**This also means that a lot like inheritance, this possess an is-a relationship. ie if some method expects the object type to be SalariedStaff, and Academic staff object can also be used.**

I think one of the more commonly asked questions is how do interfaces differ from abstract classes, this is more in the sense that:
- Java doesnt allow **multiple inheritence** for classes, but it allows multilevel inheritance from interfaces.
- But  more on this later

Some key points:
**Interfaces are reference types, similar to a class, mainly containing method signatures, WHICH MUST BE OVERRIDDEN IN ANY CLASS WHICH IMPLEMENTS THE INTERFACE**

An example:
```java
public interface DrivableVehicle {
    void turn(Direction direction);
    void changeLanes(Direction direction);
    void signalTurn(Direction direction, boolean signalOn);
    // more method signatures
}

```

Like [[Abstract Class]], Interfaces cannot be **instantiated**, they can only be **implemented by classes**. One way to think of this is a very general set of methods which exists across the board, and need to exist in every single class

```java
public class CarModelX implements DrivableVehicle {

    @Override
    public void turn(Direction direction) {
       // implementation
    }

    // implementation of other methods
}

```

Note that you can still use **interfaces as a type**:
`DrivableVehicle dv = new CarModelX();`.

Interfaces can **inherit from other interfaces, using the extends keyword**
```java
public interface SelfDrivableVehicle extends DrivableVehicle {
   void goToAutoPilotMode();
}

```

*2 pointers about interfaces in general:*
- in Java, A single interface can **inherit from multiple interfaces**
- A single class **can implement multiple other interfaces**
Here is a UML diagram to explain the same:

![[Pasted image 20230207080924.png]]
- The solid lines are class inheritance, the dashed lines indicate what is termed as interface inheritance


**Note that interfaces can also consist of constants and static methods**
```java
public interface DrivableVehicle {

    int MAX_SPEED = 150;

    static boolean isSpeedAllowed(int speed){
        return speed <= MAX_SPEED;
    }

    void turn(Direction direction);
    void changeLanes(Direction direction);
    void signalTurn(Direction direction, boolean signalOn);
    // more method signatures
}

```

**Interfaces can also consist of [[default method implementations]] and [[nested types]].**
