class xor {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6 };

        System.out.println(searchInsert(a, 8));

    }

    public static int searchInsert(int[] nums, int target) {
        int re = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                re++;
            }
        }
        return re;
    }
}