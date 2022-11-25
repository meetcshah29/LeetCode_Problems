package Arrays;

public class BuyAndSellStocks 
{

    public static void main(String args[])
    {

    }

    public static int maximumProfit(int prices[])
    {
        int buyPrice = Integer.MAX_VALUE;
        int maximumProfit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                int profit = prices[i] - buyPrice;
                maximumProfit = Math.max(maximumProfit, profit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }

        return maximumProfit;
    }
}
