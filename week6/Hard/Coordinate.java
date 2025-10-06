public class Coordinate {

    private final double x;
    private final double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double magnitude() {
        return Math.sqrt((x * x) + (y * y));
    }

    public double distanceTo(Coordinate other) {
        double xDiff = this.x - other.x;
        double yDiff = this.y - other.y;

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double dotProduct(Coordinate other) {
        return this.x * other.x + this.y * other.y;
    }

    public Coordinate normalised() {
        double magnitude = magnitude();

        double normalisedX = x / magnitude;
        double normalisedY = y / magnitude;

        return new Coordinate(normalisedX, normalisedY);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
