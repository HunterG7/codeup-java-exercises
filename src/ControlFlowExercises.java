import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args){
//        // 1a
//        int i = 5;
//        while (i < 15){
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();
//
//        //1b.1
//        int count2 = 0;
//        do {
//            System.out.print(count2 + " ");
//            count2 += 2;
//        } while (count2 <= 100);
//        System.out.println();
//
//        //1b.2
//        int count5 = 100;
//        do {
//            System.out.print(count5 + " ");
//            count5 -= 5;
//        } while (count5 >= -10);
//        System.out.println();
//
//        //1b.3
//        long squared = 2;
//        do {
//            System.out.println(squared);
//            squared = (int) Math.pow(squared, 2);
//        } while(squared < 1_000_000);
//
//        //1c
//        for (int j = 0; j <= 100; j+=2 ){
//            System.out.print(j + " ");
//        }
//        System.out.println();
//        for (int k = 100; k >= -10; k-=5){
//            System.out.print(k + " ");
//        }
//        System.out.println();
//
        //2
        for (int l = 0; l <= 100; l++){
            if (l % 15 == 0){
                System.out.print("FizzBuzz ");
            } else if (l % 3 == 0){
                System.out.print("Fizz ");
            } else if (l % 5 == 0){
                System.out.print("Buzz ");
            } else {
                System.out.print(l + " ");
            }
        }
        System.out.println();

        //3
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        String userIntStr = sc.nextLine();
        int userInt = Integer.parseInt(userIntStr);

        System.out.println("Would you like to continue? (y/N)");
        String showTable = sc.nextLine();
        if (showTable.equalsIgnoreCase("y")){
            System.out.println("Here is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int m = 1; m <= userInt; m++){
                int square = (int) Math.pow(m, 2);
                int cube = (int) Math.pow(m, 3);
                if (m <= 3){
                    System.out.printf("%s      | %s       | %s%n", m, square, cube);
                } else {
                    System.out.printf("%s      | %s      | %s%n", m, square, cube);
                }
            }
        }

        //4
        System.out.println("Please enter a grade between 0 and 100.");
        String gradeStr = sc.nextLine();
        int grade = Integer.parseInt(gradeStr);
        System.out.println("Would you like to continue? (y/N)");
        String showLetterGrade = sc.nextLine();
        if (showTable.equalsIgnoreCase("y")) {
            if (grade < 60){
                System.out.println("Your grade is a F.");
            } else if (grade < 67){
                System.out.println("Your grade is a D.");
            } else if (grade < 80){
                System.out.println("Your grade is a C.");
            } else if (grade < 88){
                System.out.println("Your grade is a B.");
            } else {
                System.out.println("Your grade is an A.");
            }
        }
    }
}
