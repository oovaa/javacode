class FindTriangularSumofanArray {

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5 };

    System.out.println(triangularSum(nums));
  }

  static int triangularSum(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j + 1 < nums.length; j++) {
        nums[j] = (nums[j] + nums[j + 1]) % 10;
      }
      nums[nums.length - i - 1] = 0;
    }
    return nums[0];
  }
}
