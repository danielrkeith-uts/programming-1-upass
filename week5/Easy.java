public class Easy {
    
    private static int sum(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 100};

        System.out.println(sum(numbers));
    }

}
