import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WiggleSortII {

  public static void main(String[] args) {
    int[] nums = { 3, 5, 2, 1, 6, 4 };

    System.out.println("Original array: " + Arrays.toString(nums));

    wiggleSort(nums);

    System.out.println("Wiggle sorted array: " + Arrays.toString(nums));
  }

  static void wiggleSort(int[] nums) {
    // smalles latges
    List<Integer> al = new ArrayList<Integer>(Arrays.asList(nums));

    System.err.println(al);
  }
}
