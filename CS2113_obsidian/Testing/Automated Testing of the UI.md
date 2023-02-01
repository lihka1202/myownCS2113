**Testing**: Operating a system or component under specified conditions, observing or recording the results, and making an evaluation of some aspect of the system or component. –- source: IEEE

![[Pasted image 20230130220731.png]]

Example:
A minimal test case for a browser:
-  **Input** – Start the browser using a blank page (vertical scrollbar disabled). Then, load `longfile.html` located in the `test data` folder.
- **Expected behavior** – The scrollbar should be automatically enabled upon loading `longfile.html`.

**Test cases can be determined based on the specification, reviewing similar existing systems, or comparing to the past behavior of the SUT.**

**SUT** just means software under test

However, a more elaborate test can contain far more features:

-   A unique identifier : e.g. TC0034-a
-   A descriptive name: e.g. vertical scrollbar activation for long web pages
-   Objectives: e.g. to check whether the vertical scrollbar is correctly activated when a long web page is loaded to the browser
-   Classification information: e.g. priority - medium, category - UI features
-   Cleanup, if any: e.g. empty the browser cache.

For each test case, you must do the following:
1.  Feed the input to the SUT
2.  Observe the actual output
3.  Compare actual output with the expected output
**Naturally, a failure is when the expected behavior and the actual behavior differ**. It also indicates a bug/potential defect


# optional
here is another definition of testing:
Software testing consists of the _dynamic_ verification that a program provides _expected_ behaviors on a _finite_ set of test cases, suitably _selected_ from the usually infinite execution domain.

There are some things which need to be noted:
-   _Dynamic_: Testing involves executing the software. It is not by examining the code statically.
-  _Finite_: In most non-trivial cases there are potentially infinite test scenarios but resource constraints dictate that we can test only a finite number of scenarios. *can target the edges cases to ensure the tests are optimal*
-   _Selected_: In most cases it is not possible to test all scenarios. That means we need to select what scenarios to test. *Again test the edge cases only*
-   _Expected_: Testing requires some knowledge of how the software is expected to behave.


# Automated Testing of CLI Applications
The simplest way of *semi automated* CLI testing is to make use of **input/output redirection**

While this doesnt seem that useful, it is great in ensuring 2 things:

1. You feed the app with a sequence of test inputs that is stored in a file while redirecting the output to another file.
2. Next you compare the actual output with another file containing the expected output
