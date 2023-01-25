public class ballons {
    public static void main(String[] args) {

        System.out.println(ballonsFun("BKPTB"));
    }

    static int ballonsFun(String s) {
        String s1 = "";
        int re=0;

        for (int i = 0; i < s.length(); i++) {
            if (s1.matches((".*")+s.charAt(i)+(".*"))) {
                re++;
            } else {
                re+=2;
                s1 = s1 + s.substring(i, i + 1);

            }
        }

        return re;
    }
}
