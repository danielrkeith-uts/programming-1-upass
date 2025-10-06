class Menti {

    private static boolean myFunction(int[] arr) {
        for (int n : arr) {
            if (n % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] testArr = new int[] {1, 3, 5, 7, 9};
        System.out.println(myFunction(testArr));
    }
}
