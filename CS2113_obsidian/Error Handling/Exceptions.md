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

## Basic categories of Exceptions
### Checked Exception
- Any exception that can be anticipated, and the system can recover from thee exceptions and solve some of the issues which are affiliated to this
- All exceptions are checked exceptions except for `Error` and `RunTimeException` and their subclasses
### Errors
- Exceptional conditions that are external to the application and that the application usually cannot anticipate or recover from. These are usually subclasses of **Error**
	- Usually in this case, it makes sense for the program to actually print a **stack trace** and trace the source of the issue
### Runtime exceptions
- Conditions that are internal to the application and that the application usually cannot anticipate or recover from




# How to use these exceptions
Exceptions mainly make use of **try and catch blocks**\

Its important to understand how to use exceptions as these are crucial to later parts of your code for the IP and generally as well, as this knowledge is generally useful for [[automated unit test]].

Generally, in order to use repeating exceptions, I think the usage of a **do while loop is better**. This is because this ensure that the whole code at the very least will repeat this one time

Either way, generally exceptions looks something like this:
```java
public void writeList() {
    print("starting method");
    try {
        print("starting process");
        process();
        print("finishing process");

    } catch (IndexOutOfBoundsException e) {
        print("caught IOOBE");

    } catch (IOException e) {
        print("caught IOE");

    }
    print("finishing method");
}

```

So the flow of control can be any of the following:
![[Pasted image 20230211172941.png]]

You can use a **finally** block to specify code that is generated to execute with or without the exception. This is the right place to close files, recover resources or clean up the code after the **try** sequence


-   The `try` statement should contain at least one `catch` block or a finally block and may have multiple `catch` blocks.
    
-   The class of the exception object indicates the type of exception thrown. The exception object can contain further information about the error, including an error message.

You can also throw **exceptions** using statements, this requires some object to actually be throwable, and this might a large part of the issue

Here is an example of a throw statement

```java
if (size == 0) {
    throw new EmptyStackException();
}

```

In java, **Checked exceptions are subject to either catch or specify requirement**. Code that might throw checked exceptions must be enclosed by either of the following


So you can ensure that methods communicate that they throw checked exceptions

Here is an example:
```java
public void writeList() throws IOException, IndexOutOfBoundsException {
    print("starting method");
    process();
    print("finishing method");
}

```

