public class Pair {

    private double x;
    private double y;

    public Pair(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Pair(double value) {
        x = value;
        y = value;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double sum() {
        return x + y;
    }

    public double difference() {
        return Math.abs(x - y);
    }

    public double product() {
        return x * y;
    }

    public double average() {
        return (x + y) / 2;
    }

    public String toString() {
        return "Values: " + x + ", " + y;
    }

}
