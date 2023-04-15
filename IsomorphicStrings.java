class IsomorphicStrings {

  public static void main(String[] args) {
    String s = "paper", t = "title";
    String hold = "";
    for (int i = 0; i < s.length(); i++) {
      if (hold.indexOf(s.charAt(i)) == -1 || hold.indexOf(t.charAt(i)) == -1) {
        hold += s.charAt(i);
        hold += t.charAt(i);
      }
    }
    System.out.println(hold);

    for (int i = 0; i < t.length(); i++) {
      if (hold.indexOf(t.charAt(i)) == hold.indexOf(s.charAt(i))-1 ) {
        System.out.println(false);
        System.out.println(hold.indexOf(t.charAt(i)));
        System.out.println((t.charAt(i)));
        break;
      }
      System.out.println(hold.indexOf(t.charAt(i)));
      System.out.println((t.charAt(i)));
      System.out.println(true);
    }
  }

  //   hold.indexOf(t.charAt(i))==-1&& hold.indexOf(t.charAt(i)) == -1
  public boolean isIsomorphic(String s, String t) {
    return true;
  }
}
