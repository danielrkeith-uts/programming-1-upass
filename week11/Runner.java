import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        QuadraticEquation qa;
        try {
            qa = new QuadraticEquation(a, b, c);
        } catch (NotAQuadraticException e) {
            System.err.println("Not a quadratic");
            return;
        }

        System.out.println(qa);

        try {
            System.out.println(qa.solve());
        } catch (NoSolutionsException e) {
            System.err.println("No solution");
            return;
        }

    }

}
