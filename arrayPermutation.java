public class arrayPermutation {
    public static void main(String[] args) {
     //   int[] nums = { 2, 2, 1, 5, 3, 4 };
        int a = 8;

        System.out.println(a |= 7);

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
