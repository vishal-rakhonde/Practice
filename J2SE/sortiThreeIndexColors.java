/* 

75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
*/

class Solution {
    public void swap(int arr[],int a,int b){
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    public void sortColors(int[] nums) {
      int index = 0;
      int start = 0;
      int end = nums.length -1;
      while(index <= end){
        if(nums[index] == 0){
            swap(nums,index,start);
            index++;
            start++;            

        }
        else if (nums[index] == 2){
            swap(nums,end,index);
            end--;
        }
        else{
            index++;
        }
      }

        
    }
}
