package Vehicles;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name) {}

    public Motorcycle(String name, String name1) {
        super(name);
        this.name = name1;
    }

    public String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String makeNoise(){
        return "brooom brrooommmm!";
    }
}
