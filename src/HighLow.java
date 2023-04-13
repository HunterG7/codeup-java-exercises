import java.util.Scanner;

public class HighLow {

    // Game Rules:
//        1. Game picks a random number between 1 and 100.
//        2. Prompts user to guess the number.
//        3. All user inputs are validated.
//        4. If user's guess is less than the number, it outputs "HIGHER".
//        5. If user's guess is more than the number, it outputs "LOWER".
//        6. If a user guesses the number, the game should declare "GOOD GUESS!"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String keepingGuessing;
        String keepPlaying;

        do {
            int randomNum = randomNum(2, 0);
            int guessCount = 1;
            System.out.println("Random Number: " + randomNum);

            do {
                System.out.println("Please guess a number between 1 and 100: ");
                int userGuess = sc.nextInt();
                sc.nextLine();

                if (userGuess == randomNum) {
                    if (guessCount != 1){
                        System.out.printf("GOOD GUESS! You guessed the number in %s guesses.%n", guessCount);
                    } else {
                        System.out.printf("AMAZING GUESS! You guessed the number in %s guess.%n", guessCount);
                    }
                    break;
                } else if (userGuess < randomNum) {
                    System.out.println("HIGHER");
                    guessCount++;
                } else {
                    System.out.println("LOWER");
                    guessCount++;
                }

                System.out.println("Do you want to continue guessing? [y/N]");
                keepingGuessing = sc.nextLine();
            } while (keepingGuessing.equalsIgnoreCase("y"));

            System.out.println("Do you want to play again? [y/N]");
            keepPlaying = sc.nextLine();
        } while (keepPlaying.equalsIgnoreCase("y"));
    }

    public static int randomNum (int max, int min){
        return (int)((Math.random() * (max - min + 1)) + min);
    }
}
