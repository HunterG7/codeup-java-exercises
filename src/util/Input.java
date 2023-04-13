package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(Scanner scanner) {
        this.scanner = scanner;
    }
    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString(){
        System.out.println("Give me a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Would you like to make another Circle? [y/N]");
        String userYesNo =  scanner.nextLine();
        return userYesNo.equalsIgnoreCase("y") ||
               userYesNo.equalsIgnoreCase("yes") ||
               userYesNo.equalsIgnoreCase("true") ||
               userYesNo.equalsIgnoreCase("t");
    }

    public int getInt(int min, int max){
        System.out.printf("Please enter an integer between the range %s to %s.%n", min, max);
        String userIntStr = scanner.nextLine();
        int userInt = Integer.parseInt(userIntStr);
        if (userInt < min || userInt > max) {
            System.out.printf("That number is not in the range of %s to %s.%n", min, max);
            getInt(min, max);
        }
        return userInt;
    }

    public int getInt(){
        System.out.println("Please enter an integer.");
        String userIntStr = scanner.nextLine();
        return Integer.parseInt(userIntStr);
    }

    public double getDouble(double min, double max){
        System.out.printf("Please enter a number between the range %s to %s.%n", min, max);
        String userDoubleStr = scanner.nextLine();
        double userDouble = Double.parseDouble(userDoubleStr);
        if (userDouble < min || userDouble > max) {
            System.out.printf("That number is not in the range of %s to %s.%n", min, max);
            getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble(){
        System.out.println("Please enter a number for the radius of your circle: ");
        String userDoubleStr = scanner.nextLine();
        return Double.parseDouble(userDoubleStr);
    }





}
