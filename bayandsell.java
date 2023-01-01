public class bayandsell {
    public static void main(String[] args) {
        int[] prices = { 1,2 };
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int hold = 0;
        int min = prices[0];

        for (int i = 0; i < prices.length ; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            hold = prices[i] - min;
            if (hold > profit) {
                profit = hold;
            }
        }
        return profit;
        // int min = prices[0];
        // int minP = 0;
        // // int maxp;
        // int max = 0;
        // for (int i = 0; i < prices.length; i++) {
        // if (min > prices[i]) {
        // min = prices[i];
        // minP = i;
        // }

        // }
        // if (minP == prices.length - 1) {
        // return 0;
        // } else {
        // for (int i = minP; i < prices.length; i++) {
        // if (max < prices[i]) {
        // max = prices[i];
        // // maxp = i;
        // }
        // }
        // if (max <= min) {
        // return 0;
        // } else {
        // profit = max - min;
        // }

        // }

    }
}
