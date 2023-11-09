package google

import kotlin.math.abs

/**
 * You are given a stream of points on the X-Y plane. Design an algorithm that:
 *
 * 1.Adds new points from the stream into a data structure.
 * Duplicate points are allowed and should be treated as different points.
 * 2.Given a query point, counts the number of ways to choose three points from the data structure
 * such that the three points and the query point form an axis-aligned square with positive area.
 * 3.An axis-aligned square is a square whose edges are all the same length and are either parallel or
 * perpendicular to the x-axis and y-axis.
 *
 * Implement the DetectSquares class:
 *
 * DetectSquares() Initializes the object with an empty data structure.
 * void add(int[] point) Adds a new point point = [x, y] to the data structure.
 * int count(int[] point) Counts the number of ways to form axis-aligned squares with point = [x, y] as described above.
 *
 **/


class DetectSquares() {

    private val hashMap = hashMapOf<Pair<Int, Int>, Int>() // point to count of this point

    fun add(point: IntArray) {
        hashMap[point[0] to point[1]] = hashMap.getOrDefault(point[0] to point[1], 0) + 1
    }

    fun count(point: IntArray): Int {
        var count = 0
        val (x,y) = point
        for ((k, v) in hashMap) {
            val (mX, mY) = k
            if (abs(mX - x) == abs(mY - y) && x != mX && y != mY) {
                count += hashMap.getOrDefault(x to mY, 0) * hashMap.getOrDefault(mX to y, 0) * v//0 if the possible point doesn't exist
            }
        }
        return count
    }

}