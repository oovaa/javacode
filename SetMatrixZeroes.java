import java.util.ArrayList;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        setZeroes(new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } });
    }

    static void setZeroes(int[][] matrix) {
        ArrayList<Integer> p = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    p.add(i);
                    p.add(j);
                }
            }
        }

        for (int i = 0; i + 1 < p.size(); i += 2) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][p.get(i + 1)] = 0;
            }
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[p.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
