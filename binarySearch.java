public class binarySearch {
    public static void main(String[] args) {
        int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
           // System.out.print(a[i] + " ");
        }

        System.out.println(BinarySearch(a, 1 ));
    }

    static String interpolationSearch(int[] arr, int tar) {// legand
        int high = arr.length - 1, low = 0, prop;

        while (tar >= arr[low] && tar <= arr[high] && low <= high) {
            prop = low + (high - low) * (tar - arr[low]) /
                    (arr[high] - arr[low]);
            System.out.println("prop " + prop);

            if (arr[prop] == tar)
                return arr[prop] + " : " + prop;
            else if (arr[prop] < tar)
                low = prop + 1;
            else
                high = prop - 1;
        }
        return "not found";
    }

    static String BinarySearch(int[] arr, int target) {
        int val, front = 0, end = arr.length - 1, mid;

        while (front <= end) {
            mid = (front + end ) / 2;
            val = arr[mid];
            System.out.println(val);

            if (val < target) {
                front = mid + 1;
            } else if (val > target) {
                end = mid - 1;
            } else {
                return mid + " : " + val;
            }
        }

        return "not found";
    }

}
