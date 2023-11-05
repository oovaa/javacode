public class ArrangingCoins {

  public static void main(String[] args) {
    System.err.println(arrangeCoins(8));
  }

  static int arrangeCoins(int n) {
    int i = 1;
    while (n >= i) {
      n -= i;
      i++;
    }
    return i - 1;
  }
}
