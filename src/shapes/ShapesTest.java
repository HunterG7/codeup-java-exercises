package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.printf("Box1 Area: %s%n", box1.getArea());
        System.out.printf("Box1 Perimeter: %s%n", box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("Box2 Area: %s%n", box2.getArea());
        System.out.printf("Box2 Perimeter: %s%n", box2.getPerimeter());
    }
}
