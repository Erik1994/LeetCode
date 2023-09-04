/**
 *
 * Given an integer array [num] and an integer [k].
 * Return the [k] most frequent element.
 * You may return the answer in any order.
 *
 **/

fun topKFrequentElement(num: List<Int>, k: Int): List<Int> {
    val map = hashMapOf<Int, Int>()
    val frequencyArr: List<MutableList<Int>> = List(num.size + 1) { mutableListOf<Int>() }
    num.forEach {
        map[it] = map[it]?.plus(1) ?: 1
    }
    map.forEach { (element, count) ->
        frequencyArr[count].add(element)
    }
    val result = mutableListOf<Int>()
    for (i in (frequencyArr.size - 1) downTo 0) {
        frequencyArr[i].forEach {
            if (result.size == k) {
                return result
            }
            result.add(it)
        }
    }
    return result
}