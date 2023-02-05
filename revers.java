class revers {

  public static void main(String[] args) {
    char[] s = { 'h', 'e', 'l', 'l', 'o' };
    reverseString(s);
    for (char c : s) {
      System.out.print(c + " ");
    }
  }

  static void reverseString(char[] s) {
    char t;
    for (int i = 0; i < s.length / 2; i++) {
      t = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = t;
    }
  }
}
