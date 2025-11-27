package neetCode250.SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        //Brute force
        /*
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++){
            for (int j = i+1; j < prices.length; j++){
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(profit, maxProfit);
            }
        }

        return maxProfit;
        */

        //Sliding Window
        int maxProfit = 0;
        int l = 0;
        int r = 1;

        while (r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                l = r;
            }
            r++;
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        //int[] prices = {5,11, 6,7,1, 10};
        int profit = BestTimeToBuyAndSellStock.maxProfit(prices);
        System.out.println("Maximum profit: " + profit);
    }
}
