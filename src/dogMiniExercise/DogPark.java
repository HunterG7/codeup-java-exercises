package dogMiniExercise;

public class DogPark {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Pearl");
        dog1.setSound("Woof");
        dog1.makeNoise();

        Dog dog2 = new Dog();
        dog2.setName("Rose");
        dog2.setSound("Woooooo");
        dog2.makeNoise();

        Dog dawg = new Dog("Hunter", "hey");
        dawg.makeNoise();
    }
}
