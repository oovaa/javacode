import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Premutation {

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    String[] s = StdIn.readStrings();
    doTheThing(s, n);
  }

  private static void doTheThing(String s[], int n) {
    for (int i = 0; i < s.length; i++) {
      int ri = StdRandom.uniformInt(i + 1);
      String tem = s[ri];
      s[ri] = s[i];
      s[i] = tem;
    }
    for (int i = 0; i < n; i++) {
      StdOut.println(s[i]);
    }
  }
}
