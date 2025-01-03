//remove duplicate from string and count element occurence
public class RemoveDuplicatesAndCount {
    public static void main(String[] args) {
        String str = "programming";
        int[] count = new int[256];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (count[ch] == 0) {
                result.append(ch);
            }
            count[ch]++;
        }

        System.out.println("String without duplicates: " + result.toString());
        System.out.println("Character counts:");
        for (int i = 0; i < result.length(); i++) {
            char ch = result.charAt(i);
            System.out.println(ch + ": " + count[ch]);
        }
    }
}