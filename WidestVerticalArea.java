import java.util.Arrays;

public class WidestVerticalArea {
    public static void main(String[] args) {
        int[][] points = { { 8, 7 }, { 9, 9 }, { 7, 4 }, { 9, 7 } };

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                System.out.print(points[i][j] + " ");
            }
            System.out.print(",");
        }
        System.out.println();
        System.out.println(maxWidthOfVerticalArea(points));
    }

    static int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> a[0] - b[0]);

        int ans = 0;
        for (int i = 1; i < points.length; i++) {
        ans = Math.max(ans, points[i][0] - points[i-1][0]);
        }
        return ans;
    }
}