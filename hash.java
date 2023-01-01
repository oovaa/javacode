import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<Character , Integer> hands = new HashMap<>();
     hands.put('U', 1);
     hands.put('D', 0);
     String ss = "";
     char[] stat = ss.toCharArray();
     int sum =0;
     for (char c : stat) {
        if (c == 'U') {
            sum++;
        }
     }
     System.out.println(sum);

    }
}
