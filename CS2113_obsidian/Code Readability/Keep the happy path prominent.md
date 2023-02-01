The happy path (i.e. the execution path taken when everything goes well) should be clear and prominent in your code. Restructure the code to make the happy path unindented as much as possible. It is the ‘unusual’ cases that should be indented. Someone reading the code should not get distracted by alternative paths taken when error conditions happen. One technique that could help in this regard is the use of [guard clauses](http://wiki.c2.com/?GuardClause).

More on guard clauses can be found here [[guard clauses]].

**BAD**

```java
if (!isUnusualCase) {  //detecting an unusual condition
    if (!isErrorCase) {
        start();    //main path
        process();
        cleanup();
        exit();
    } else {
        handleError();
    }
} else {
    handleUnusualCase(); //handling that unusual condition
}

```

The issues with the code above are due to the following:
-   unusual condition detections are separated from their handling.
-   the main path is nested deeply.

**GOOD**

```java
if (isUnusualCase) { //Guard Clause
    handleUnusualCase();
    return;
}

if (isErrorCase) { //Guard Clause
    handleError();
    return;
}

start();
process();
cleanup();
exit();

```

Here we can see the happy path moving down, this ensures that guard clauses are based clearly, also ensures that:
- unusual conditions are tested first so that the user doesnt have to remember them for long
- It keeps the main path un indented