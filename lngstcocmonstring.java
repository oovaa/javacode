import java.util.Arrays;

public class lngstcocmonstring {
    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flowht" };

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        // String ans = "";
        // boolean con = false;

        // for (int i = 0; i < strs.length; i++) {

        //     for (int j = 0; j < strs.length; j++) {
               

        //         if (strs[i].equals("") || strs.length == 1) {
        //             return "";
        //         } else {
        //             int f = 0;
        //             for (int j2 = 0; j2 < Math.min(strs[0].length(), strs[1].length()); j2++) {
        //                 for (int k = 0, l = k + 1; l < strs.length; l++, k++) {
        //                     if (strs[k].charAt(j2) == strs[l].charAt(i)) {
        //                         con = true;
        //                         f = k;
        //                     }
        //                 }
        //                 if (con) {
        //                     ans += strs[f].substring(j2, j2 + 1);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return ans;
        if (strs == null|| strs.length == 0)  return "";

        Arrays.sort(strs);
        String fString = strs[0];
        String lString = strs[strs.length-1];
        int c = 0;

        while (c < fString.length()) {
            if (fString.charAt(c)==lString.charAt(c)) {
                c++;
            } else break;
        }
return c ==0 ? "" : fString.substring(0, c);
    }
}
