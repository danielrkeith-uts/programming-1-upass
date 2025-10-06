import java.io.*;
import java.util.Scanner;

public class Menti {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(new File(".menti_in.txt"))) {

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

    }

}
