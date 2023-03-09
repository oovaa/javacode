public class CellswithOddValuesinaMatrix {

  public static void main(String[] args) {
    int m = 2;
    int n = 2;

    int[][] arr = new int[m][n];
    int[][] indices = { {1,1},{0,0}};
    for (int[] is : indices) {
      int r = is[0];
      int c = is[1];
      for (int i = 0; i < m-1; i++) {
        for (int j = 0; j < n; j++) {
          arr[r][j]++;
        }
        for (int j = 0; j < n-1; j++) {
          arr[j][c]++;
        }
      }
    }

    for (int[] is : arr) {
      for (int a : is) {
        System.out.print(a);
      }
      System.out.println();
    }
    System.out.println();
  }

  public int oddCells(int m, int n, int[][] indices) {
    int ans = 0;

    return ans;
  }
}
