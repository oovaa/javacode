import java.util.Arrays;

public class mid {
    public static void main(String[] args) {
        int[] ar1 = {1,2};
        int[] ar2 = {3,4};
        findMedianSortedArrays(ar1 , ar2);
    }
    public static void findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
     double sum = nums1.length + nums2.length;
    int[] arr3 = new int[(int)sum];
   for (int i = 0; i < nums1.length; i++) {
    arr3[i] = nums1[i];
   }
   for (int i = nums1.length, j=0; i < arr3.length; i++ ,j++) {
    arr3[i]= nums2[j];
   }
   Arrays.sort(arr3);

   if (sum%2 != 0) {
    ans = (sum+1)/2;

} else {
    double sum1;
    double sum2;
    sum1 = sum/2;
    sum2 = (sum+1)/2;
    ans = (sum1+sum2)/2;
        }
        
}
}