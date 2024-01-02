import java.util.Arrays;

public class NextGreaterElementI {

  public static void main(String[] args) {
    int nums1[] = { 4, 1, 2 };
    int nums2[] = { 1, 3, 4, 2 };

    int ans[] = nextGreaterElement(nums1, nums2);

    System.err.println(Arrays.toString(ans));
  }

  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int ans[] = new int[nums1.length];
    int hold = -1;

    for (int i = 0; i < nums1.length; i++) {
      int iidx = get_idx(nums2, nums1[i]);

      for (int j = iidx + 1; j < nums2.length; j++) if (
        nums2[j] > nums2[iidx]
      ) {
        hold = nums2[j];
        break;
      }
      ans[i] = hold;
      hold = -1;
    }

    return ans;
  }

  static int get_idx(int arr[], int num) {
    for (int i = 0; i < arr.length; i++) if (arr[i] == num) return i;
    return -1;
  }
}
