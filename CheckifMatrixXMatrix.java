public class CheckifMatrixXMatrix {

  public static void main(String[] args) {
    int[][] grid = { //{ 5, 7, 0 }, { 0, 3, 1 }, { 0, 5 } };
      { 2, 0, 0, 1 },
      { 0, 3, 1, 0 },
      { 0, 5, 2, 0 },
      { 4, 0, 0, 2 },
    };
    System.out.println("\n" + checkXMatrix(grid));
  }

  static boolean checkXMatrix(int[][] grid) { //yeeeessss
    int n = grid.length;
    for (int i = 0; i < grid.length; i++) {
      if (grid[i][i] == 0 || grid[i][n - i - 1] == 0) return false; //check diagonals
      else {
        for (int j = 0; j < grid.length; j++) {
          if (i == j || j == n - 1 - i) continue; //check none diagonals
          if (grid[i][j] != 0) return false;
        }
      }
    }

    return true;
  }
}
// if (i % n-1 == 0) {
//   if ((j == 0 || j == n) && grid[i][j] != 0) {
//     return false;
//   }
//   if (j > 0 && j < n && grid[i][j] == 0) {
//     return false;
//   }
// } else {
//   if (!((j == 0 || j == n) && grid[i][j] != 0)) {
//     return false;
//   }
//   if (!(j > 0 && j < n && grid[i][j] == 0)) {
//     return false;
//   }
// }
