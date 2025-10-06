import java.util.Scanner;

public class Easy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        if (!word.contains("e")) {
            throw new NoEException();
        }
        
    }

}
