import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        System.out.print("Please enter an integer:");
        int userInt = scanner.nextInt();
        System.out.println("Your integer is " + userInt + ".");

        System.out.print("Please enter three words: ");
        String userString1 = scanner.next();
        String userString2 = scanner.next();
        String userString3 = scanner.nextLine();
        System.out.println("Your first word was " + userString1 + ".");
        System.out.println("Your second word was " + userString2 + ".");
        System.out.println("Your third word was " + userString3 + ".");

        System.out.print("Please enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence: " + userSentence);

        System.out.print("Please enter the length of your classroom: ");
        String length = scanner.nextLine();
        System.out.print("Please enter the width of your classroom: ");
        String width = scanner.nextLine();
        int classroomArea = Integer.parseInt(length) * Integer.parseInt(width);
        System.out.printf("The area of your classroom is %s.%n", classroomArea);
        int classroomPerimeter = (Integer.parseInt(length) * 2) + (Integer.parseInt(width) * 2);
        System.out.printf("The perimeter of your classroom is %s.%n", classroomPerimeter);

        // Bonus Exercises
        scanner.useDelimiter("\n");
        System.out.println("Please enter the length, width, and height of your classroom: ");
        float lengthFloat = scanner.nextFloat();
        float heightFloat = scanner.nextFloat();
        float widthFloat = scanner.nextFloat();
        float volume = lengthFloat * heightFloat * widthFloat;
        System.out.printf("The volume of your classroom is approximately %.2f.%n", volume);

        System.out.println("Please enter your favorite quote: ");
        String userQuote = scanner.nextLine();
        System.out.printf("Your quote: %s%n", userQuote);

        System.out.println("How many words do you think are in your quote?");
        int quoteWordLength = scanner.nextInt();
        System.out.printf("You believe your quote is %s words long.%n", quoteWordLength);

        String[] words = userQuote.split("\\s+");
        if (words.length == quoteWordLength){
            System.out.println("Your are correct!");
        } else {
            System.out.printf("Your quote is actually %s words long.%n", words.length);
        }

        System.out.print("Please enter your top three favorite foods: ");
        String favFood1 = scanner.next();
        String favFood2 = scanner.next();
        String favFood3 = scanner.next();
        String emptyReturnValue1 = scanner.nextLine();
        System.out.printf("Your favorite foods:%n1. %s%n2. %s%n3. %s%n", favFood1, favFood2, favFood3);

        System.out.print("Enter a grocery list of three items(item1,item2,item3): ");
        scanner.useDelimiter(",");
        String grocery1 = scanner.next();
        String grocery2 = scanner.next();
        String grocery3 = scanner.next();
        System.out.printf("Your grocery list has %s, %s, and %s on it.%n", grocery1, grocery2, grocery3);

    }
}
