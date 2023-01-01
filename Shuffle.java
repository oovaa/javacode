public class Shuffle {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 4, 3, 2, 1 };
    int n = 4;
    int[] ans = shuffle(nums, n);
    for (int i : ans) {
      System.out.print(i + " ");
    }
  }
//hell yeah 
  public static int[] shuffle(int[] nums, int n) {
    // int hold;
    int[] ans = new int[nums.length];
    int sa = n;// second array
    int fa = 0;// first array
    for (int i = 0; i < ans.length; i++) {
      if (i % 2 == 0) {
        ans[i] = nums[fa];
        fa++;

      } else {
        ans[i] = nums[sa];
        sa++;
      }
    }

    // for (int i = 1; i < n; i+=2) {
    // hold = nums [i];
    // nums[i] = nums[i+n-1];
    // nums[i+n-1]=hold;
    // }

    return ans;
  }
}
