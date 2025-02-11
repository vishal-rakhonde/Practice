import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i}; 
				}
            map.put(arr[i], i); 
		}
        return new int[]{}; 
    }
    public static void main(String[] args) {
        int arr[] = {10, 50, 60, 4, 20, 34, 20};
        int target = 40;
        
        int[] result = findTwoSum(arr, target);
        
        if (result.length == 2) {
            System.out.println("Two sum indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}