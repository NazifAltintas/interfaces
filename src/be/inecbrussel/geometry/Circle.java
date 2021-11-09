package be.inecbrussel.geometry;

public class Circle extends Shape {
    public static final int ANGLES = 0;
    private static int count;
    private double radius;

    {
        count++;
    }

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this(radius, 0, 0);
    }

    public Circle(double radius, int x, int y) {
        super(x, y);
        setRadius(radius);
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void grow(int d) {
        setRadius(radius * d);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);

    }

    @Override
    public void scale(int s) {
    setRadius(getRadius()/100*s);
    }

    @Override
    public void scaleDouble() {
        setRadius(getRadius()*2);

    }

    @Override
    public void scaleHalf() {
        setRadius(getRadius()*0.5);

    }
}
