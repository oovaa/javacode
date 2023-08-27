public class SmallestStringWithSwaps {

  public static void main(String[] args) {
    int[][] a = { { 0, 3 }, { 1, 2 }, { 0, 2 } };
    String s = smallestStringWithSwaps("dcab", a);
    System.out.println(s);
  }

  static String smallestStringWithSwaps(String s, int[][] pairs) {
    StringBuffer sh = new StringBuffer(s);
    // char h;
    for (int i = 0; i < pairs.length; i++) {
      int ia = pairs[i][0];
      int ic = pairs[i][1];
      String ias = sh.substring(ia, ia + 1);
      String ics = sh.substring(ic, ic + 1);
      System.out.println(ia + " - " + ic);
      sh.replace(ia, ia + 1, ics);
      sh.replace(ic, ic + 1, ias);
      //   h = sh.charAt(pairs[i][0]);
      //  sh.replace(, pairs[i][0]+1, sh.substring(pairs[i][0], h));
    }
    return sh.toString();
  }
}

// You are given a string s, and an array of pairs of indices in the string pairs where pairs[i] = [a, b] indicates 2 indices(0-indexed) of the string.

// You can swap the characters at any pair of indices in the given pairs any number of times.

// Return the lexicographically smallest string that s can be changed to after using the swaps.

 

// Example 1:

// Input: s = "dcab", pairs = [[0,3],[1,2]]
// Output: "bacd"
// Explaination: 
// Swap s[0] and s[3], s = "bcad"
// Swap s[1] and s[2], s = "bacd"
// Example 2:

// Input: s = "dcab", pairs = [[0,3],[1,2],[0,2]]
// Output: "abcd"
// Explaination: 
// Swap s[0] and s[3], s = "bcad"
// Swap s[0] and s[2], s = "acbd"
// Swap s[1] and s[2], s = "abcd"
// Example 3:

// Input: s = "cba", pairs = [[0,1],[1,2]]
// Output: "abc"
// Explaination: 
// Swap s[0] and s[1], s = "bca"
// Swap s[1] and s[2], s = "bac"
// Swap s[0] and s[1], s = "abc"