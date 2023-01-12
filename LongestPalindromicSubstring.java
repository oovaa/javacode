public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    static int longestPalindrome(String s) { // dum code
        int j = 0;
        int k = 1;
        int max = 0;
        StringBuilder hold = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            hold = new StringBuilder(s.substring(j, k));
            if (hold.equals(hold.reverse())) {
                hold.append(s.charAt(k++));
            } else
                j++;
            max = Math.max(max, hold.length());
        }

        return max;
    }

}
