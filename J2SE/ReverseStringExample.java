public class ReverseStringExample {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder stringBuilder = new StringBuilder(original);
        String reversed = stringBuilder.reverse().toString();
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
