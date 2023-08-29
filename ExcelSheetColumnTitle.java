class ExcelSheetColumnTitle {

  public static void main(String[] args) {
    // System.out.println((char) ((2 % 27) + 64));
    System.out.println(convertToTitle(701));
  }

  static String convertToTitle(int columnNumber) {
    String ans = "";
    char ch;
    while (columnNumber > 0) {
      columnNumber--;
      ch = (char) ((columnNumber % 26) + 65);
      ans =  ch + ans;
      columnNumber /= 26;
    }
    return ans;
  }

  static String convertToTitle2(int columnNumber) {
    StringBuilder sb = new StringBuilder();

    while (columnNumber > 0) {
      columnNumber--;
      int remainder = columnNumber % 26;
      char ch = (char) (remainder + 'A');
      sb.insert(0, ch);
      columnNumber /= 26;
    }

    return sb.toString();
  }
}
// Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
// For example:
// A -> 1
// B -> 2
// C -> 3
// ...
// Z -> 26
// AA -> 27
// AB -> 28
// ...
// Example 1:
// Input: columnNumber = 1
// Output: "A"
// Example 2:
// Input: columnNumber = 28
// Output: "AB"
// Example 3:
// Input: columnNumber = 701
// Output: "ZY"
