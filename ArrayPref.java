public class ArrayPref {
    public static void main(String[] args) {
        int[] a = { 5, 2, 0, 3, 1 };
        int t[] = findArray(a);
        for (int i : t) {
            System.out.println(i);
        }
        // int w = 2;

        // System.out.println((Integer.toBinaryString(w)));
    }

    static int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; --i)
            pref[i] ^= pref[i - 1];
        return pref;

    }
}
