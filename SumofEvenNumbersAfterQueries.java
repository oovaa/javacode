import java.util.Arrays;

public class SumofEvenNumbersAfterQueries {

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 4 };
    int[][] queries1 = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
    int[] result1 = sumEvenAfterQueries(nums1, queries1);
    System.out.println("Output: " + Arrays.toString(result1));
    // Output: [8, 6, 2, 4]

    int[] nums2 = { 1 };
    int[][] queries2 = { { 4, 0 } };
    int[] result2 = sumEvenAfterQueries(nums2, queries2);
    System.out.println("Output: " + Arrays.toString(result2));
    // Output: [0]
  }

  static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
    int sum;
    int hold[] = new int[nums.length];
    for (int i = 0; i < queries.length; i++) {
      sum = 0;
      int index = queries[i][1];
      int val = queries[i][0];
      nums[index] += val;
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] % 2 == 0) sum += nums[j];
      }

      hold[i] = sum;
    }
    return hold;
  }
}
