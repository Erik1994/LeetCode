package arrays_and_hashing

/**
 *
 * Given an integer array [nums] of length n,
 * you want to create an array ans of length 2n where ans[i] == nums[i] and
 * ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 *
 * Specifically, ans is the concatenation of two nums arrays.
 *
 * Return the array ans.
 **/


fun getConcatenation(nums: IntArray, times: Int): IntArray {
    val result = mutableListOf<Int>()
    repeat(times) {
        for (i in nums) {
            result.add(i)
        }
    }

    return result.toIntArray()
}

fun getConcatenation(nums: IntArray): IntArray {
    val result = IntArray(nums.size * 2)
    for (i in nums.indices) {
        result[i] = nums[i]
        result[i + nums.size] = nums[i]
    }
    return result
}
