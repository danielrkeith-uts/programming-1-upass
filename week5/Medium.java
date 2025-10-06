public class Medium {

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    private static int largestPrimeUnder(int num) {
        for (int i = num; i > 1; i--) {
            if (isPrime(i)) return i;
        }

        // No primes under this number?
        return -1;
    }

    public static void main(String[] args) {

        System.out.println(largestPrimeUnder(1_000_000));

    }

}
