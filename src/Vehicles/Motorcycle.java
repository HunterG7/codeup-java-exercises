package Vehicles;

public class Motorcycle extends Vehicle {
    public String makeNoise(){
        return "brooom brrooommmm! " + breakingDownNoise();
    }

    public String breakingDownNoise(){
        this.makeNoise();
        return "smash, crash, silence...";
    }
}
