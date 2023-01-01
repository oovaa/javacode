public class rmelem {
  public static void main(String[] args) {

    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };

    int val = 2;
    removeElement(nums, val);

  }

  public static void removeElement(int[] nums, int val) {

    int result = 0;
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[j] = nums[i];
        j++;
      } else
        result++;
    }
    for (int i : nums) {
      System.out.print(i + " ");
    }

    System.out.println("\n" + val + "\n" + result);

  }
}
