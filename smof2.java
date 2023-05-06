public class smof2 {

  public static void main(String[] args) {
    int[] test = { 2, 4, 11, 3 };

    int[] ans = twoSum(test, 6);

    for (int i : ans) {
      System.out.print(i + " ");
    }
  }

  public static int[] twoSum(int[] nums, int target) {
    int i = 0;
    int j = 0;
    //flag
    outter:for (i = 0; i < nums.length; i++) {
      for (j = 0; j < nums.length; j++) {
        if (i == j) {
          continue;
        }
        if ((nums[i] + nums[j]) == target) {
          break outter;
        }
      }
    }
    return new int[] { i, j };
  }
}
