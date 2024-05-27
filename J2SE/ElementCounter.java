//Write a Java program to count occurrences of each element in an array?


import java.util.Arrays;

public class ElementCounter {

    public static void countOccurrences(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        int currentElement = array[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (array[i] == currentElement) {
                count++;
            } else {
                System.out.println("Element: " + currentElement + " Count: " + count);
                currentElement = array[i];
                count = 1;
            }
        }

        System.out.println("Element: " + currentElement + " Count: " + count);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        countOccurrences(array);
    }
}
