
A very weird way to refactor, good to note that this is the inverse of [[Extract Function]].

Ideally if there is an extra function doing something that is readily available, you just need to ensure that you **don't** do extra. IE, **don't define a new class or functions uselessly**.

```java
function getRating(driver) {
  return moreThanFiveLateDeliveries(driver) ? 2 : 1;
}

function moreThanFiveLateDeliveries(driver) {
  return driver.numberOfLateDeliveries > 5;
}
```

```java
function getRating(driver) {
  return (driver.numberOfLateDeliveries > 5) ? 2 : 1;
}
```
