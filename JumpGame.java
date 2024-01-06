public class JumpGame {

  public static void main(String[] args) {
    int[] nums = { 0,1 };
    boolean i = canJump(nums);
    System.out.println(i);
  }

  static boolean canJump(int[] nums) {
    int maxReach = 0;
    int i = 0;

    while (i < nums.length && i <= maxReach) {
      maxReach = Math.max(maxReach, i + nums[i]);
      i++;

      if (maxReach >= nums.length - 1)
        return true;
    }

    return false;
  }
}
