public class CountNegativeNumbersinaSortedMatrix {

  public static void main(String[] args) {
    int[][] grid = {
      { 4, 3, 2, -1 },
      { 3, 2, 1, -1 },
      { 1, 1, -1, -2 },
      { -1, -1, -2, -3 },
    };
    System.out.println(countNegatives(grid));
  }

  static int countNegatives(int[][] grid) {
    int ans = 0;
    for (int[] is : grid) {
      int hold = is.length;
      for (int i = 0; i < is.length; i++) {
        if (is[i] >= 0) hold--; else break;
      }
      ans += hold;
    }

    return ans;
  }
}
