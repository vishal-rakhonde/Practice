public class DescendingIndex {
    
    public static int findDescendingIndex(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 2};
        int index = findDescendingIndex(arr);
        if (index != -1) {
            System.out.println("Array starts descending from index: " + index);
        } else {
            System.out.println("Array is not descending at any index.");
        }
    }
}
