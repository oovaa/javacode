public class MinimumOperationstoMaketheArrayIncreasing {

  public static void main(String[] args) {
    int[] nums = { 1, 5, 2, 4, 1 };
  }

  static int minOperations(int[] nums) {
    
    int ans = 0;
   for (int i = 1; i < nums.length; i++) {
    if (nums[i] < nums[i-1]) {
        ans ++;
    }
   }
    return ans;
  }
}
