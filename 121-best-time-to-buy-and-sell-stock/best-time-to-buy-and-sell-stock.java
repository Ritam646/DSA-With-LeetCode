class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            int curr_profit = prices[i] - min_price;
            if(curr_profit>profit){
                profit = curr_profit;

            }
            if(prices[i] < min_price) {
                min_price = prices[i];
            }

        }
        return profit;

    }
}