**The ability of different objects to respond, each in its own way, to identical messages is called polymorphism**

The most useful function of polymorphism is that you can write code targeting **super class objects**, use that code on subclass objects and achieve very diff results based on the **actual class of the object**.

Assume classes `Cat` and `Dog` are both subclasses of the `Animal` class. You can write code targeting `Animal` objects and use that code on `Cat` and `Dog` objects, achieving possibly different results based on whether it is a `Cat` object or a `Dog` object. Some examples:

-   Declare an array of type `Animal` and still be able to store `Dog` and `Cat` objects in it.
-   Define a method that takes an `Animal` object as a parameter and yet be able to pass `Dog` and `Cat` objects to it.
-  Call a method on a `Dog` or a `Cat` object as if it is an `Animal` object (i.e., without knowing whether it is a `Dog` object or a `Cat` object) and get a different response from it based on its actual class e.g., call the `Animal` class's method `speak()` on object `a` and get a `"Meow"` as the return value if `a` is a `Cat` object and `"Woof"` if it is a `Dog` object.


**Java is a very strongly-typed  language**, ie the code works only with object types it is targetting.

Examples are listed below:
```
public class PetShelter {
    private static Cat[] cats = new Cat[]{ // this is the way to declare an array
            new Cat("Mittens"),
            new Cat("Snowball")};

    public static void main(String[] args) {
        for (Cat c: cats){
            System.out.println(c.speak());
        }
    }
}

```

```
public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String speak() {
        return name + ": Meow";
    }
}


```

This strong typing has a draw back:
it can lead to **unnecessary verbosity** caused by very repetitive sets of code.
This means that if I was to introduce another member of the pet shelter, the whole code would be repeated twice:

```
public class PetShelter {
    private static Cat[] cats = new Cat[]{
            new Cat("Mittens"),
            new Cat("Snowball")};
    private static Dog[] dogs = new Dog[]{
            new Dog("Spot")};

    public static void main(String[] args) {
        for (Cat c: cats){
            System.out.println(c.speak());
        }
        for(Dog d: dogs){
            System.out.println(d.speak());
        }
    }
}

```

And then the dogs class would be something like this:
```
public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String speak() {
        return name + ": Woof";
    }
}

```

**A better way to write all this is to make use of polymorphism** and to write codes which target a super class, so that it works with all of its subclasses.

Something like this:

```
public class PetShelter2 {
    private static Animal[] animals = new Animal[]{
            new Cat("Mittens"),
            new Cat("Snowball"),
            new Dog("Spot")};

    public static void main(String[] args) {
        for (Animal a: animals){
            System.out.println(a.speak());
        }
    }
}

```

```
public class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public String speak(){
        return name;
    }
}

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return name + ": Meow";
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return name + ": Woof";
    }
}


```
 This makes use of [[Substituability]], and [[Method Overloading and Overriding]] to solve the problem.

Code is better in several way, and not limited to:
-   It is **shorter**.
-   It is **simpler**.
-   It is more **flexible** (in the above example, the `main` method will work even if we add more animal types).