//Write a Java program to find all the leaders in an integer array?


import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {

    public static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        if (n == 0) {
            return leaders;
        }

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = findLeaders(arr);
        
        System.out.println("Leaders in the array: " + leaders);
    }
}
