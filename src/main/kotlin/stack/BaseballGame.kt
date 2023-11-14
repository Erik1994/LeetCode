package stack

/**
 *
 * You are keeping the scores for a baseball game with strange rules.
 * At the beginning of the game, you start with an empty record.
 *
 * You are given a list of strings [operations], where operations[i] is the ith operation
 * you must apply to the record and is one of the following:
 *
 * An integer x - Record a new score of x.
 * '+' - Record a new score that is the sum of the previous two scores.
 * 'D' - Record a new score that is the double of the previous score.
 * 'C' - Invalidate the previous score, removing it from the record.
 *
 * Return the sum of all the scores on the record after applying all the operations.
 *
 **/

fun calPoints(operations: Array<String>): Int {
    var sum = 0
    val scoreStack = ArrayDeque<Int>()
    operations.forEach {
        when(it) {
            "+" -> {
                val newScore = scoreStack.first() + scoreStack[1]
                scoreStack.addFirst(newScore)
                sum += newScore
            }
            "D" -> {
                val newScore = scoreStack.first() * 2
                scoreStack.addFirst(newScore)
                sum += newScore
            }
            "C" -> {
                val removedScore = scoreStack.removeFirst()
                sum -= removedScore
            }
            else -> {
                val newScore = it.toInt()
                scoreStack.addFirst(newScore)
                sum += newScore
            }
        }
    }
    return scoreStack.sum()
}