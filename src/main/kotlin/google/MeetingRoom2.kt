package google

import kotlin.math.max

/**
 *
 * Given an array of meeting time [intervals] consisting of start and times [[s1, e1],
 * [s2, e2], ...] (si < ei)
 * find the minimum number if conference rooms required
 *
 **/

data class Interval(val start: Int, val end: Int)

fun minMeetingRooms(intervals: Array<Interval>): Int {
    val startTimeList = mutableListOf<Int>()
    val endTimeList = mutableListOf<Int>()
    var start = 0
    var end = 0
    var count = 0
    var result = 0
    for (interval in intervals) {
        startTimeList.add(interval.start)
        endTimeList.add(interval.end)
    }
    startTimeList.sort()
    endTimeList.sort()
    while (start < intervals.size) {
        if (startTimeList[start] < endTimeList[end]) {
            ++start
            ++count
        } else {
            ++end
            --count
        }
        result = max(result, count)
    }
    return result
}