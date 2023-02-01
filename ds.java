public class ds {

  public static void main(String[] args) {
    int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    intrepolationsearch(ar, 6);

    System.out.println(intrepolationsearch(ar, 7));
  }

  static int intrepolationsearch(int[] array, int value) {
    int high = array.length - 1;
    int low = 0;

    while (value >= array[low] && value <= array[high] && low <= high) {
      int probe =
        low + (high - low) * (value - array[low]) / (array[high] - array[low]);

      System.out.println("probe: " + probe);

      if (array[probe] == value) {
        return probe;
      } else if (array[probe] < value) {
        low = probe + 1;
      } else {
        high = probe - 1;
      }
    }
    return -1;
  }

  static int binarysearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int middle = low + (high - low) / 2;
      // int value = arr[middle];
      System.out.println("middle is " + middle);

      if (target > middle) low = middle + 1; else if (target < middle) high =
        middle - 1; else return middle;
    }

    return -1;
  }
}
