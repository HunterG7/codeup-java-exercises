package dogMiniExercise;

public class DogPark {
    public static void dogNoise(Dog dog){
        dog.makeNoise();
    }
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

        Dog mrHusky = new Husky();
        mrHusky.setName("Mr. Husky");
        Dog mrDog = new Dog();
        mrDog.setName("Mr. Dog");

        dogNoise(mrHusky);
        dogNoise(mrDog);
    }
}
