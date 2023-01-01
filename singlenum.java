class singlenum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 4, 2 };
        singleNumber(nums);
    }

    public static void singleNumber(int[] nums) {
        boolean ans = false;
        for (int i = 0, j = 0; i < nums.length; j++) {
            ans = false;
            if (nums[j] == nums[i] && i != j) {
                i++;
                j = 0;
                ans = true;
            }
            if (j == nums.length - 1 && !ans) {
                System.out.println(i);
                return;
            }
            System.out.println(i + "=" + nums[i] + " " + j + "=" + nums[j]);
        }
    }
}//hate u