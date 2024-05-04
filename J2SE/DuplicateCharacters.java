//How to print the duplicate characters from the given String?
public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "hello";
        printDuplicates(inputString);
    }

    public static void printDuplicates(String s) {
        char[] characters = s.toCharArray();
        boolean[] visited = new boolean[256]; // Assuming ASCII characters

        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                for (int j = i + 1; j < characters.length; j++) {
                    if (currentChar == characters[j]) {
                        System.out.println(currentChar);
                        break;
                    }
                }
            }
        }
    }
}
