/**
 *
 * Given two strings [s] and [t], return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 **/

fun isAnagramSolutionOne(s: String, t: String): Boolean {
    return s.toCharArray().sorted().joinToString() == t.toCharArray().sorted().joinToString()
}

fun isAnagramSolutionTwo(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val countS = hashMapOf<Char, Int>()
    val countT = hashMapOf<Char, Int>()
    s.forEachIndexed { index, c ->
        countS[c] = 1 + (countS[c] ?: 0)
        countT[t[index]] = 1 + (countT[t[index]] ?: 0)
    }
    countS.forEach { (t, u) ->
        if (u != countT[t]) {
            return false
        }
    }
    return true
}
