public class MinimumAbsoluteDifferenceQueries {

  public static void main(String[] args) {
    int[] nums = { 1, 3, 4, 8 };
    int[][] queries = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 } };
    int[] ans = minDifference(nums, queries);
    for (int i : ans) {
      System.out.println(i);
    }
  }

  public static int[] minDifference(int[] nums, int[][] queries) {
    int[] ans = new int[nums.length];
    for (int i = 0; i < queries.length; i++) {
            System.out.println(nums[queries[i][0]] +" - "+nums[queries[i][1]]);
      ans[i] = Math.abs(nums[queries[i][0]] - nums[queries[i][1]]);
    }
    return ans;
  }
}
