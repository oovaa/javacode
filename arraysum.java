public class arraysum {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int []ans = runningSum(nums);
       for (int i : ans) {
        System.out.print(i+" ");
       }
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;
    }
}
