import java.util.Arrays;

public class MedianOfArray {

    public static double findMedian(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        if (length % 2 != 0) {
            return arr[length / 2];
        } else {
            return (arr[(length / 2) - 1] + arr[length / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19, 10};
        System.out.println("Median of the array: " + findMedian(arr));
    }
}
