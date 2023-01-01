public class countingBits {
    public static void main(String[] args) {
        countBits(7);
    }

    public static void countBits(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            int h = i;
            int ans = 0;
            while (h > 0) {

                if (h % 2 == 1) {
                    ans++;
                }
                h /= 2;
            }
            arr[i] = ans;
            System.out.print(arr[i]);
        }

    }
}
