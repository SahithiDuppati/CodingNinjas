public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        int maxDiff = 0;
        int min = prices[0];
        int n = prices.length;

        //Approach 1
        // for(int i = 0;i < n; i++){
        //     for(int j = i+1; j < n; j++){
        //         maxDiff = Math.max(maxDiff, prices[j] - prices[i]);
        //     }
        // }
        // return maxDiff;

        //Approach 2
        // int[] array = new int[n];
        // for(int i = 1; i < n; i++){
        //     if(prices[i] > min){
        //         array[i] = prices[i] - min;
        //     }else{
        //         min = Math.min(min, prices[i]);
        //         array[i] = 0;
        //     } 
        // }
        // int index = 0;
        // for(int i = 0; i < n; i++){
        //     if(maxDiff < array[i]){
        //         index = i;
        //         maxDiff = array[i];
        //     }
        // }

        //Approach 3
        int cost = 0;
        for(int i = 0;i < n; i++){
            min = Math.min(min, prices[i]);
            maxDiff = prices[i] - min;
            cost = Math.max(maxDiff, cost);
        }
        return cost;
    }
}
