import java.util.Scanner;

public class MultiplyArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // The first array
        System.out.println("Enter the rows of the first array");
        int r1 = scn.nextInt();
        System.out.println("Enter the colomns of the first array");
        int c1 = scn.nextInt();
        int[][] one = new int[r1][c1];

        // Entering the elements of the 1st array
        System.out.println("Enter the elements ");
        for (int i = 0; i < one.length; i++) {

            for (int j = 0; j < one[0].length; j++) {

                one[i][j] = scn.nextInt();
            }

        }
        // The Second array
        System.out.println("Enter the rows of the Second array");
        int r2 = scn.nextInt();
        System.out.println("Enter the colomns of the Second array");
        int c2 = scn.nextInt();
        int[][] two = new int[r2][c2];

        // Entering the elements of the 2st array
        for (int i = 0; i < two.length; i++) {
            System.out.println("Enter the elements ");
            for (int j = 0; j < two[0].length; j++) {
                System.out.println("Enter the elements of the coloumns");

                two[i][j] = scn.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("INVALID MATRIX");
        } else {

            int[][] result = new int[r1][c2];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    for (int k = 0; k < c1; k++) {
                        result[i][j] += one[i][k] * two[k][j];
                    }
                }

            }
            System.out.println("Here is the result");
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        }
        scn.close();
    }
}