import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.next();
        System.out.printf("Hello, %s.", userName);
        System.out.println("What is your full name?");

    }

}
