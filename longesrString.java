public class longesrString {
    public static void main(String[] args) {

        // String s = "omer";
        // System.out.println(s.indexOf('t'));
        lengthOfLongestSubstring("pwwkew");
    }

    static public void lengthOfLongestSubstring(String s) {
        int result = 0;
        String hold = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < hold.length() + 1; j++) {

                if ((hold.indexOf(s.charAt(i))) == -1) {
                    hold = hold + s.substring(i, i + 1);
                    result++;
                }

            }
        }

        System.out.println(hold);
        System.out.println(result);
    }
}
