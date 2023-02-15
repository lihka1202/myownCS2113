You can organize all your types into a single unit called **packages**. This makes them much easier to export and import, while also ensuring that data is kept in an orderly manner.

**To create a package, you put a package statement at the very top of every source file in that package.**


*There can only be one package statement in each source file?* Wait then what if you need to use functions from multiple packages, how does that go?

*The package of a type must match the folder path of the source file*

The `Formatter` class below (in `<source folder>/seedu/tojava/util/Formatter.java` file) is in the package `seedu.tojava.util`. When it is compiled, the `Formatter.class` file will be in the location `<compiler output folder>/seedu/tojava/util`:

```java
package seedu.tojava.util;

public class Formatter {
    public static final String PREFIX = ">>";

    public static String format(String s){
        return PREFIX + s;
    }
}

```

**Package names are all written in lower case, not camel case**, using the *dot* as a separator.

Packages in the java language itself begin with **java.** or **javax.**. Companies use their reversed Internet domain name to begin their package names.

For example, `com.foobar.doohickey.util` can be the name of a package created by a company with a domain name `foobar.com`.

To use a **public package** member from the outside, its packages, you must do one of the following:
- **Use the fully qualified name** to refer to the packages
- Import the package or the specific package member


The `Main` class below has two import statements:
-   `import seedu.tojava.util.StringParser`: imports the class `StringParser` in the `seedu.tojava.util` package
-   `import seedu.tojava.frontend.*`: imports all the classes in the `seedu.tojava.frontend` package

```java
package seedu.tojava;

import seedu.tojava.util.StringParser;
import seedu.tojava.frontend.*;

public class Main {

    public static void main(String[] args) {

        // Using the fully qualified name to access the Processor class
        String status = seedu.tojava.logic.Processor.getStatus();

        // Using the StringParser previously imported
        StringParser sp = new StringParser();

        // Using classes from the tojava.frontend package
        Ui ui = new Ui();
        Message m = new Message();

    }
}


```

**Note that package import is not recursive, ie importing a package does not import the subpackages**
as packages do not behave as hierarchies despite appearances.

**If you do not use a package statement, your type doesn't have a package** -- a practice not recommended (except for small code examples) as it is not possible for a type in a package to import a type that is not in a package.

**Optionally, a _static import_ can be used to import static members of a type** so that the imported members can be used without specifying the type name. *what does this mean? you can use the members without using the type name each time*

```java
import static seedu.tojava.util.Formatter.PREFIX;
import static seedu.tojava.util.Formatter.format;

public class Main {

    public static void main(String[] args) {

        String formatted = format("Hello");
        boolean isFormatted = formatted.startsWith(PREFIX);
        System.out.println(formatted);
    }
}

```

If the `seedu.tojava.Main` class is defined in the file `Main.java`,

-   when compiling from the `<source folder>`, the command is:  
    `javac seedu/tojava/Main.java`
-   when running it from the `<compiler output folder>`, the command is:  
    `java seedu.tojava.Main`

## how to turn something into a package

Just right click to add a new package and add these into the package spectrum
