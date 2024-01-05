public class JumpGame {

  public static void main(String[] args) {
    int[] nums = { 0,1 };
    boolean i = canJump(nums);
    System.out.println(i);
  }

  static boolean canJump(int[] nums) {
    int maxn;
    int i;

    for (i = 0; i < nums.length - 1; i++) {
      maxn = i + 1;
      for (int j = i + 1; j < nums[i]; j++) if (nums[maxn] < nums[j]) maxn = j;

      if (nums[maxn] == 0) return false;

      i = maxn - 1;
      maxn = 0;
    }
    return (i == nums.length - 1) ? true : false;
  }
}
