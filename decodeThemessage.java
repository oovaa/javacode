public class decodeThemessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";

        String messg = "vkbs bs t suepuv";

        // System.out.println(key.replace(" ", "").indexOf("d"));
        System.out.println(decodeMessage(key, messg));

    }

    static String decodeMessage(String key, String message) {
        String hold = "abcdefghijklmnopqrstuvwxyz";
        String ans = "";
        key = key.replace(" ", "");

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                ans += " ";
            } else {
                System.out.println(key.indexOf(message.substring(i, i + 1)) + " " + message.substring(i, i + 1) + " "
                        + hold.charAt(key.indexOf(message.substring(i, i + 1))));
                ans += hold.charAt(key.indexOf(message.charAt(i)));
            }
        }
        return ans;
    }
}
