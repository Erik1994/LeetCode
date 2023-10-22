package two_pointers

import kotlin.math.min

/**
 *
 * You are given an integer array [height] of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store.
 * Notice that you may not slant the container.
 *
 **/

fun maxArea(height: IntArray): Int {
    var maxArea = 0
    var l = 0
    var r = height.size - 1
    val subtraction: (Int, Int) -> Int = { a, b ->
        b - a
    }
    val assignIfBigger : (Int) -> Unit =  {
        if (it > maxArea) {
            maxArea = it
        }
    }
    while (l < r) {
        val area = subtraction(l, r) * min(height[l], height[r])
        assignIfBigger(area)
        if (height[l] < height[r]) {
            ++l
        } else {
            --r
        }
    }
    return maxArea
}