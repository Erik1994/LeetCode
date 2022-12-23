/**
 *
 * Given an array of integers [nums] and an integer [target],
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order
 *
 **/

fun twoSumSolution1(nums: IntArray, target: Int): IntArray {
    val set = mutableSetOf<Int>()
    nums.forEachIndexed { index, i ->
        val numb = target - i
        if (set.contains(numb)) {
            return intArrayOf(nums.indexOf(numb), index)
        }
        set.add(i)
    }
    return intArrayOf()
}

fun twoSumSolution2(nums: IntArray, target: Int): IntArray {
    val prevMap = HashMap<Int, Int>()
    for (i in nums.indices) {
        val num = nums[i]
        val diff = target - num
        if (prevMap.containsKey(num)) {
            return intArrayOf(prevMap[num]!!, i)
        }
        prevMap[diff] = i
    }
    return intArrayOf()
}


