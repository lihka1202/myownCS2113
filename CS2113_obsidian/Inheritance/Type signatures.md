The type signature of an operation is the **type sequence** of its parameters.
This means that the *name* and the *return type* are not part of the **type sequence**, the order of parameters is different.

In essence
`int add(int X, int Y)` **is different from** `int add(int X, double Y)`. 
`int add(int X, int Y)` --> *(int, int)* and `int add(int X, double Y)` --> *(int, double)*.

### But

`int add(int X, int Y)` **is not different from** `void add(int X, int Y)`, as both type signatures do not include the *return type.*
