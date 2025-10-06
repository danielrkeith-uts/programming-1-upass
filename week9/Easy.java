import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Easy {

    public static void main(String[] args) {
        int sum = 0;

        try (Scanner sc = new Scanner(new File("input/easy.in"))) {
            while (sc.hasNextInt()) {
                sum += sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        System.out.println(sum);
    }

}
