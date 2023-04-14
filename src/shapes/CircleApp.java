package shapes;

import util.Input;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input input =  new Input();

        long circleCount = 0;
        boolean choice;
        do {
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            double area = circle.getArea();
            double circumference = circle.getCircumference();
            System.out.printf("Your circle's area is %.2f and its circumference is %.2f.%n", area, circumference);

            choice = input.yesNo();
            circleCount++;
        } while (choice);
        if (circleCount == 1){
            System.out.println("Thank you! You created 1 circle.");
        } else {
            System.out.printf("Thank you! You created %s circles.", circleCount);
        }
    }

}
