public class RichestCustomer {
    public static void main(String[] args) {

        int[][] a = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(a));
    }

    static int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 1; j < accounts[i].length; j++) {
                accounts[i][0] += accounts[i][j];
            }

            if (ans < accounts[i][0])
                ans = accounts[i][0];

        }

        return ans;
    }

}
