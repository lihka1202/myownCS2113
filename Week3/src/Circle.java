public class Circle {
    private int x;
    private int y;
    private double radius;
    private static double maxRadius = 0;
    public Circle(int x, int y, double radius){
        setX(x);
        setY(y);
        setRadius(radius);
    }
    public Circle() {
        this(0,0,0);
    }
    public static double getMaxRadius() {
        return maxRadius;
    }
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius,2));
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if(radius>0) {
            this.radius = radius;
        }
        else {
            this.radius = 0;
        }
        if(this.radius > maxRadius)
        {
            maxRadius = this.radius;
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
