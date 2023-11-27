import arrays_and_hashing.getConcatenation
import arrays_and_hashing.removeDuplicates
import google.Interval
import google.minMeetingRooms
import sorting.insertionSort
import sorting.mergeSort
import stack.calPoints

fun main() {
    /**
     * Contains Duplicate
     */
//    println(containsDuplicateSolutionOne(intArrayOf(1,2,3,1)))
//    println(containsDuplicateSolutionTwo(intArrayOf(1,2,3,1)))
//    println(containsDuplicateSolutionOne(intArrayOf(1,2,3,4)))
//    println(containsDuplicateSolutionTwo(intArrayOf(1,2,3,4)))

    /**
     * Valid Anagram
     */

//    println(isAnagramSolutionOne("anagram", "naagram"))
//    println(isAnagramSolutionOne("car", "rac"))
//    println(isAnagramSolutionOne("table", "lable"))
//
//    println(isAnagramSolutionTwo("anagram", "naagram"))
//    println(isAnagramSolutionTwo("car", "rac"))
//    println(isAnagramSolutionTwo("table", "lable"))

    /**
     * Two Sum
     */

//    println(twoSumSolution1(intArrayOf(2,7,11,15), 22).toList())
//    println(twoSumSolution2(intArrayOf(2,7,11,15), 22).toList())

    /**
     * Group Anagram
     */

//    val groupAnagram = groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))
//    println(groupAnagram)

    /**
     * Top K Frequent Element
     */

//    val result = topKFrequentElement(listOf(1,1,1,5,5,5,5,5,4,4,6,6,6,6,6,0), 2)
//    println(result)

    /**
     * Product of Array Except Self
     */

//    val result = arrayItemProduct(listOf(1,2,3,4))
//    println(result)

    /**
     * Is valid palindrome
     */

//    val isPalindrome = validPalindromeSolution2("A man, a plan, a canal: Panama")
//    println(isPalindrome)

    /**
     * Best time to buy and sell stock
     */

//    val profit1 = bestTimeToBuySellStock(intArrayOf(7,1,5,3,6,4))
//    val profit2 = bestTimeToBuySellStock(intArrayOf(7,6,4,3,1))
//    println(profit1)
//    println(profit2)

    /**
     * Container with most water
     */

//    println(maxArea(height = intArrayOf(1,8,6,2,5,4,8,3,7)))
//    println(maxArea(height = intArrayOf(1,1)))

    /**
     * Valid parentheses
     */
//
//    val s = "{({})[]}"
//    println(isValid(s))

    /**
     * Meeting room 2
     */
//    val minCount = minMeetingRooms(arrayOf(Interval(0, 30), Interval(5, 10), Interval(10, 20)))
//    println(minCount)

    /**
     * Remove duplicates from sorted array
     */

//    val k = removeDuplicates(intArrayOf(1,1,2))
//    println(k)

    /**
     * Detect squares
     */


    /**
     * Baseball game
     */

//    val scoreSum = calPoints(arrayOf("5","2","C","D","+"))
//    println(scoreSum)

    /**
     * Concatenation of array
     */

//    getConcatenation(intArrayOf(1,3,2,1), 2).forEach {
//        println(it)
//    }
//    getConcatenation(intArrayOf(1,3,2,1)).forEach {
//        println(it)
//    }

    /**
     * Insertion sort
     */

//    val array = intArrayOf(2,5,2,3,0,1)
//    insertionSort(array)
//    array.forEach {
//        print("$it, ")
//    }

    /**
     * Merge sort
     */

    val array = mergeSort(intArrayOf(2,5,2,3,0,1))
    array.forEach {
        print("$it, ")
    }
}