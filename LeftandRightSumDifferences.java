class LeftandRightSumDifferences {

  public static void main(String[] args) {
    int nums[] = { 10, 4, 8, 3 };
    leftRigthDifference(nums);
  }

  static int[] leftRigthDifference(int[] nums) {
    int ans[] = new int[nums.length];
    int lar[] = new int[nums.length];
    int rar[] = new int[nums.length];

    for (int i1 = 0, i2 = rar.length - 1; i1 < nums.length; i2--, i1++) {
      int ho = 0;
      int h = 0;
      for (int j1 = i1 + 1, j2 = i2 - 1; j1 < nums.length; j1++, j2--) {
        ho += nums[j1];
        h += nums[j2];
      }
      rar[i1] = ho;
      lar[i2] = h;
    }
    // for (int i2 = rar.length - 1; i2 >= 0; i2--) {
    //   int h = 0;
    //   for (int j2 = i2 - 1; j2 >= 0; j2--) {
    //     h += nums[j2];
    //   }
    //   lar[i2] = h;
    // }

    for (int i = 0; i < rar.length; i++) {
      ans[i] = Math.abs(rar[i] - lar[i]);
    }

    for (int i : rar) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
    for (int i : lar) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
    for (int i : ans) {
      System.out.print(i + " ");
    }

    return ans;
  }
}
