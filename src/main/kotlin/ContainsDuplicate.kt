/**
 *
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 **/

fun containsDuplicateSolutionOne(nums: IntArray): Boolean {
     nums.sort()
     for (i in 0 until nums.size - 1) {
         if (nums[i] == nums[i + 1]) {
             return true
         }
     }
     return false
}

fun containsDuplicateSolutionTwo(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    nums.forEach {
        if (set.contains(it)) {
            return true
        }
        set.add(it)
    }
    return false
}