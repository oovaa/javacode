public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }

    static boolean isSubsequence(String s, String t) {
        boolean ans = false;
        int lastfind = -1;
        if (s.equals(""))
            return true;

        for (int i = 0; i < s.length(); i++) {
            ans = false;
            for (int j = lastfind + 1; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    ans = true;
                    lastfind = j;
                    break;
                }
            }
            if (!ans || lastfind < i) {
                return false;
            }
        }

        return ans;
    }
}
