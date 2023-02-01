All Java objects inherit from the object class. Here are some useful methods from the object class:

## toString method
**Every class inherits a `toString` method from the `Object` class that is used by Java to get a string representation of the object** e.g., for printing. By default, it simply returns the type of the object and its address (in hexadecimal). Which generally looks something like this:
```
 Time t = new Time(5, 20, 13);
 System.out.println(t);

```

and the O/P looks like this: **Time@80cc7c0**
****

You can actually override the **super methods by using the following command:**

```
@override
```

**Anything under this is overridden** from the super class. More can follow in [[Method Overloading and Overriding]].

## equals method

Naturally in Java, there are mainly 2 ways to check whether 2 values are equal:
- **One could use the `==` or `equals` method.** There is a big difference between them
- The `==` operator checks whether objects are identical, ie if they are the same object
- The `equals` method checks if they have the same value.

More on this can be found here [[equals vs assignment]]
