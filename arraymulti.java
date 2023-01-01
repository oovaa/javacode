import java.util.Scanner;

public class arraymulti {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows1 = 0, columns1 = 0, rows2 = 0, columns2 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("enter first array's rows");
            rows1 = s.nextInt();
            System.out.println("enter first array's columns");
            columns1 = s.nextInt();
            System.out.println("enter second array's rows");
            rows2 = s.nextInt();
            System.out.println("enter second array's columns");
            columns2 = s.nextInt();

            if (columns1 == rows2)
                break;
            else {
                if (i == 2) {
                    System.out.println("sorry out of efforts !");
                    return;
                }
                System.out.println("try again !!");
            }

        }

        arrayCreator arr1 = new arrayCreator(rows1, columns1);
        arrayCreator arr2 = new arrayCreator(rows2, columns2);

        System.out.println("\n----fill first array---- \n");
        arr1.fillArray();
        System.out.println("\n----fill second array----\n");
        arr2.fillArray();
        System.out.println();
        arr1.PrintArray();
        System.out.println("\n----------------------------");
        arr2.PrintArray();

        arrayCreator result = arrayCreator.multipliArrays(arr1, arr2);
        System.out.println("\n \nhear is the result \n \n");
        result.PrintArray();
        s.close();
    }
}

class arrayCreator {
    Scanner s = new Scanner(System.in);
    int[][] arr;

    arrayCreator() {
        this(0, 0);
    }

    arrayCreator(int n, int m) {
        arr = new int[n][m];
    }

    void setElement(int n, int m, int e) {
        this.arr[n - 1][m - 1] = e;
    }

    int getElelment(int n, int m) {
        return this.arr[n - 1][m - 1];
    }

    int getRows() {
        return this.arr.length;
    }

    int getColumns() {
        return this.arr[0].length;
    }

    // boolean check(arrayCreator arr1, arrayCreator arr2) {
    // if (arr1.getColumns() == arr2.getRows()) {
    // return true;
    // } else
    // return false;
    // }
    void fillArray() {
        for (int i = 1; i < this.getRows() + 1; i++) {
            for (int j = 1; j < this.getColumns() + 1; j++) {
                System.out.println("enter element at row " + (i) + " column " + (j));
                this.setElement(i, j, s.nextInt());
            }
        }
    }

    static arrayCreator multipliArrays(arrayCreator arr1, arrayCreator arr2) {
        arrayCreator result = new arrayCreator(arr1.getRows(), arr2.getColumns());
        int hold = 0;
        for (int i = 1; i < result.getRows() + 1; i++) {
            for (int j = 1; j < result.getColumns() + 1; j++) {
                hold = 0;
                for (int k = 1; k < arr1.getColumns() + 1; k++) {
                    hold += arr1.getElelment(i, k) * arr2.getElelment(k, j);
                }
                result.setElement(i, j, hold);
            }
        }

        return result;
    }

    void PrintArray() {
        for (int i = 1; i < this.getRows() + 1; i++) {
            if (i > 1)
                System.out.println("\n------------");

            for (int j = 1; j < this.getColumns() + 1; j++) {
                System.out.print("| " + this.getElelment(i, j) + " |");
            }
        }
    }
}