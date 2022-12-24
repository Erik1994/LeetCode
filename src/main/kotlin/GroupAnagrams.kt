/**
 *
 * Given an array of strings [strs], group the anagrams together.
 * You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 **/

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val groupedAnagrams = hashMapOf<List<Int>, MutableList<String>>()
    strs.forEach { str ->
        val azLetterCountsLowercase = MutableList(size = 26) { 0 } //a..z count is 26
        str.forEach { c ->
            azLetterCountsLowercase[c.code - 'a'.code] += 1 // here a is mapped in index 0 ... and z is mapped in index 25
        }
        groupedAnagrams[azLetterCountsLowercase] =
            groupedAnagrams[azLetterCountsLowercase]?.apply { add(str) } ?: mutableListOf(str)
    }
    return groupedAnagrams.values.toList()
}