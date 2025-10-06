public class Runner {

    public static void main(String[] args) {
        Coordinate c1 = new Coordinate(4, 3);
        Coordinate c2 = new Coordinate(3, 4);

        System.out.println("Magnitude of " + c1 + ": " + c1.magnitude());
        System.out.println("Distance from " + c1 + " to " + c2 + ": " + c1.distanceTo(c2));
        
        Coordinate normalisedC1 = c1.normalised();
        System.out.println(c1 + " normalised: " + normalisedC1);
    }

}
