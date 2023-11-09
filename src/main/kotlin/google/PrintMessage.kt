package google

/**
 *
 * Given a list of messages and the date/time,
 * print each message if it is not printed in the last 10 seconds.
 * It is possible that several messages arrive roughly at the same time (within 1 second)
 *
 **/

class MessagePrinter {
    private val cache = hashSetOf<String>()
    private val last10 = ArrayDeque<Pair<Int, String>>()

    fun shouldPrintMessage(timeStamp: Int, message: String): Boolean {
        while (last10.isNotEmpty()) {
            val item = last10.first()
            if (timeStamp - item.first >= 10) {
                last10.removeFirst()
                cache.remove(item.second)
            } else {
                break
            }
        }
        if (cache.contains(message)) {
            return false
        }
        cache.add(message)
        last10.add(Pair(timeStamp, message))
        return false
    }
}