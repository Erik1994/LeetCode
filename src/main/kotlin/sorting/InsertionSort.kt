package sorting

/**
 * Insertion sort is stable (when two item are equal they keep their position)
 *
 * Best time complexity - O(n)
 *
 * Worst time complexity - O(n2)
 *
 **/

fun insertionSort(array: IntArray) {
    for (i in 1 until array.size) {
        var j = i - 1
        while (j >= 0 && array[j+1] < array[j]) {
            array[j] = array[j] + array[j + 1]
            array[j + 1] = array[j] - array[j + 1]
            array[j] = array[j] - array[j + 1]
            --j
        }
    }
}