package Vehicles;

public class Vehicle {
    private String name;

    public String getName() {
        return name;

    }

    public Vehicle(){}

    public Vehicle(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeNoise(){
        return "vroom vroom";
    }

}
