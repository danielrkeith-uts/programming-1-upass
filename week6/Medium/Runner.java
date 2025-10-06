public class Runner {
    
    public static void main(String[] args) {
        Pair p = new Pair(1.1, 3.3);

        System.out.println("x: " + p.getX());
        System.out.println("y: " + p.getY());

        System.out.println("Sum: " + p.sum());
        System.out.println("Difference: " + p.difference());
        System.out.println("Product: " + p.product());
        System.out.println("Average: " + p.average());

        System.out.println(p.toString());
    }

}
