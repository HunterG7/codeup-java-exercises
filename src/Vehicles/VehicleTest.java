package Vehicles;

import java.util.ArrayList;

public class VehicleTest {
    public static void whichNoise(Vehicle vehicle){
        System.out.println(vehicle.makeNoise());
    }
    public static void main(String[] args) {
//      Garage garage = new Garage();
//      garage.vehicles[0] = new Motorcycle();
//      garage.vehicles[1] = new Car();
//      garage.vehicles[2] = new Vehicle();
//
//      garage.alarmCascade();

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Harley"));
        vehicles.add(new Vehicle("Mazda"));
        vehicles.add(new Vehicle("Bullet Train"));
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.getName() + " goes " + vehicle.makeNoise());
        }



    }
}
