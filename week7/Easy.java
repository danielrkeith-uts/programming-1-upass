import java.util.LinkedList;
import java.util.Scanner;

public class Easy {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        int input = sc.nextInt();
        while (input != -1) {
            list.add(input);
            input = sc.nextInt();
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }

}
