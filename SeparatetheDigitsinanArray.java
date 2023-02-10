class SeparatetheDigitsinanArray {

  public static void main(String[] args) {
    // System.out.println(1 % 10);
    int[] nums = { 13, 25, 83, 77 };
    for (int i : separateDigits(nums)) {
      System.out.print(i + " ");
    }
  }

  static int[] separateDigits(int[] nums) {
    int[] ans = new int[nums.length*2];
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      int t = nums[i];
      while (t > 0) {
        ans[j] = t % 10;
        t /= 10;
        j++;
      }
    }

    return ans;
  }
}
