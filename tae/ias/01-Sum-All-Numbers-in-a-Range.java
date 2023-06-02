class SumAll {
    private static int sumAll(int[] arr) {
        int n = 0;
        final int min = Math.min(arr[0], arr[1]);
        final int max = Math.max(arr[0], arr[1]);

        for (int i = min; i <= max; i++) {
            n += i;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {80, 40};
        System.out.print(sumAll(nums));
    }
}