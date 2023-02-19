class NumberofStringsThatAppearasSubstringsinWord {

  public static void main(String[] args) {
    String[] patterns = { "a", "abc", "bc", "d" };
    String word = "abc";
    System.out.println(numOfStrings(patterns, word));
  }

  static int numOfStrings(String[] patterns, String word) {
    int ans = 0;
    for (String hold : patterns) {
      if (word.contains(hold)) {
        ans++;
      }
    }
    return ans;
  }
}
