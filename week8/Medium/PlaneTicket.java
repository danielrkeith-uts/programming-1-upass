public class PlaneTicket implements Ticket {
    private static final double PRICE_PER_KM = 0.4;

    private String flightCode;
    private double distanceInKm;

    public PlaneTicket(String flightCode, double distanceInKm) {
        this.flightCode = flightCode;
        this.distanceInKm = distanceInKm;
    }

    @Override
    public double getPrice() {
        return distanceInKm * PRICE_PER_KM;
    }

    @Override
    public String toString() {
        return "Flight " + flightCode + " ($" + getPrice() + ")";
    }
}
