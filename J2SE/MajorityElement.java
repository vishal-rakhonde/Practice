public class MajorityElement {
    
    public static int majorityElement(int[] nums) {
        int candidate = -1, count = 0;
        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        System.out.println("Majority Element in nums1: " + majorityElement(nums1)); 
        
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element in nums2: " + majorityElement(nums2));  
    }
}
