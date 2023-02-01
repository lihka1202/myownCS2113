When the code has a number that does not explain the meaning of the number, it is called a "magic number" (as in "the number appears as if by magic"). Using a 

_named constant_

 makes the code easier to understand because the name tells us more about the meaning of the number.
``` java
return 3.14236;
...
return 9;

```

```java
static final double PI = 3.14236;
static final int MAX_SIZE = 10;
...
return PI;
...
return MAX_SIZE - 1;

```