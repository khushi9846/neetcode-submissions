class Solution {
    fun maxProfit(prices: IntArray): Int {
        var i = 0 
        var j = prices.size -1 

        var profit = 0
        while(i<j){
            for(k in i+1..j){
            var currentprofit = prices[k] - prices[i]
            profit= maxOf(profit, currentprofit)
           }
            i++

            // if(prices[j] > prices[i])
            // {
            //    var currentprofit = prices[j] - prices[i]
            //    profit = maxOf(profit, currentprofit)
            //     i++
            // } else j--
        }

        return profit
    }
}
