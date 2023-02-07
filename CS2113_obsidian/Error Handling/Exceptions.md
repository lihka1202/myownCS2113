Well-written applications include error-handling code that allows them to recover gracefully from unexpected errors. When an error occurs, the application may need to request user intervention, or it may be able to recover on its own. In extreme cases, the application may log the user off or shut down the system. -- [Microsoft](https://docs.microsoft.com/en-my/windows/win32/debug/error-handling)

Exceptions are essentially used to deal with unusual behavior, but not entirely unexpected situations that the program might encounter at run time

Java, Like most languages, has a mechanism to detect this exceptional situations (at the user's discretion), to **encapsulate details of the situation in an _Exception_ object and _throw_/_raise_ that object so that another piece of code can _catch_ it and deal with it.**

To a large degree, this is just a form of risk management

# What is the process
**When an error occurs at some point in the execution, the code being executed creates an _exception object_ and hands it off to the runtime system.**

This object contains:
- Information about the error
- Its type
- State of the program when the error occurred

The process of *creating an exception object and handing it to runtime is called **throwing an exception***


Once an exception has been thrown, the run time system attempts to fine something to handle it in the **call stack**
The system looks in the call stack for some method that can handle the exception. This block of code is called an **exception handler**. The search begins with the method in which the error occurred and proceeds through the call stack in the reverse order in which the methods were called. **Essentially it started from the current problem and works its way down to the root**. Again the handler checks if the type of the exception object thrown matches the type that can be handled by the handler.

**The exception handler chosen is said to _catch_ the exception.** If the runtime system exhaustively searches all the methods on the call stack without finding an appropriate exception handler, the program terminates.

Advantages of exception handling in this way:

-   The ability to propagate error information through the call stack.
-   The separation of code that deals with 'unusual' situations from the code that does the 'usual' work.
