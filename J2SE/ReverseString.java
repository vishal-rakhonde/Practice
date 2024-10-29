public class ReverseString {
    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "vishal!";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}
