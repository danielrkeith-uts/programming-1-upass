public class Vehicle {
    private int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void drive() {
        System.out.println("Vroom...");
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
}
