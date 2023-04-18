package Vehicles;

public class Garage {

    Vehicle[] vehicles;

    public void alarmCascade(){
        for (Vehicle vehicle : this.vehicles){
            vehicle.makeNoise();
        }
    }
}
