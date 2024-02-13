package arrays_and_hashing

import kotlin.math.max

/**
 *
 * Given an unsorted array of integers [nums],
 * return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 **/


fun longestConsecutive(nums: IntArray): Int {
    val set = nums.toHashSet()
    var longest = 0
    nums.forEach {
        if (!set.contains(it - 1)) {
            var length = 0
            while (set.contains(it + length)) {
                ++length
            }
            longest = max(longest, length)
        }
    }
    return longest
}