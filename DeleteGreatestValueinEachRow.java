public class DeleteGreatestValueinEachRow {

  public static void main(String[] args) {
    int[][] a = {{9,81},{33,17}};
    System.out.println(DeleteGreatestValueinEachRowm(a));
  }

  static int DeleteGreatestValueinEachRowm(int[][] arr) {
    int ans = 0;
    int hold = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] > max) {
          max = arr[i][j];
        }
        arr[i][j] = 0;
        if (max > hold) hold = max;
      }
      ans += hold;
    }

    return ans;
  }
}
