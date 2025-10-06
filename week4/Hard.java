import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.nextLine();

        char[][] words = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a " + n + "-letter word: ");
            String word = sc.nextLine();
            words[i] = word.toCharArray();
        }

        for (int i = 0; i < n; i++) {
            String line = "";

            for (int j = 0; j < n; j++) {
                line += words[j][i] + " ";
            }

            System.out.println(line);
        }

    }
}
