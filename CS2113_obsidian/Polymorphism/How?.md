
**Polymorphism is implemented in OOP through three main operations**

[[Substituability]]: Because of substitutability, you can write code that expects objects of a parent class and yet use that code with objects of child classes. That is how polymorphism is able to _treat objects of different types as one type_.

[[Method Overloading and Overriding]]: -   **Overriding:** To get polymorphic behavior from an operation, the operation in the superclass needs to be overridden in each of the subclasses. That is how overriding allows objects of different subclasses to _display different behaviors in response to the same method call_.

[[Dynamic and Static Binding]]: Calls to overridden methods are bound to the implementation of the actual object's class dynamically during the runtime. That is how the polymorphic code can call the method of the parent class and yet execute the implementation of the child class.