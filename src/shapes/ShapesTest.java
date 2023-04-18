package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Rectangle(5,4);
        double perimeter1 = myShape.getPerimeter();
        double area1 = myShape.getArea();
        System.out.printf("Perimeter: %s%nArea: %s%n%n", perimeter1, area1);

        myShape = new Square(5,5);
        double perimeter2 = myShape.getPerimeter();
        double area2 = myShape.getArea();
        System.out.printf("Perimeter: %s%nArea: %s%n", perimeter2, area2);

    }
}
