import java.util.Arrays;

class FindMinMax {
    public int min;
    public int max;

    public static void main(String[] args) {
        FindMinMax minmax = new FindMinMax();
        int arr[] = { 1000, 11, 445, 1, 330, 3000 };
        int arr_size = arr.length;
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[arr_size - 1];
        System.out.println("Minimum element is " + minmax.min);
        System.out.println("Maximum element is " + minmax.max);
    }
}


