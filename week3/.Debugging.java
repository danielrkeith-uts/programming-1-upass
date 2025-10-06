import java.util.Scanner;

class Debugging {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x = s.nextInt() + 3;

        System.out.println("Hello 41039");

        if (x < 6) {
            System.out.println("a");
        }
        else {
            System.out.println("b");
        }

        System.out.println(x < 6 ? "a" : "b");

    }
}
