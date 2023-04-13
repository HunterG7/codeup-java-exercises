package shapes;

public class Circle {
    // radius
    private double Radius;
    public Circle(double radius) {
        Radius = radius;
    }
    public double getRadius() {
        return Radius;
    }
    public void setRadius(double radius) {
        Radius = radius;
    }

    // methods
    public double getArea(){
        return Math.PI * (this.Radius * this.Radius);
    }
    public double getCircumference(){
       return Math.PI * (2 * this.Radius);
    }


}
