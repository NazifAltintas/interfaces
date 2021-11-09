package be.inecbrussel.geometry;

import java.util.Objects;

public class Triangle extends Shape{
    public static final int ANGLES = 3;
    private static int count;
    private double height;
    private double width;
    private double perpendicular;

    public Triangle() {
        this(0,0,0);
    }

    public Triangle(double height, double width, double perpendicular) {
        this(height,width,perpendicular,0,0);
    }

    public Triangle(double height, double width, double perpendicular, int x, int y) {
        super(x, y);
        this.height = height;
        this.width = width;
        this.perpendicular = perpendicular;
        count++;
    }

    public Triangle(Triangle triangle) {
        this(triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    public static int getCount() {
        return count;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(double perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return ((double)height*width) / 2;
    }

    @Override
    public double getPerimeter() {
        // Not wasting time figuring this out
        return 1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && width == triangle.width && perpendicular == triangle.perpendicular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width, perpendicular);
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }

    @Override
    public void scale(int s) {
        setHeight((getHeight()/100)*s);
        setWidth((getWidth()/100)*s);
        setPerpendicular((getPerpendicular()/100)*s);

    }

    @Override
    public void scaleDouble() {
        setHeight((getHeight()*2));
        setWidth((getWidth()*2));
        setPerpendicular((getPerpendicular()*2));

    }

    @Override
    public void scaleHalf() {
        setHeight((getHeight()*0.5));
        setWidth((getWidth()*0.5));
        setPerpendicular((getPerpendicular()*0.5));

    }
}
