public class desbinary {

    public static void main(String[] args) {
        String n = "34";
        // char[] ch= n.toCharArray();
        // char max='1';
        // for (int i = 0; i+1 < ch.length; i++) {
        // if (ch[i] > ch[i+1]) {
        // max = ch[i];
        // }
        // }

        System.out.println(minPartitions(n));
    }

    public static int minPartitions(String n) {
        char[] ch = n.toCharArray();
        char max = '0';
        if (n.length() == 1) {
            return (int) n.charAt(0) - '0';
        }
        for (int i = 0; i + 1 < ch.length; i++) {
            if (ch[i] > max) {
                max = ch[i];
            }  if (ch[i+1] > max) {
                max = ch[i+1];
            }
        }
        return (int) max - '0';
    }
}
