public class policefirearmy {

  public static void main(String[] args) {
    for (int p = 0; p <= 7; p++) {
      for (int f = 0; f <= 7; f++) {
        for (int a = 0; a <= 7; a++) {
          if (isValid(p, f, a)) System.out.println(p + " - " + f + " - " + a);
        }
      }
    }
  }

  private static boolean isValid(int p, int f, int a) {
    if (p % 2 == 0 && p != a && p != f && a != f && p + a + f == 12) {
      return true;
    }
    return false;
  }
}
