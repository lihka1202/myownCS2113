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

//public class Main {
//
//    public static void printObjects(Printable[] items) {
//        for (Printable p : items) {
//            p.print();
//        }
//    }
//
//    public static void main(String[] args) {
//        Printable[] printableItems = new Printable[]{
//                new Circle(5),
//                new Rectangle(3, 4),
//                new Person("James Cook")};
//
//        printObjects(printableItems);
//    }
//}


public class Main {

    public static void printArea(String descriptor){
        //TODO: modify the code below

        try {
            System.out.println(descriptor + "=" + calculateArea(descriptor));
        } catch(NumberFormatException e) {
            System.out.println("WIDTH or HEIGHT is not a number: " + descriptor);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("WIDTH or HEIGHT is missing: " + descriptor);
        } catch(IllegalShapeException e) {
            System.out.println("Too many dimensions: " + descriptor);
        }

    }

    private static int calculateArea(String descriptor) throws IllegalShapeException {
        //TODO: modify the code below
        String[] dimensions = descriptor.split("x");
        if(dimensions.length>2) {
            throw new IllegalShapeException();
        }
        return Integer.parseInt(dimensions[0]) * Integer.parseInt(dimensions[1]);
    }

    public static void main(String[] args) {
        printArea("3x4");
        printArea("3xy");
        printArea("3x");
        printArea("3");
        printArea("3x4x5");
    }
}
