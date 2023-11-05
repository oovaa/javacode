public class ProductofArrayExceptSelf {

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 4 };
    int[] result1 = productExceptSelf(nums1);
    printArray(result1); // Output: [24, 12, 8, 6]

    // Test case 2
    int[] nums2 = { -1, 1, 0, -3, 3 };
    int[] result2 = productExceptSelf(nums2);
    printArray(result2); // Output: [0, 0, 9, 0, 0]
  }

  static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] leftProducts = new int[n];
    int[] rightProducts = new int[n];
    int[] result = new int[n];

    // Calculate the product of all elements to the left of each element
    int leftProduct = 1;
    for (int i = 0; i < n; i++) {
        leftProducts[i] = leftProduct;
        leftProduct *= nums[i];
    }

    // Calculate the product of all elements to the right of each element
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        rightProducts[i] = rightProduct;
        rightProduct *= nums[i];
    }

    // Multiply the corresponding elements from left and right arrays
    for (int i = 0; i < n; i++) {
        result[i] = leftProducts[i] * rightProducts[i];
    }

    return result;
  }

  private static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }
}

//   static int[] productExceptSelf(int[] nums) {
//     int n = nums.length;
//     int pre[] = new int[n];
//     int suff[] = new int[n];
//     pre[0] = 1;
//     suff[n - 1] = 1;
    
//     for(int i = 1; i < n; i++) {
//         pre[i] = pre[i - 1] * nums[i - 1];
//     }
//     for(int i = n - 2; i >= 0; i--) {
//         suff[i] = suff[i + 1] * nums[i + 1];
//     }
    
//     int ans[] = new int[n];
//     for(int i = 0; i < n; i++) {
//         ans[i] = pre[i] * suff[i];
//     }
//     return ans;

//   }