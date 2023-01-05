import java.util.ArrayList;

public class QueriesonaPermutationWithKey {
    public static void main(String[] args) {
        int[] a = { 7, 5, 5, 8, 3 };

for (int i :processQueries(a, 8)) {
    System.out.print(i+" ");
}
    }

    static int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        ArrayList<Integer> hold = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            hold.add(i, i + 1);
        }

        for (int i = 0; i < queries.length; i++) {
            ans[i] = hold.indexOf(queries[i]);
            int t = hold.get(hold.indexOf(queries[i]));
            hold.remove(hold.indexOf(queries[i]));
            hold.add(0, t);
        }
        return ans;
    }
}
