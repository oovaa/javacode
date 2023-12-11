import java.util.Arrays;

public class WiggleSortII {

  public static void main(String[] args) {
    int[] nums = { 1, 3, 7, 7, 2, 3, 1 };

    System.out.println("Original array: " + Arrays.toString(nums));

    // wiggleSort(nums);
    wiggleSort(nums);

    System.out.println("Wiggle sorted array: " + Arrays.toString(nums));
  }

  static void wiggleSort(int[] arr) {
    int tmp, min, max, j, k;
    for (int i = 0; i < arr.length - 1; i += 2) {
      min = i;
      max = i + 1;

      for (j = i + 1; j < arr.length; j++) if (arr[j] < arr[min]) min = j;
      for (k = i + 2; k < arr.length; k++) if (arr[k] > arr[max]) max = k;

      tmp = arr[i];
      arr[i] = arr[min];
      arr[min] = tmp;

      tmp = arr[i + 1];
      arr[i + 1] = arr[max];
      arr[max] = tmp;
    }
  }
  // static void wiggleSort(int[] nums) {
  //   // smalles latges
  //   List<Integer> al = new ArrayList<Integer>(Arrays.asList(nums));

  //   System.err.println(al);
  // }
}
