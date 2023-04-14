package dogMiniExercise;

public class Quote {
    public static String randomQuote(){
        int randomNum = (int) ((Math.random() * 4) + 1);
        switch (randomNum){
            case 1:
                return "\"I won’t get upset at you about a mistake. I’ll get upset at you for the next mistake that comes from still thinking about the last mistake.\"\n";
            case 2:
                return "\"Champions keep playing until they get it right. Then they play more.\"\n";
            case 3:
                return "\"Athletics are really the foundation of how kids' attitudes are formed and shaped. And that has to work with the coach and the parents.\"\n";
            case 4:
                return "\"The growth mindset says all of these things can be developed. All – you, your partner, and the relationship – are capable of growth and change.\"\n";
            default:
                return "\"Success is not final; failure is not fatal: It is the courage to continue that counts.\"\n";
        }
    }

}
