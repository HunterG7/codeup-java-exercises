package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    // constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getters and setters
    public double getLength() {
        return length;
    }
    public abstract void setLength();
    public double getWidth() {
        return width;
    }
    public abstract void setWidth();

    // methods
    public double getPerimeter() {
        return 2 * (length + width);
    }
    public double getArea() {
        return length * width;
    }
}
