import java.util.HashMap;

public class validpharan {
    public static void main(String[] args) {
        String s = "([)]";
 isValid(s);;
    }

    static public void isValid(String s) {
        boolean result1 = false;
        boolean result2 = false;
        String fpr = "";
        String rpr = "";

        HashMap<Character, Character> pr = new HashMap<>();
        pr.put('}', '{');
        pr.put(')', '(');
        pr.put(']', '[');

        if (s.length() % 2 == 1)
            System.out.println("odd len");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
                fpr += s.charAt(i);

            else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']')
                rpr += s.charAt(i);
        }

        for (int i = 0, j = fpr.length() - 1; i < fpr.length(); j--, i++) {
            if (fpr.charAt(i) == pr.get(rpr.charAt(j)))
                result1 = true;
            else {
                result1 = false;
                break;
            }
        }
        for (int i = 0; i < fpr.length(); i++) {
            if (fpr.charAt(i) == pr.get(rpr.charAt(i)))
                result2 = true;
            else {
                result2 = false;
                break;
            }

        }
        System.out.println(result1 +"\t"+ result2);
        System.out.println(fpr+"\t"+ rpr);
    }
}
// for (int i = 0, j = s.length() - 1; i < s.length() / 2; j--, i++) {
// if (s.charAt(i) == pr.get(s.charAt(j)))
// result = true;
// else
// return false;

// }
// int hold = 0;
// for (int i = 0; i < s.length(); i++) {
// hold += pr.get(s.charAt(i));
// }
// if (hold == 0) {
// result = true;
// } else result = false;