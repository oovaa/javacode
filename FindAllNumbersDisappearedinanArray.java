import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

  public static void main(String[] args) {
    int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
    List<Integer> l = findDisappearedNumbers(nums);
    System.out.println(l);
  }

  static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    boolean[] present = new boolean[nums.length + 1];
    for (int num : nums) {
      present[num] = true;
    }
    for (int i = 1; i < present.length; i++) {
      if (!present[i]) {
        ans.add(i);
      }
    }
    return ans;
  }
}
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:
// Input: nums = [1,1]
// Output: [2]
