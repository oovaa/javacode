class quickSort {
    public static void main(String[] args) {
        int[] a = { 5, 2, 4, 1, 6, 7, 8, 9, 3 };
        quicsort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    private static void quicsort(int[] a, int start, int end) {
        if (end <= start)
            return;
        int pivot = partition(a, start, end);
        quicsort(a, start, pivot - 1);
        quicsort(a, pivot + 1, end);
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[end];
        int i = start - 1;
        for (int j = start; j < end - 1; j++) {
            if (a[j] < pivot) {
                i++;
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
        i++;
        int t = a[i];
        a[i] = a[end];
        a[end] = t;
        return i;
    }

}