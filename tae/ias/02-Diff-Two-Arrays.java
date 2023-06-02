import java.util.Arrays;
import java.util.stream.*;

class DiffArray {
    private static int[] diffArray(int[] arr1, int[] arr2) {
        final int[] concat = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, concat, 0, arr1.length);
        System.arraycopy(arr2, 0, concat, arr1.length, arr2.length);
        // filter functions with stream, so we convert the initial array
        // IntStream.of().anyMatch() works like js' includes method
        // eventually with toArray() we convert the stream
        final int[] res = Arrays.stream(concat).filter(x -> !IntStream.of(arr1).anyMatch(el -> el == x) || !IntStream.of(arr2).anyMatch(el -> el == x)).toArray();
        return res;
    }

    public static void main(String[] args) {
        final int[] list1 = {1, 2, 3, 5};
        final int[] list2 = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(diffArray(list1, list2)));
    }
}