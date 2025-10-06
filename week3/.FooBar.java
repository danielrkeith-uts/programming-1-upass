import java.util.Scanner;

class FooBar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println("foobar");
        }
        else if (n % 2 == 0) {
            System.out.println("foo");
        }
        else if (n % 3 == 0) {
            System.out.println("bar");
        }

        switch (n) {
            case 0:
                System.out.println("zero");
                break;
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
                System.out.println("prime");
        }
    }
}
