import java.util.ArrayList;
import java.util.List;

public class cellsInRange {
    public static void main(String[] args) {
String s = "K1:L2";

System.out.println(cellsInRange1(s));

    }

    static List<String> cellsInRange1(String s) {
        List<String> ans = new ArrayList<>();
        String hold;
        for (char i = s.charAt(0); i <= s.charAt(3); i++) {
            for (char j = s.charAt(1); j <= s.charAt(s.length() - 1); j++) {
                hold = i +""+ j;
                ans.add(hold);
            }
        }
        return ans;
    }
}
