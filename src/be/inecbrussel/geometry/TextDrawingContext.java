package be.inecbrussel.geometry;

public class TextDrawingContext implements DrawingContext{



    @Override
    public void draw(Rectangle rectangle) {
        System.out.println("draw rectangle with length:"+ rectangle.getLength()+" width:"+
                rectangle.getWidth()+" position x:"+rectangle.getX()+" y:"+rectangle.getY());
        System.out.println(rectangle);

    }

    @Override
    public void draw(Circle circle) {
        System.out.println("draw circle with length:"+ circle.getRadius()+" position x:"+circle.getX()+" y:"+circle.getY());
        System.out.println(circle);

    }

    @Override
    public void draw(Triangle triangle) {
        System.out.println("draw triangle with height:"+ triangle.getHeight()+" width:"+
               triangle.getWidth()+"perpendicular:"+triangle.getPerpendicular()+" position x:"+triangle.getX()+" y:"+triangle.getY());
        System.out.println(triangle);
    }
}
