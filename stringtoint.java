public class stringtoint {
    public static void main(String[] args) {

        //System.out.println(reverse(1534236469));

    }

    static int reverse(int x) {
        int h;
        int ans = 0;
        while (x != 0) {
            h = x % 10;
            ans = ans * 10 + h;
            x /= 10;
        }
        return ans;
    }

    public static int myAtoi(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' >= 0 && s.charAt(i) - '0' <= 9) {
                ans *= 10;
                ans += (s.charAt(i) - '0');
            }
        }
        for (char c : s.toCharArray()) {
            if (c == '-') {
                ans = -ans;
            }
        }
        return ans;
    }

}
