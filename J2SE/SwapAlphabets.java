public class SwapAlphabets {

    public static void main(String[] args) {
        char[] arr1 = {'a', 'b', 'c', 'd', 'A', '$'};
        swapAlphabets(arr1);
        System.out.println(arr1);  // Output: [A, d, c, b, a, $]

        char[] arr2 = {'a', 'b', 'c', 'D', '$', 'e', '!', 'f'};
        swapAlphabets(arr2);
        System.out.println(arr2);  // Output: [f, e, D, c, $, b, !, a]
    }

    public static void swapAlphabets(char[] arr) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            while (start < end && !isAlphabet(arr[start])) {
                start++;
            }

            while (start < end && !isAlphabet(arr[end])) {
                end--;
            }

            if (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    public static boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
}
