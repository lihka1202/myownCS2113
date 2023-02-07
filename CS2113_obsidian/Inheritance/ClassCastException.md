**Casting to an incompatible type can result in a `ClassCastException` at runtime.**

Generally you can use the **instanceof** operator to check if the cast is safe to perform.
```java
Cat c;
if (a instanceof Cat){
    c = (Cat)a;
}

```

That being said, based on what prof said, using the **instanceof** operator is indeed a bad idea, to a certain degree it isnt recommended as it can be far too buggy. Generally you should focus on designing a system without using that at all.

