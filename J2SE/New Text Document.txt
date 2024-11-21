public class SplitEvenCheck {
    public static String isSplitEven(int N) {
        if (N > 2 && N % 2 == 0) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        
        int[] testCases = {1, 2, 3, 4, 6, 8, 10};

        System.out.println("Testing whether numbers can be split into two even integers:");
        for (int N : testCases) {
            System.out.println("N = " + N + " -> " + isSplitEven(N));
        }
    }
}
