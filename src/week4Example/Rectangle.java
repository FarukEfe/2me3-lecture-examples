package week4Example;

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super("Rectangle");
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width) throws InvalidShapeException {
        super("Rectangle");
        if (length <= 0 || width <= 0) {
            throw new InvalidShapeException();

        }
        this.length = length;
        this.width = width;
    }

    // Implementing the area method
    @Override
    public double area() {
        return length * width;
    }
}