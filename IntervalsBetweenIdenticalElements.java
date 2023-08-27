public class IntervalsBetweenIdenticalElements {

  public static void main(String[] args) {
    int[] ar = { 10, 5, 10, 10 };
    long[] test = getDistances(ar);
    for (long l : test) {
      System.out.println(l);
    }
  }

  static long[] getDistances(int[] arr) {//TODO
    long[] ans = new long[arr.length];
    for (int i = 0; i < ans.length; i++) {
      int hold = 0;
      for (int j = 0; j < ans.length; j++) {
        if (arr[i] == arr[j]) hold += Math.abs(i - j);
      }
      ans[i] = hold;
    }

    return ans;
  }
}
