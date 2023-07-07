public class GridRobot {

  public static void main(String[] args) {
    int[] an = { 0, 1 };
    int[] a = executeInstructions(3, an, "RRDDLU"); // zuuuut
    for (int i : a) {
      System.out.print(i + " ");
    }
  }

  static int[] executeInstructions(int n, int[] startPos, String s) {
    int x = startPos[1];
    int y = startPos[0];
    int moves = 0;
    int[] ans = new int[s.length()];
    n--;

    for (int j = 0; j < ans.length; j++) {
      System.out.println(s);

      for (int i = 0; i < s.length(); i++) {
        if ((s.charAt(i) == 'L')) {
          if (x == 0) break;
          x--;
        }
        if ((s.charAt(i) == 'R')) {
          if (x == n) break;
          x++;
        }

        if ((s.charAt(i) == 'U')) {
          if (y == 0) break;
          y--;
        }
        if ((s.charAt(i) == 'D')) {
          if (y == n) break;
          y++;
        }
        moves++;

        System.out.println(x + " " + y + "  -  " + moves);
      }

      ans[j] = moves;
      moves = 0;
      x = startPos[1];
      y = startPos[0];
      s = s.substring(1);
    }
    // System.out.println(moves);
    return ans;
  }
}
// int ans[] = new int[s.length()];
// int x = startPos[0], y = startPos[1];
// for (int i = 0; i < s.length(); i++) {
//     String hold = s.substring(i);
//     while (ans[i] < hold.length()) {
//         if ((hold.charAt(ans[i]) == 'L')) {
//             if (x == 0)
//                 break;
//             x--;
//         }
//         if ((hold.charAt(ans[i]) == 'R')) {
//             if (x + 1 == n)
//                 break;
//             x++;
//         }
//         if ((hold.charAt(ans[i]) == 'U')) {
//             if (y == 0)
//                 break;
//             y--;
//         }
//         if ((hold.charAt(ans[i]) == 'D')) {
//             if (y + 1 == n)
//                 break;
//             y++;
//         }
//         ans[i]++;
//     }
//     x = startPos[0];
//     y = startPos[1];
// }
// return ans;
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
