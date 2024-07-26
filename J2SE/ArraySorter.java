/* Sort an Array

Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 

Constraints:

1 <= nums.length <= 5 * 10^4
-5 * 104 <= nums[i] <= 5 * 10^4
*/

public class ArraySorter {
  public int[] sortArray(int[] nums) {
    var map = new int[100001];

    for (var n : nums)
      map[n + 50000]++;

    var k = 0;
    for (var i = 0; i < 100001; i++)
      for (var j = 0; j < map[i]; j++)
        nums[k++] = i - 50000;

    return nums;
  }

  public static void main(String[] args) {
    ArraySorter sorter = new ArraySorter();
    int[] nums = {5, 1, 1, 2, 0, 0};
    int[] sortedNums = sorter.sortArray(nums);
    for (int num : sortedNums) {
      System.out.print(num + " ");
    }
  }
}
