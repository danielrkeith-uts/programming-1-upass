public class Runner {

    public static void main(String[] args) {
        Ticket movieTicket = new MovieTicket("The Darjeeling Limited", 50);
        Ticket planeTicket = new PlaneTicket("F014", 15_000);

        System.out.println(movieTicket);
        System.out.println(planeTicket);
    }

}
