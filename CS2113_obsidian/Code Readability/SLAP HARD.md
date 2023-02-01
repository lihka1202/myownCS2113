
Avoid varying the level of abstraction, I think this goes hand in hand with [[Keep the happy path prominent]].

This is better illustrated through examples:

**BAD**
```java
readData();
salary = basic * rise + 1000;
tax = (taxable ? salary * 0.07 : 0);
displayResult();

```

**GOOD**
``` java
readData();
processData();
displayResult();

```

