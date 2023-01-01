import java.util.Arrays;

public class sortingTheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

        System.out.println(s.split(" ")[3].substring(s.split(" ")[3].length() - 1, s.split(" ")[3].length()));

        System.out.println(s.split(" ")[3].substring(0, s.split(" ")[3].length() - 1));
    }

    static String sortSentence(String s) {
        String[] hold = new String[s.split(" ").length];

        for (int i = 0; i < s.split(" ").length; i++) {
            hold[Integer.parseInt(s.split(" ")[i].substring(s.split(" ")[i].length() - 1, s.split(" ")[i].length()))
                    - 1] = s.split(" ")[i].substring(0, s.split(" ")[i].length() - 1);
        }

        return Arrays.toString(hold).replace(",", "").replace("[", "").replace("]", "");
    }

}
