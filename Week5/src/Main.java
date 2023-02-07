//public class Main {
//    private static Shape[] shapes = new Shape[100];
//    private static int shapeCount = 0;
//
//    public static void addShape(Shape s){
//        shapes[shapeCount] = s;
//        shapeCount++;
//    }
//
//    public static void printAreas(){
//        for (int i = 0; i < shapeCount; i++){
//            shapes[i].print();
//        }
//    }
//
//    public static void main(String[] args) {
//        addShape(new Circle(5));
//        addShape(new Rectangle(3, 4));
//        addShape(new Circle(10));
//        addShape(new Rectangle(4, 4));
//        printAreas();
//    }
//}

public class Main {

    public static void printObjects(Printable[] items) {
        for (Printable p : items) {
            p.print();
        }
    }

    public static void main(String[] args) {
        Printable[] printableItems = new Printable[]{
                new Circle(5),
                new Rectangle(3, 4),
                new Person("James Cook")};

        printObjects(printableItems);
    }
}
