This process of **improving a program's internal structure in small steps without modifying its external behavior is called _refactoring_.**

A couple of pointers to keep note of:
-   **Refactoring is not rewriting**: Discarding poorly-written code entirely and re-writing it from scratch is not refactoring because refactoring needs to be done in small steps.
-   **Refactoring is not bug fixing**: By definition, refactoring is different from bug fixing or any other modifications that alter the external behavior (e.g. adding a feature) of the component in concern.
It also has a couple of secondary benefits, such:
- being able to spot errors better, improving the performance ( as the code is simpler now)

That being said, refactoring doesnt seem to make too much sense as a whole, I think its a combination of [[SLAP HARD]] and [[Practice KISSing]], to ensure that [[Make the code obvious]]. But that being said, it might be an excruciatingly difficult process to accomplish in due time.

*Note that refactoring has a major chance of resulting in regressions, so we must ensure to do some [[Regression testing]] right after refactoring*


But needless to say, I think we can make use of IntelliJ IDEA to refactor code, *or even use the github co-pilot to help out, but this remains quite difficult to do.*

In order to **extract a variable** you can use *Ctrl + Alt + V*, it should give you two more options, and you can choose which option:
- Either it can be a final constant
- or you can just make it a [[var]]


This can also help you understand how to change the variable name for other expressions


**Apparently you can run corner cases by running Shift + Ctrl + F10**


#todo : May want to see how we can use IntelliJ's Unit test features to automate testing. [[automated unit test]].


**Once you change the name of a class variable, you can make use of Alt + enter to show context options to have a better solution in place**

**Use Shift + F6 to rename and let intelliJ help you rename for better connection**








