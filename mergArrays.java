import java.util.Arrays;

public class mergArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int  m =3;
         int[] nums2 = {1,2,3};
         int  n = 3;
         merge(nums1 , m , nums2 , n); 
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     for (int i = m , j =0; i < m+n; i++,j++) {
        nums1[i] = nums2[j];
     }
     Arrays.sort(nums1);
     for (int i = 0; i < nums1.length; i++) {
        System.out.print(nums1[i]+"  ");
     }
    }
}
