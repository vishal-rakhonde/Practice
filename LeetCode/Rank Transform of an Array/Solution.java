import java.util.*;

public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];

        int[][] valueIndexPairs = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            valueIndexPairs[i][0] = arr[i];
            valueIndexPairs[i][1] = i;
        }

        Arrays.sort(valueIndexPairs, Comparator.comparingInt(a -> a[0]));

        int[] result = new int[arr.length];
        int rank = 1;

        result[valueIndexPairs[0][1]] = rank;
        for (int i = 1; i < arr.length; i++) {
            if (valueIndexPairs[i][0] != valueIndexPairs[i - 1][0]) {
                rank++;
            }
            result[valueIndexPairs[i][1]] = rank;
        }

        return result;
    }
}
