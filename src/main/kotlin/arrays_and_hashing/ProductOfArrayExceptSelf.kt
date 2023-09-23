package arrays_and_hashing

/**
 *
 * Given an integer array [nums], return an array answer such that answer[i]
 * is equal to the product of all the elements of nums except nums[i].
 *
 **/

fun arrayItemProduct(nums: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    var p = 1
    nums.forEach {
        p *= it
    }
    nums.forEach {
        result.add(p/it)
    }
    return result
}