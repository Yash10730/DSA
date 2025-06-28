class Solution {
    public int maxProfit(int[] prices) {
       int buykiya=prices[0];
       int profit=0;
       int maxprofit=0;
       for(int i=1;i<prices.length;i++){
        if(buykiya>prices[i])
        {
            buykiya=prices[i];
        }
         if(buykiya<=prices[i]){
                profit=prices[i]-buykiya;
                maxprofit=Math.max(profit,maxprofit);
            }
       }
        return maxprofit;
    }
}