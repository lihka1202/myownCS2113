Allows you to store a collection of key-value pairs

```java
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Point> points = new HashMap<>();

        // put the key-value pairs in the HashMap
        points.put("x1", new Point(0, 0));
        points.put("x2", new Point(0, 5));
        points.put("x3", new Point(5, 5));
        points.put("x4", new Point(5, 0));

        // retrieve a value for a key using the get method
        print("Coordinates of x1: " + pointAsString(points.get("x1")));

        // check if a key or a value exists
        print("Key x1 exists? " + points.containsKey("x1"));
        print("Key x1 exists? " + points.containsKey("y1"));
        print("Value (0,0) exists? " + points.containsValue(new Point(0, 0)));
        print("Value (1,2) exists? " + points.containsValue(new Point(1, 2)));

        // update the value of a key to a new value
        points.put("x1", new Point(-1,-1));

        // iterate over the entries
        for (Map.Entry<String, Point> entry : points.entrySet()) {
            print(entry.getKey() + " = " + pointAsString(entry.getValue()));
        }

        print("Number of keys: " + points.size());
        points.clear();
        print("Number of keys after clearing: " + points.size());

    }

    public static String pointAsString(Point p) {
        return "[" + p.x + "," + p.y + "]";
    }

    public static void print(String s) {
        System.out.println(s);
    }
}

```