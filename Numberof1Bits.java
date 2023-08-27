public class Numberof1Bits {

  public static void main(String[] args) {
    int j = hammingWeight(00000000000000000000000000001011);
    System.out.println(j);
  }

  static int hammingWeight(int n) {
    int re = 0;

    while (n != 0) {
      re += n & 1; // Add the least significant bit
      n >>>= 1; // Right shift the number by 1 bit
    }
    return re;
  }
}
