Java doesnt actually support constants, instead they are implemented using 2 main keywords:

# final
Final ensures that the **value in the variables does not change** or rather cannot be changed

# static
This causes the variable to be **available to all the members of the class, and it also exists without creating an object**. An example could be when you want to make a class which mimics a car manufacturing facility, you can use a constant to set the production limit, even without instantiating a single car object.

Constants are usually name in **ALL_CAPS_SEPARATED_BY_UNDERSCORES**, this is so that we can easily distinguish them.

[`Math.PI`](https://docs.oracle.com/javase/9/docs/api/java/lang/Math.html#PI) is an example constant that comes with Java.



