import java.util.Arrays;

public class MissingNumber {

  public static void main(String[] args) {
    int[] t = { 0,1 };
    System.out.println(missingNumber(t));
  }

  static int missingNumber(int[] nums) {
    Arrays.sort(nums);
   for (int i = 0; i <= nums.length; i++) {
    if (i==nums.length) {
        return i;
    }
    if (i != nums[i]) {
        return i;
    }
   }
    
    // if (nums.length == 2) {
    //   return (nums[0] != 0) ? 0 : (nums[1] != 1) ? 1 : 2;
    // }
    // if (nums.length == 1) {
    //   return (nums[0] == 0) ? 1 : 0;
    // }
    // for (int i = 0; i < nums.length; i++) {
    //   if (i != nums[i]) {
    //     return i;
    //   }
    // }

    return -1;
  }
}
