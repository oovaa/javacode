import java.util.Arrays;

public class ReplaceElementswithGreatestElementonRightSide {

  public static void main(String[] args) { // Test case 1
    int[] arr1 = { 17, 18, 5, 4, 6, 1 };
    System.out.println("Input: " + Arrays.toString(arr1));
    int[] result1 = replaceElements(arr1);
    System.out.println("Output: " + Arrays.toString(result1));
    System.out.println();

    // Test case 2
    int[] arr2 = { 400 };
    System.out.println("Input: " + Arrays.toString(arr2));
    int[] result2 = replaceElements(arr2);
    System.out.println("Output: " + Arrays.toString(result2));
    System.out.println();
  }

  static int[] replaceElements(int[] arr) {
    int max = -1;
    int temp;
    for (int i = arr.length - 1; i >= 0; i--) {
        temp = arr[i];
        arr[i] = max;
        max = Math.max(max, temp);
    }
    return arr;
}

  private static void swap(int[] arr, int i, int maxi) {
    int t = arr[i];
    arr[i] = arr[maxi];
    arr[maxi] = t;
  }

  private static int getlargestIndex(int[] arr, int i) {
    int max = i + 1;
    for (int j = i + 2; j < arr.length; j++) {
      if (arr[j] > arr[max]) max = j;
    }
    return max;
  }
}
