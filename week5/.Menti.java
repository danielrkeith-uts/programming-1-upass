public class Menti {
    public static void main(String[] args) {

        int[] numbers = new int[] {5, 2, 87, 25, 6};

        int x = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > x) {
                x = number;
            }
        }

        System.out.println(x);

    }
}
