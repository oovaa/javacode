public class DeleteColumnstoMakeSorted {

  public static void main(String[] args) {
    String[] a = { "zyx", "wvu", "tsr" };
    System.out.println(minDeletionSize(a));
  }

  static int minDeletionSize(String[] strs) {
    int ans = 0;
    for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 0; j + 1 < strs.length; j++) {
        if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
          ans++;
          break;
        }
      }
    }

    return ans;
  }
}
