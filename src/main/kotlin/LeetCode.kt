import two_pointers.bestTimeToBuySellStock
import two_pointers.validPalindromeSolution2

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

    val profit1 = bestTimeToBuySellStock(intArrayOf(7,1,5,3,6,4))
    val profit2 = bestTimeToBuySellStock(intArrayOf(7,6,4,3,1))
    println(profit1)
    println(profit2)
}
