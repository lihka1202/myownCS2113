Collections are sometimes called a container, is simply an object that groups multiple elements into a single unit.

**The collections framework is a unified architecture for representing and manipulating collections.** It contains the following:

-   **Interfaces**: These are abstract data types that represent collections. Interfaces allow collections to be manipulated independently of the details of their representation.  
     Example: the `List<E>` interface can be used to manipulate list-like collections which may be implemented in different ways such as `ArrayList<E>` or `LinkedList<E>`.
-   **Implementations**: These are the concrete implementations of the collection interfaces. In essence, they are reusable data structures.  
     Example: the `ArrayList<E>` class implements the `List<E>` interface while the `HashMap<K, V>` class implements the `Map<K, V>` interface.
-   **Algorithms**: These are the methods that perform useful computations, such as _searching_ and _sorting_, on objects that implement collection interfaces. The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface.  
     Example: the `sort(List<E>)` method can sort a collection that implements the `List<E>` interface.
These are basically the deeper level understandings of the basic topic, in simpler terms you can use these to deal with code

This is most similar to the STL Library in C++



