package com.datastructures.dynamicprogramming;

public class LC121EBestTimetoBuyandSellStock {

        public int maxProfit(int[] prices) {

            int profit =0;
            int minimum = Integer.MAX_VALUE;
            for (int i=0 ; i < prices.length ; ++i){
                profit = Math.max(profit, prices[i] - minimum);
                minimum = Math.min(prices[i], minimum);
            }
            return profit;
        }
}
