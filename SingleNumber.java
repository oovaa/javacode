import java.util.Arrays;

public class SingleNumber {

  public static void main(String[] args) {
    int nums[] = { 4, 1, 2, 1, 2 };
    System.out.println(singleNumber(nums));
  }

  static int singleNumber(int[] nums) {
    int ans = 0;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i+=2) {
      System.out.println(nums[i] + " " + nums[i + 1]);
      if (nums[i] != nums[i + 1]) return nums[i];
    }

    return ans;
  }
}
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// Example 1:
// Input: nums = [2,2,1]
// Output: 1
// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4
// Example 3:
// Input: nums = [1]
// Output: 1
