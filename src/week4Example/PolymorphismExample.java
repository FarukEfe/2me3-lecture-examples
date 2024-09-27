package week4Example;

import java.util.List;
import java.util.ArrayList;

public class PolymorphismExample {
    public static void main(String[] args) {
        
        List<Shape> shapes = new ArrayList<>();
        // Creating instances of shapes
        Square square = new Square(4);
        Circle circle = new Circle(8 / Math.PI);
        Rectangle rectangle = new Rectangle();
        try {
            rectangle = new Rectangle(2, 6);
        } catch (InvalidShapeException err) {
            System.out.println("Unable to create desired shape, please reconsider dims");
        } finally {
            shapes.add(rectangle);
            // Finding the shape with the largest area
            shapes.add(square);
            shapes.add(circle);

            Shape largestShape = ShapeUtils.largestArea(shapes);
            System.out.println("Largest shape: " + largestShape + " with area: " + largestShape.area());
        }
    }
}
