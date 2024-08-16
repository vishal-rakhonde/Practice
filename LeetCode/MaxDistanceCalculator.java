/* Maximum Distance in Arrays

You are given m arrays, where each array is sorted in ascending order.

You can pick up two integers from two different arrays (each array picks one) and calculate the distance. We define the distance between two integers a and b to be their absolute difference |a - b|.

Return the maximum distance.

 

Example 1:
Input: arrays = [[1,2,3],[4,5],[1,2,3]]

Output: 4
Explanation: One way to reach the maximum distance 4 is to pick 1 in the first or third array and pick 5 in the second array.

Example 2:
Input: arrays = [[1],[1]]

Output: 0
 

Constraints:
m == arrays.length
2 <= m <= 105
1 <= arrays[i].length <= 500
-104 <= arrays[i][j] <= 104
arrays[i] is sorted in ascending order.
There will be at most 105 integers in all the arrays
*/
import java.util.*;

class MaxDistanceCalculator {
    public int maxDistance(List<List<Integer>> arrays) {
        int maxD = 0;
        int minElement = arrays.get(0).get(0); // Initialize first element of the first array
        int maxElement = arrays.get(0).get(arrays.get(0).size() - 1); // Initialize last element of the first array
        
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> currArray = arrays.get(i);
            // Calculate minimum distance between smallest element and the last element of current array
            int disMin = Math.abs(currArray.get(0) - maxElement);
            // Calculate maximum distance between largest element and the first element of current array
            int disMax = Math.abs(currArray.get(currArray.size() - 1) - minElement);
            maxD = Math.max(maxD, Math.max(disMin, disMax));
            minElement = Math.min(minElement, currArray.get(0));
            maxElement = Math.max(maxElement, currArray.get(currArray.size() - 1));
        }
        return maxD;
    }

    public static void main(String[] args) {
        MaxDistanceCalculator calculator = new MaxDistanceCalculator();
        List<List<Integer>> arrays = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(1, 2, 3)
        );
        
        int result = calculator.maxDistance(arrays);
        System.out.println("The maximum distance is: " + result);
    }
}
