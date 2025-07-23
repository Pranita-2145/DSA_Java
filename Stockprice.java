package DSA_Java;

public class Stockprice {
    public static int BuyAndSell(int prices[]) {
        int maxProfit = 0;
        int buyprice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if(buyprice<prices[i]){
                int profit =  prices[i] - buyprice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyprice = prices[i];
            }

        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(BuyAndSell(prices));
    }
}
