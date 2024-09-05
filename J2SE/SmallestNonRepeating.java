public class SmallestNonRepeating {

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {10, -4, 2, 0, -2, 3, 7};
        int[] arr2 = {7, 3, -4, 0, 3, 2};
        System.out.println(findSmallestNonRepeating(arr1, arr2)); // Output: 10

        // Test case 2
        int[] arr1_2 = {-2, 5, 1, -10, 5};
        int[] arr2_2 = {-2, -10};
        System.out.println(findSmallestNonRepeating(arr1_2, arr2_2)); // Output: 1
    }

    public static int findSmallestNonRepeating(int[] arr1, int[] arr2) {
        int smallest = Integer.MAX_VALUE;
        boolean found;

        for (int i = 0; i < arr1.length; i++) {
            found = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found && arr1[i] < smallest) {
                smallest = arr1[i];
            }
        }

        return smallest;
    }
}
