
Just a template but you cannot create a new object off this class. *Then why is this even there?*


Lets say you have an animal class, and all the animals are derived off this. This is a type, but this object cannot exist, or rather this animal doesn't exist. You can make use of the abstract class to **ensure that no objects can even be created.**

However, **Abstract classes can be subclassed**

So a good rule of thumb of when to declare an abstract class is according to this rule:
****You can declare a class as _abstract_ when a class is merely a representation of commonalities among its subclasses****


 **an _abstract method_ is declared with the keyword `abstract` and given without an implementation**

Here are some examples:

```java
public abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract String speak();
}

```

**An _abstract class_ is declared with the keyword `abstract`. Abstract classes can be used as reference type but cannot be instantiated.**


Note that a **a class with no abstract methods can be declared to be an abstract class**

So one of the implementation features to keep track of is that when **an abstract class is subclassed**, IE the *abstract class is a super class and it has a subclass inheriting from it*, the Subclass must either:
- Be an abstract class too or
- provide some implementation for all the**abstract methods**

So both of these can be explained from this:

```java
public abstract class Feline extends Animal {
    public Feline(String name) {
        super(name);
    }

}

```


or

```java
public class DomesticCat extends Feline {
    public DomesticCat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}

```

