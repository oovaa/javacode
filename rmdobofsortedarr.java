public class rmdobofsortedarr {
    public static void main(String[] args) {
        int[] arr = {1,1,2};

        System.out.println(removeDuplicates(arr));

    }
    public static int removeDuplicates(int[] nums) {
        int j=0;

      for (int i = 0; i < nums.length; i++) {
        if (nums[j] != nums[i]) {
            j++;
            nums[j] = nums[i];
        }
      }
       return j+1;
    }
}
