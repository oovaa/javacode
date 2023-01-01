import java.util.HashMap;

public class romtoint {
    public static void main(String[] args) {
        String s = "MCDLXXVI";
        romanToInt(s);
    }

    public static void romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int i = s.length() - 1;
        while (0 <= i) {
            if (i == 0) {
                System.out.println("first");
                ans += map.get(s.charAt(i));
            } else if (map.get(s.charAt(i)) <= map.get(s.charAt(i - 1))) {
                // System.out.println("sec");

                // ans += map.get(s.charAt(i)) + map.get(s.charAt(i - 1));
                // i--;
                System.out.println("sec");

                int sd = 0;

                if (i >= 2 && map.get(s.charAt(i - 2)) < map.get(s.charAt(i - 1))) {
                    sd += map.get(s.charAt(i - 2));
                }

                ans += map.get(s.charAt(i)) + map.get(s.charAt(i - 1)) - sd;
                i--;
                if (sd != 0) {
                    i--;
                }
            } else if (map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                System.out.println("3red");

                ans += map.get(s.charAt(i)) - map.get(s.charAt(i - 1));
                i--;
            }
            System.out.println(ans);
            i--;
        }
        System.out.println(ans);
    }
}
