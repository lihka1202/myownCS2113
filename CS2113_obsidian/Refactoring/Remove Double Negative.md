
generally for booleans you want to ensure that you don't end up **defining a boolean with negative**, with that in mind if at any point you do, then just remove the double negative like this in the following code example.

```java
if ( !item.isNotFound() )
```

```java
if ( item.isFound() )

```