public class XORInArray {

  public static void main(String[] args) {
    int start = 3;
    int n = 4; ///ans =8
    System.out.println(fun(n, start));
  }

  static int fun(int n, int start) {
    //arr[i] = start +2*i
    int ans = 0;
    int hold;
    for (int i = 0; i < n; i++) {
      hold = start + 2 * i;
      ans ^= hold;
    }
    return ans;
  }
}
