import java.util.Scanner;

public class MethodsExercises {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1
        int one = add(4, 2);
        System.out.println(one);

        int two = subtract(4, 2);
        System.out.println(two);

        int three = multiply(4, 8);
        System.out.println(three);

        int four = divide(4, 2);
        System.out.println(four);

        int five = modulus(4, 2);
        System.out.println(five);

        int six = multiplyByAdd(-4, -2);
        System.out.println(six);

        int seven = multiplyByAddUsingRecursion(-4, -2);
        System.out.println(seven);

        //2
        int min = -25;
        int max = 6;
        String eight = getInteger(min, max);
        System.out.println(eight);

        //3
        getFactorial();
        getFactorialUsingRecursion();

        //4
        diceRoll();
    }

    //1
    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int divide(int dividend, int divisor){
        return dividend / divisor;
    }

    public static int modulus(int dividend, int divisor){
        return dividend % divisor;
    }

    // no recursion
    public static int multiplyByAdd(int num1, int num2){
        int product = 0;
        for (int i = 0; i < num2; i++){
            product += num1;
        }
        return product;
    }

    // with recursion
    public static int multiplyByAddUsingRecursion(int num1, int num2){
        if (num1 == 0|| num2 == 0) return 0;
        if (num1 < 0 && num2 < 0){
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);
        }
        if (num1 < 0 || num2 < 0){
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);
            return -(num1 + multiplyByAdd(num1, num2 - 1));
        }
        return num1 + multiplyByAdd(num1, num2 - 1);
    }

    //2
    public static String getInteger(int min, int max) {
        System.out.printf("Please enter an integer between %s and %s:%n", min, max);
        String userIntStr = sc.nextLine();
        int userInt = Integer.parseInt(userIntStr);
        if (!(userInt >= min && userInt <= max)){
            getInteger(min,max);
        }
        return "Thank you";
    }

    //3
    // no recursion
    public static void getFactorial(){
        System.out.println("Please enter a number between 1 and 10: ");
        String userIntStr = sc.nextLine();
        int userInt = Integer.parseInt(userIntStr);
        if (!(userInt >= 1 && userInt <= 10)){
            getFactorial();
        }
        String choice;
        do {

            for (long i = 1; i <= userInt; i++) {
                long factorial = i;
                System.out.printf("%s! = 1 ", factorial);
                for (long j = 1; j <= i; j++) {
                    factorial *= j;
                    if (j != 1) {
                        System.out.printf("x %s ", j);
                    }
                }
                System.out.printf("  = %s%n", factorial);
            }
            System.out.println("Would you like to continue? [y/N]");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("y"));
    }

    // with recursion
    public static void getFactorialUsingRecursion(){}

    //4
    public static void diceRoll (){
        System.out.println("Give me a number of sides for a pair of dice: ");
        String diceSidesStr = sc.nextLine();
        int diceSides = Integer.parseInt(diceSidesStr);
        System.out.printf("Your first di rolled a %s.%nYour second di rolled a %s", randomNum(diceSides), randomNum(diceSides));
    }
    public static int randomNum (int num){
        return (int)((Math.random() * (num)) + 1);
    }

}
