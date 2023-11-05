public class ExcelSheetColumnNumber {

  public static void main(String[] args) {
    int a = titleToNumber("AA");
    System.out.println(a);
  }

  static int titleToNumber(String columnTitle) {
    int i = columnTitle.length() - 1;
    char h;
    int idx = 0, sum = 0;

    for (; i >= 0; i--) {
      h = columnTitle.charAt(i);
      sum += ((h - 'A' + 1) + idx++ * 25);
    }

    return sum;
  }
}
