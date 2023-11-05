import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

  static String mostCommonWord(String paragraph, String[] banned) {
    String ans = null;
    String arr[] = paragraph.split(" ");
    Map<String, Integer> mamap = new HashMap<>();
    int max = 0;

    for (int i = 0; i < arr.length; i++) {
    int count =  mamap.getOrDefault(arr[i], 0) + 1;

    mamap.put(arr[i], count);
    }
    for (String s : mamap.keySet()) {
        if (mamap.get(s) > max) {
         ans = s;
         max = mamap.get(s);
        }
    }
    return ans;
  }

  public static void main(String[] args) {
  testExample1();
  testExample2();
  }

  private static void testExample1() {
    String paragraph =
      "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = { "hit" };

    String result = mostCommonWord(paragraph, banned);

    System.out.println("Test Example 1:");
    System.out.println("Input: " + paragraph);
    System.out.println("Banned Words: " + Arrays.toString(banned));
    System.out.println("Output: " + result);
    System.out.println("Expected Output: ball");
    System.out.println(
      "Test Result: " + (result.equals("ball") ? "Passed" : "Failed")
    );
    System.out.println();
  }

  private static void testExample2() {
    String paragraph = "a.";
    String[] banned = {};

    String result = mostCommonWord(paragraph, banned);

    System.out.println("Test Example 2:");
    System.out.println("Input: " + paragraph);
    System.out.println("Banned Words: " + Arrays.toString(banned));
    System.out.println("Output: " + result);
    System.out.println("Expected Output: a");
    System.out.println(
      "Test Result: " + (result.equals("a") ? "Passed" : "Failed")
    );
    System.out.println();
  }
}
