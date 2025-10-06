public class Medium {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 100, 200, 300, 42, -28};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The number in position " + (i + 1) + " is " + numbers[i]);
            sum += numbers[i];
        }

        float average = sum / (float) numbers.length;

        System.out.println("Average: " + average);

    }
}
