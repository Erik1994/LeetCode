package sorting

/**
 * Merge sort can be stable, it depends on implementation
 * (when two item are equal they keep their position)
 *
 * Worst time complexity - nlogn
 *
 **/

fun mergeSort(array: IntArray): IntArray {
    fun merge(array: IntArray, leftP: Int, midP: Int, rightP: Int) {
        val leftArray = array.copyOfRange(leftP, midP + 1)
        val rightArray = array.copyOfRange(midP + 1, rightP + 1)
        var i = leftP
        var j = 0
        var k = 0

        while (j < leftArray.size && k < rightArray.size) {
            if (leftArray[j] <= rightArray[k]) {
                array[i] = leftArray[j]
                ++j
            } else {
                array[i] = rightArray[k]
                ++k
            }
            ++i
        }

        while (j < leftArray.size) {
            array[i] = leftArray[j]
            ++j
            ++i
        }

        while (k < rightArray.size) {
            array[i] = rightArray[k]
            ++k
            ++i
        }
    }

    fun sort(array: IntArray, leftP: Int, rightP: Int): IntArray {
        if (leftP == rightP) return array
        val midP = (leftP + rightP) / 2
        sort(array, leftP, midP)
        sort(array, midP + 1, rightP)
        merge(array, leftP, midP, rightP)
        return array
    }

    return sort(array, 0, array.size - 1)
}