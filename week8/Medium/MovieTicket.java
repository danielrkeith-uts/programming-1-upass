public class MovieTicket implements Ticket {
    private String movie;
    private double price;

    public MovieTicket(String movie, double price) {
        this.movie = movie;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Movie: " + movie + " ($" + getPrice() + ")";
    }
}
