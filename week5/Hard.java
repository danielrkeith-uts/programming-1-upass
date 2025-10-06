public class Hard {

    private static int collatzSteps(int n) {
        if (n == 1) return 0;

        if (n % 2 == 0) {
            return 1 + collatzSteps(n / 2);
        } else {
            return 1 + collatzSteps(3 * n + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(collatzSteps(2));
    }
}
