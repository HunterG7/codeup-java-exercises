package DogMiniExercise;

public class Dog {
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    private String sound;
    public void setSound(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }

    public Dog(){}
    public Dog(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public void makeNoise(){
        System.out.printf("%s goes %s%n", name, Quote.randomQuote());
    }
}
