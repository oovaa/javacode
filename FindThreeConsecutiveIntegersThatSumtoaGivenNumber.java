public class FindThreeConsecutiveIntegersThatSumtoaGivenNumber {

  public static void main(String[] args) {
    long test[] = sumOfThree(33);
    for (long l : test) {
        System.out.println(l);
    }
  }

  static long[] sumOfThree(long num) {
    long[] ans = {};
    long start = num / 3 -1;
    // System.out.println(start);
    if ((start + start + 1 + start + 2) == num) {
      ans = new long[3];
      ans[0] = start;
      ans[1] = start+1;
      ans[2] = start+2;
    }

    return ans;
  }
}
// Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.
