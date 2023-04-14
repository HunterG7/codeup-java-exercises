public class ServerNameGenerator {
    private static String[] nouns = {"Dog", "Book", "Tree", "Car", "Beach", "Phone", "Flower", "Chair", "Ocean", "Mountain"};
    private static String[] adjectives = {"Energetic", "Mysterious", "Tall", "Sleek", "Sunny", "Modern", "Beautiful", "Comfortable", "Vast", "Majestic"};

    public static String randomString (String[] words){
        int lastIndex = words.length - 1;
        int randomIndex = (int) ((Math.random() * (lastIndex + 1)));
        return words[randomIndex];
    }

    public static void main(String[] args) {
        String randomNoun = randomString(nouns);
        String randomAdjective = randomString(adjectives);
        System.out.printf("Here is your server name:%n%s-%s", randomAdjective, randomNoun);
    }
}
