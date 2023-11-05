import java.util.Arrays;

public class ShortestToChar {

  public static void main(String[] args) {
    // Test Case 1
    String s1 = "loveleetcode";
    char c1 = 'e';
    int[] result1 = shortestToChar(s1, c1);
    System.out.println(Arrays.toString(result1));

    // Test Case 2
    String s2 = "aaab";
    char c2 = 'b';
    int[] result2 = shortestToChar(s2, c2);
    System.out.println(Arrays.toString(result2));
  }

  static int[] shortestToChar(String s, char c) {
    int ans[] = new int[s.length()];
    int hold;
    for (int i = 0; i < ans.length; i++) {
      hold = s.length();
      for (int j = 0; j < ans.length; j++) {
        if (s.charAt(j) == c) hold = (hold > Math.abs(j - i)) ? Math.abs(j - i) : hold;
      }
      ans[i] = hold;
    }
    return ans;
  }
  static int[] shortestToChar2(String s, char c) {
    int n = s.length();
    int[] ans = new int[n];
    int prev = 0; // To handle edge case

    // Forward pass
    for (int i = 0; i < n; i++) {
        if (s.charAt(i) == c) {
            prev = i;
        }
        ans[i] = i - prev;
    }

    // Backward pass
    prev = n; // To handle edge case
    for (int i = n - 1; i >= 0; i--) {
        if (s.charAt(i) == c) {
            prev = i;
        }
        ans[i] = Math.min(ans[i], prev - i);
    }

    return ans;
}

}
