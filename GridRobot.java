import java.util.HashMap;

public class GridRobot {
    public static void main(String[] args) {
        int[] an = { 0, 1 };
        int[] a = executeInstructions(3, an, "RRDDLU");
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    static int[] executeInstructions(int n, int[] startPos, String s) {
        int ans[] = new int[s.length()];
        int x = startPos[0], y = startPos[1];
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('L', -1);
        map.put('R', 1);
        map.put('U', 1);
        map.put('D', -1);

        for (int i = 0; i < s.length(); i++) {
            String hold = s.substring(i);
            int j = 0;
            while (j < hold.length() && !(x < 0 || x >= n) && !(y < 0 || y >= n)) {
                if ((hold.charAt(j) == 'L') || (hold.charAt(j) == 'R')) {
                    x += map.get(hold.charAt(j));
                    ans[i]++;

                } else if ((hold.charAt(j) == 'U') || (hold.charAt(j) == 'D')) {
                    y += map.get(hold.charAt(j));
                    ans[i]++;
                }
                j++;
            }

            x = startPos[0];
            y = startPos[1];

        }
        return ans;
    }
}

// if (hold.charAt(j) == 'L' || hold.charAt(j) == 'R') {
// if (x + map.get(hold.charAt(j)) == -1 || x + map.get(hold.charAt(j)) == max +
// 1) {
// break loop;
// }
// x += map.get(hold.charAt(j));
// ans[i]++;
// } else if (hold.charAt(j) == 'U' || hold.charAt(j) == 'D') {
// if (y + map.get(hold.charAt(j)) == -1 || y + map.get(hold.charAt(j)) == max +
// 1) {
// break loop;
// }
// y += map.get(hold.charAt(j));
// ans[i]++;

// }
