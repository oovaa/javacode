public class Sqrtx {

  public static void main(String[] args) {
    int i = mySqrt(8);
    System.out.println(i);
  }

  static int mySqrt(int x) {
    if (x == 0) return 0;

    int low = 1;
    int high = x;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      int square = mid * mid;

      if (square == x) {
        return mid;
      } else if (square > x || mid > x / mid) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return high;
  }
}
