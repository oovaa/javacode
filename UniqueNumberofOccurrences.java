import java.util.Arrays;

public class UniqueNumberofOccurrences {

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 2, 1, 1, 3 };
    boolean result1 = uniqueOccurrences(arr1);
    System.out.println("Input: arr = " + Arrays.toString(arr1));
    System.out.println("Output: " + result1);
    System.out.println();

    int[] arr2 = { 1, 2 };
    boolean result2 = uniqueOccurrences(arr2);
    System.out.println("Input: arr = " + Arrays.toString(arr2));
    System.out.println("Output: " + result2);
    System.out.println();

    int[] arr3 = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
    boolean result3 = uniqueOccurrences(arr3);
    System.out.println("Input: arr = " + Arrays.toString(arr3));
    System.out.println("Output: " + result3);
    System.out.println();
  }

  static boolean uniqueOccurrences(int[] arr) {
    Arrays.sort(arr);
    int acc[] = new int[arr.length];

    int j = 0;
    for (int i = 0; i + 1 < acc.length; i++) {
      if (arr[i] == arr[i + 1]) acc[j]++; else j++;
    }
    System.out.println("Input: acc = " + Arrays.toString(acc));
    for (int i = 0; i + 1 < acc.length; i++) {
      if (acc[i] == 0) break;
      if (acc[i] == acc[i + 1]) {
        return false;
      }
    }

    return true;
  }
}
// int[] acc = new int[arr.length];
// for (int i = 0; i < arr.length; i++) {
//   for (int j = 0; j < i; j++) if (arr[i] == arr[j]) acc[i]++;
// }
// Arrays.sort(acc);
// System.out.println("Input: acc = " + Arrays.toString(acc));
// for (int i = 0; i < acc.length; i++) {
//   if (acc[i] == 0) continue;
//   if (acc[i] == acc[i + 1]) return false;
// }
