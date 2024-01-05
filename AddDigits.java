public class AddDigits {

  public static void main(String[] args) {
    int i = addDigits(83);
    System.err.println(i);
  }

  static int addDigits(int num) {
    int ans = 0;

    while (num != 0) {
      ans += num % 10;
      num /= 10;
    }
    return ans;
  }
}
