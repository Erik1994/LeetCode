package sliding_window

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
    var dayToBuy = 0
    var dayToSell = 1
    var profit = 0
    while (dayToSell < prices.size) {
        if (prices[dayToSell] < prices[dayToBuy]) {
            dayToBuy = dayToSell
            ++dayToSell
        } else {
            val temp = prices[dayToSell] - prices[dayToBuy]
            if (temp > profit) {
                profit = temp
            }
            ++dayToSell
        }
    }
    return profit
}