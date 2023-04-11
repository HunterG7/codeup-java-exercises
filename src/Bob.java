import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        String choice;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Say something to Bob(Please end sentence with punctuation): ");
            String sentence = sc.nextLine();

            if (sentence.endsWith("?")) {
                System.out.println("Bob: \"Sure\" ");
            } else if (sentence.endsWith("!")) {
                System.out.println("Bob: \"Whoa, chill out!\"");
            } else if (sentence.trim().equals("")) {
                System.out.println("Bob: \"Fine. Be that way!\"");
            } else {
                System.out.println("Bob: \"Whatever.\"");
            }

            System.out.println("Would you like to keep talking to Bob? [y/N]");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Bob: \"Goodbye!\"");
    }
}
