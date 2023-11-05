import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    Map<Integer, Integer> occurrenceCount = new HashMap<>();

    // Count the occurrences of each element
    for (int num : arr) {
      occurrenceCount.put(num, occurrenceCount.getOrDefault(num, 0) + 1);
    }

    // Check if the count of occurrences is unique
    Map<Integer, Boolean> uniqueCount = new HashMap<>();
    for (int count : occurrenceCount.values()) {
      if (uniqueCount.containsKey(count)) {
        return false; // Found duplicate count
      }
      uniqueCount.put(count, true);
    }

    return true; // All counts are unique
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
