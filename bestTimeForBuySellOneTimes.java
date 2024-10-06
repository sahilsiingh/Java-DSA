public class bestTimeForBuySellOneTimes {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buyprice = prices[0];
        if (prices == null || prices.length < 2) {
            return 0;
        }

        for(int i =1; i<prices.length ; i++){
            if(buyprice > prices[i]){
                buyprice = prices[i];
            }
            profit =Math.max(profit,prices[i] - buyprice);
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] prices = {8,2,6,4,8,1,3,8};
        System.out.println(maxProfit(prices));
    }
}