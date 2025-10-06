import java.util.List;

public class Runner {
    
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
            new Motorbike(),
            new Car(),
            new Truck()
        );

        for (Vehicle vehicle : vehicles) {
            System.out.println("This vehicle has " + vehicle.getNumberOfWheels() + " wheels");
            vehicle.drive();
        }
    }

}
