import java.io.*;
import java.util.Scanner;

public class Hard {

    private static char atbash(char letter) {
        return (char) ('a' + 'z' - letter);
    }

    private static String atbash(String word) {
        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            letters[i] = atbash(letters[i]);
        }

        return new String(letters);
    }

    public static void main(String[] args) {

        try (
            Scanner sc = new Scanner(new File("input/hard.in"));
            PrintWriter pw = new PrintWriter("output/hard.out")
        ) {

            boolean isNextLineEncoded = false;
            while (sc.hasNextLine()) {

                String rawWord = sc.nextLine();
                String processedWord = isNextLineEncoded ? atbash(rawWord) : rawWord;
                pw.println(processedWord);

                isNextLineEncoded = !isNextLineEncoded;
            }

        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

    }

}
