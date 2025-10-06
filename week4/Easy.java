import java.util.Scanner;

public class Easy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int result = 0;

        do {
            result += x; // Equivalent to result = result + x;
            System.out.print("Enter a number: ");
            x = sc.nextInt();
        } while (x != -1);

        System.out.println(result);

    }
}
