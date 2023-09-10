public class MoveZeroes {

  int moved = 0;

  public static void main(String[] args) {
    int[] nums = { 0, 0, 1 };
    MoveZeroes solution = new MoveZeroes();
    // solution.moveZeroes2(nums);
    solution.moveZeroes(nums);

    // Print the resulting array
    for (int num : nums) {
      System.out.print(num + " ");
    }
  }

  //   public void moveZeroes2(int[] nums) {
  //     int insertPos = 0;
  //     for (int i = 0; i < nums.length; i++) {
  //       if (nums[i] != 0) {
  //         nums[insertPos++] = nums[i];
  //       }
  //     }
  //     while (insertPos < nums.length) {
  //       nums[insertPos++] = 0;
  //     }
  //   }

  public void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        moveZeroeshelper(nums, i);
      }
    }
  }

  void moveZeroeshelper(int[] nums, int i) {
    for (int j = i; j < nums.length - moved - 1; j++) {
      swap(nums, j);
    }
    moved++;
  }

  void swap(int nums[], int j) {
    int t = nums[j];
    nums[j] = nums[j + 1];
    nums[j + 1] = t;
  }
}
