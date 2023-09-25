package two_pointers

/**
 *
 * YGiven a 1-indexed array of integers [numbers] that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific [target] number.
 * Return the indices of the two numbers, index1 and index2, added by one
 * as an integer array [index1, index2] of length 2.
 * The tests are generated such that there is exactly one solution.
 * You may not use the same element twice.
 * Your solution must use only constant extra space.
 *
 **/


fun twoSum(numbers: IntArray, target: Int): IntArray {
    var left = 0
    var right = numbers.size - 1
    while (left <= right) {
        val sum = numbers[left] + numbers[right]
        if (sum > target) {
            --right
        } else if (sum < target) {
            ++left
        } else {
            return intArrayOf(++left, ++right)
        }
    }
    return intArrayOf(-1, -1)
}