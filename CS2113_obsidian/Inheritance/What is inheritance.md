# What are some of the tenants of inheritance
- How does inheritance affect the programming world, does it make life easier or harder than usual?
- There are some questions to consider in the long run.

# Why is it even usable?
Its an **OOP Concept** which allows one to define a new class based off an existing class. Its mainly composed of a **super class** and a **subclass**. More commonly this can be called a parent and child class.

Inheritance allows the common parts among the classes being abstracted. This ensures that there is some degree of [[abstraction]] and [[encapsulation]]. 

However, it is important to note that **this cannot be used to abstract features of class which can be used to distinguish one class from another**. A good example can be illustrated below:

*`Man` and `Woman` behave the same way for certain things. However, the two classes cannot be simply replaced with a more general class `Person` because of the need to distinguish between `Man` and `Woman` for certain other things. A solution is to add the `Person` class as a superclass (to contain the code common to men and women) and let `Man` and `Woman` inherit from `Person` class.*

Inheritance implies that the **base class** is a **super type** of the derived class (**sub class**). This also implies that they have an #isa relationship.

Inheritance relationships through classes usually leads to an [[inheritance hierarchies]].

When a single class inherits from multiple different classes, this is called [[multiple inheritance]].

Now we have a question to test out our understanding of inheritance:
[[Q1]]

# Some more formal definitions of the various elements which comprise inheritance

- **A class that is derived from another class is called a _subclass_** (also a _derived_ class, _extended_ class, or _child_ class). The class from which the subclass is derived is called a _superclass_ (also a _base_ class or a _parent_ class).
- **A subclass inherits all the members** (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
- **Every class has one and only one direct superclass (_[[single inheritance]]_)**, except the `Object` class, which has no superclass, . In the absence of any other explicit superclass, every class is implicitly a subclass of `Object`. Classes can be derived from classes that are derived from classes that are derived from classes, and so on, and ultimately derived from the topmost class, `Object`. Such a class is said to be _descended_ from all the classes in the _inheritance chain_ stretching back to `Object`. Java does not support _multiple inheritance_ among classes.

The #extends keywords indicates that **one class is inheriting from another**.

The syntax looks something like this:
`public class NewClass extends OldClass {}`

## Accessing super class members
If by some chance you're doing some kind of overriding ([[Method Overloading and Overriding]]), then in order to access the **superclass elements** you can do so by using the **keyword** [[super]].

Consider these 2 code snippets to convince yourself:
```
public class Superclass {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}
```

```
public class Subclass extends Superclass {

    // overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
    }
}

```

```
Printed in Superclass.
Printed in Subclass
```


This is also possible for [[constructors]].

**A subclass constructor can invoke the superclass constructor**.

More details on this can be found in [[super]].


