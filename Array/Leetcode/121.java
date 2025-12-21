//buy and sell stock
class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;

        for (int i = 0; i < prices.length; i++) {
            int maxi = prices[i];  // reset for every i

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > maxi) {
                    maxi = prices[j];
                }
            }

            ans = Math.max(ans, maxi - prices[i]);
        }
        return ans;
    }
}
class Sol{
    public static int maxProfit(int[] prices){
        int ans = 0;
        //find min_value of the array and its index
        int min_ans = 0;
        int index= -1;
        for(int i =0;i<prices.length;i++){
          min_ans = Math.min(min_ans,prices[i]);
          index = i;
        }
        //find the next greater element from the index
        int max_ans= 0;
        for(int j = index; j< prices.length;j++){
            max_ans = Math.max(max_ans,prices[j]);
        }
        ans = max_ans - min_ans;
        
    }
}