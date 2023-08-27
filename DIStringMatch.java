public class DIStringMatch {

  public static void main(String[] args) {
    String s = "IDID";
    int arr[] = diStringMatch(s);
    for (int i : arr) {
      System.out.println(i);
    }
  }

  static int[] diStringMatch(String s) {
    int[] arr = new int[s.length() + 1];
    // int j = 0;
    int k = s.length();

    int size = s.length() + 1;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
      //   System.out.print(i + " ");
    }
    arr[s.length() - 1] = arr[s.length() - 2] + 1;

    for (int i = 0; i < arr.length-1; i++) {
        System.out.println();
        System.out.print(arr[i]+" - ");
      if (s.charAt(arr[i]) == 'D') {
        int t = arr[i];
        arr[i] = arr[k];
        arr[k] = arr[i];
        k--;
        System.out.println(arr[i]);

      }
    }
    // System.out.println(arr[k]);
    // System.out.println();
    // System.out.println(j+" "+k);
    // for (int i = 0; i < arr.length-1; i++) {
    //   if (s.charAt(i) == 'I') {
    //     arr[j] = j;
    //     j++;
    //   } else if (s.charAt(i) == 'D') {
    //     arr[i] = k;
    //     k--;
    //   }
    // }
    return arr;
  }
}
// A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
// s[i] == 'I' if perm[i] < perm[i + 1], and
// s[i] == 'D' if perm[i] > perm[i + 1].
// Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
// Example 1:
// Input: s = "IDID"
// Output: [0,4,1,3,2]
// Example 2:
// Input: s = "III"
// Output: [0,1,2,3]
// Example 3:
// Input: s = "DDI"
// Output: [3,2,0,1]
