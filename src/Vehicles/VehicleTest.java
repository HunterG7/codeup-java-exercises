package Vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setName("Truck");
        String vehicle1Noise = vehicle1.makeNoise();
        System.out.println(vehicle1.getName() + " goes " + vehicle1Noise);

        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.setName("Harley");
        String motorcycle1Noise = motorcycle1.makeNoise();
        System.out.println(motorcycle1.getName() + " goes " + motorcycle1Noise);
    }
}
