import java.util.Timer;

public class searchAlgos {
    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 7, 8, 4, 2, 5, 1 };
        int ans[] = insertion(arr);
        
        for (int i : ans) {
            System.out.print(i + " ");
        }
        // zoooot
    }

    private static int[] insertion(int[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            int t = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > t; j--) { //reversed (<t)
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = t;
        }

        return arr;
    }
    static int[] buble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }

    static int[] select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }

        return arr;
    }

}
