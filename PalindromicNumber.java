public class PalindromicNumber {
    public static void main(String[] args) {
        // int n = 31;
        // System.out.println(Integer.toBinaryString(n));
        System.out.println(isStrictlyPalindromic(9));
        System.out.println(Integer.toBinaryString(9));

        // System.out.println( new StringBuffer
        // ("omer").reverse().toString().equals("omer"));
        new StringBuilder("omer");
    }

    static boolean isStrictlyPalindromic(int n) {

        for (int i = 0; i < Integer.toBinaryString(n).length(); i++) {
            if (Integer.toBinaryString(n).charAt(i) != Integer.toBinaryString(n)
                    .charAt(Integer.toBinaryString(n).length() - i - 1)) {

                return false;
            }
        }
        return true;
    }
}