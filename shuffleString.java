public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 1, 2, 3 };
        System.out.println(restoreString(s, indices));

    }

    static String restoreString(String s, int[] indices) {
        String ans = "";
        for (int i = 0; i < indices.length; i++) {
            ans += s.substring(indices[i], indices[i] + 1);
           // System.out.println(indices[i] +" "+ ans.charAt(i));
        }

        return ans;
    }
}
