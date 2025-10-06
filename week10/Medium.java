import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medium {

    public static int product(List<Integer> numbers) {
        int product = 1;

        for (int number : numbers) {
            product *= number;
        }

        return product;
    }

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        try (Scanner sc = new Scanner(new File("input/medium.in"))) {

            while (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        try (PrintWriter pw = new PrintWriter("output/medium.out")) {

            pw.println("Numbers: " + numbers);
            pw.println("Product: " + product(numbers));

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

    }

}
