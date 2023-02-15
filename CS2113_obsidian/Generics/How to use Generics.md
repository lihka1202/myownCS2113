**The definition of a generic class includes a _type parameter section_, delimited by angle brackets (`<>`).**

Within these angle braces, you can place in the types for which this generic is defined for

```java
class name<T1, T2, ..., Tn> { /* ... */ }

```

For example Polymorphism would look something like this:

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

And the other types are a bit like this:

```java
public class Box<T> {
    private T x;

    public void set(T x) {
        this.x = x;
    }

    public T get() {
        return x;
    }
}

```

The invocation is also very similar to a normal class object declaration

```java
Box<Integer> integerBox;
integerBox = new Box<>(); // type parameter omitted as it can be inferred
integerBox.set(Integer.valueOf(4));
Integer i = integerBox.get(); // returns an Integer

```

The compiler is able to check for type errors

```java
Box<String> stringBox = new Box<>();
stringBox.set(Double.valueOf(5.0)); //compile error!

```

```java
public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}


```

The type variable can be any variable that you wanna specity

**By convention, you need to use uppercase for these variables**
-   `E` - Element (used extensively by the Java Collections Framework)
-   `K` - Key
-   `N` - Number
-   `T` - Type
-   `V` - Value
-   `S`, `U`, `V` etc. - 2nd, 3rd, 4th types
