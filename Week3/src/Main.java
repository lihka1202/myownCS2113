public class Main {
    public static void main(String[] args) {
//        Circle c = new Circle();
//        System.out.println("max radius used so far : " + Circle.getMaxRadius());
//        c = new Circle(0, 0, 10);
//        System.out.println("max radius used so far : " + Circle.getMaxRadius());
//        c = new Circle(0, 0, -15);
//        System.out.println("max radius used so far : " + Circle.getMaxRadius());
//        c.setRadius(12);
//        System.out.println("max radius used so far : " + Circle.getMaxRadius());
//        Circle c = new Circle();
//
//        System.out.println(c.getArea());
//        c = new Circle(1, 2, 5);
//        System.out.println(c.getArea());
        Circle c = new Circle(1,2, 5);

        c.setX(4);
        c.setY(5);
        c.setRadius(6);
        System.out.println("x      : " + c.getX());
        System.out.println("y      : " + c.getY());
        System.out.println("radius : " + c.getRadius());
        System.out.println("area   : " + c.getArea());

        c.setRadius(-5);
        System.out.println("radius : " + c.getRadius());
        c = new Circle(1, 1, -4);
        System.out.println("radius : " + c.getRadius());


    }
}
