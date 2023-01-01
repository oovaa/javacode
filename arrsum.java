import java.util.Scanner;

public class arrsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l1;
        int l2;
        int l3;
        int t;
        System.out.println(" size of the first array :");
        l1 = s.nextInt();
        System.out.println("enter size of the sec array :");
        l2 = s.nextInt();
        int[] arr1 = new int[l1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("enter element number " + (i + 1) + " in the first array");
            arr1[i] = s.nextInt();
        }
        int[] arr2 = new int[l2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("enter element number " + (i + 1) + " in the sec array");
            arr2[i] = s.nextInt();
        }
        for (int i = 0, j = 1; j < arr1.length; i++, j++) {
            if (arr1[i] > arr1[j]) {
                t = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = t;
            }
        }
        for (int i = 0, j = 1; j < arr2.length; i++, j++) {
            if (arr2[i] > arr2[j]) {
                t = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = t;
            }
        }
        // for (int i : arr1) {
        //     System.out.print(i + ",");

        // }
        // System.out.println();
        // for (int i : arr2) {
        //     System.out.print(i + ",");

        // }
        l3 = l1 + l2;
        int[] arr3 = new int[l3];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length ,j=0; i < arr3.length ; i++,j++) {
            arr3[i] = arr2[j];
        }
        
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        s.close();
        
    }
}