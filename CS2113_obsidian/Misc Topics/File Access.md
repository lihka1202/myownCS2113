You can use the **java.io.File** class to represent a file object

It can be used to access properties of a file object

```java
import java.io.File;

public class FileClassDemo {

    public static void main(String[] args) {
        File f = new File("data/fruits.txt");
        System.out.println("full path: " + f.getAbsolutePath());
        System.out.println("file exists?: " + f.exists());
        System.out.println("is Directory?: " + f.isDirectory());
    }

}

```

Ensure that the file path is **relative to the file directory**

If you try to use the backlash to represent file data, this might not work as the backlash is an escape sequence character, so you would need 2 different sets of \\ to do this right

Instead you can use the **forward slash instead /**

****You can read from a file using a `Scanner` object that uses a `File` object as the _source_ of data.****

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingDemo {

    private static void printFileContents(String filePath) throws FileNotFoundException {
        File f = new File(filePath); // create a File for the given file path
        Scanner s = new Scanner(f); // create a Scanner using the File as the source
        while (s.hasNext()) {
            System.out.println(s.nextLine());
        }
    }

    public static void main(String[] args) {
        try {
            printFileContents("data/fruits.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

}

```

You can use the java.io.FileWriter Object to write to a class

Note that this also means the file must already be present, as this cannot create new files

```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingDemo {

    private static void writeToFile(String filePath, String textToAdd) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        fw.write(textToAdd);
        fw.close();
    }

    public static void main(String[] args) {
        String file2 = "temp/lines.txt";
        try {
            writeToFile(file2, "first line" + System.lineSeparator() + "second line");
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

}

```

Note that you need to call the `close()` method of the `FileWriter` object for the writing operation to be completed.

You can also run the fileWriter object in Append Mode

```java
private static void appendToFile(String filePath, String textToAppend) throws IOException {
    FileWriter fw = new FileWriter(filePath, true); // create a FileWriter in append mode
    fw.write(textToAppend);
    fw.close();
}

```

Adding true ensures this to run in append mode


**The [`java.nio.file.Files`](https://docs.oracle.com/javase/9/docs/api/java/nio/file/Files.html) is a utility class that provides several useful file operations.** It relies on the [`java.nio.file.Paths`](https://docs.oracle.com/javase/9/docs/api/java/nio/file/Paths.html) file to generate `Path` objects that represent file paths.

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesClassDemo {

    public static void main(String[] args) throws IOException{
        Files.copy(Paths.get("data/fruits.txt"), Paths.get("temp/fruits2.txt"));
        Files.delete(Paths.get("temp/fruits2.txt"));
    }

}

```


