//public class Main {
//    public static void main(String[] args) {
//        // create a todo task and print details
//        Todo t = new Todo("Read a good book");
//        System.out.println(t.getDescription());
//        System.out.println(t.isDone());
//
//        // change todo fields and print again
//        t.setDone(true);
//        System.out.println(t.isDone());
//
//        // create a deadline task and print details
//        Deadline d = new Deadline("Read textbook", "Nov 16");
//        System.out.println(d.getDescription());
//        System.out.println(d.isDone());
//        System.out.println(d.getBy());
//
//        // change deadline details and print again
//        d.setDone(true);
//        d.setBy("Postponed to Nov 18th");
//        System.out.println(d.isDone());
//        System.out.println(d.getBy());
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // create a todo task and print it
//        Todo t = new Todo("Read a good book");
//        System.out.println(t);
//
//        // change todo fields and print again
//        t.setDone(true);
//        System.out.println(t);
//
//        // create a deadline task and print it
//        Deadline d = new Deadline("Read textbook", "Nov 16");
//        System.out.println(d);
//
//        // change deadline details and print again
//        d.setDone(true);
//        d.setBy("Postponed to Nov 18th");
//        System.out.println(d);
//    }
//}

//public class Main {
//    public static Shape[] shapes = new Shape[100];
//    public static int shapeCount = 0;
//    public static void addShape(Shape S) {
//        shapes[shapeCount]=S;
//        shapeCount+=1;
//    }
//
//    public static void printAreas() {
//        for(int i = 0; i<shapeCount;i+=1) {
//            System.out.println(shapes[i].area());
//        }
//    }
//
//    public static void main(String[] args) {
//        addShape(new Circle(5));
//        addShape(new Rectangle(3, 4));
//        addShape(new Circle(10));
//        printAreas();
//        addShape(new Rectangle(4, 4));
//        printAreas();
//    }
//}

public class Main {

    public enum Priority {
        HIGH, MEDIUM, LOW
    }
    public static void describe(String colour, Priority status) {
        switch(status) {
        case HIGH :
            System.out.println(colour + " indicates high priority");
            break;
        case MEDIUM :
            System.out.println(colour + " indicates medium priority");
            break;
        case LOW:
            System.out.println(colour + " indicates low priority");
            break;
        }
    }

    public static void main(String[] args) {
        describe("Red", Priority.HIGH);
        describe("Orange", Priority.MEDIUM);
        describe("Blue", Priority.MEDIUM);
        describe("Green", Priority.LOW);
    }
}


