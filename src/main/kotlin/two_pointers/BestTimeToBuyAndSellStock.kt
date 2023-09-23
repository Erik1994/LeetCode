package two_pointers

/**
 *
 * You are given an array [prices] where prices[i] is the price of a given stock on the i th day.
 * You want to maximize your profit by choosing a single day to buy one stock and
 * choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 *
 **/

fun bestTimeToBuySellStock(prices: IntArray): Int {
    var left = 0
    var right = 1
    var profit = 0
    while (right < prices.size) {
        if (prices[right] < prices[left]) {
            left = right
            ++right
        } else {
            val temp = prices[right] - prices[left]
            if (temp > profit) {
                profit = temp
            }
            ++right
        }
    }
    return profit
}