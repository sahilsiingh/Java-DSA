public class bestTimeForBuySellnTimes {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        if (prices == null || prices.length < 2) {
            return 0;
        }

        for(int i =1; i<prices.length ; i++){
            if(prices[i] > prices[i-1]){
                profit +=(prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] prices = {8,2,6,4,8,1,3,8};
        System.out.println(maxProfit(prices));
    }
}