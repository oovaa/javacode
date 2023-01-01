public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = { 1,3,2,1 };
        int[] tr = getConcatenation(nums);
        for (int i : tr) {
            System.out.print(i + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];

        for (int i = 0; i < ans.length/2; i++) {
            ans[i] = ans[nums.length+i] = nums[i];
        }
       return ans;
    }
    
}
