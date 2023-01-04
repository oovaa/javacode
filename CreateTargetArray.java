import java.util.ArrayList;

public class CreateTargetArray {
    public static void main(String[] args) {

        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };

        int[] m = createTargetArray(nums, index);

        for (int i : m) {
            System.out.print(i + " ");
        }
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i], nums[i]);
        }

        int[] ret = new int[ans.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = (int) ans.get(i);
        }
        return ret;
    }
}
