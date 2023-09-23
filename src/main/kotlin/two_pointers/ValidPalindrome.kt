package two_pointers

/**
 *
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers
 *
 **/

fun validPalindromeSolution1(s: String): Boolean {
    var newString = ""
    for (c in s) {
        if (c.isDigit() || c.isLetter()) {
            newString += c.lowercase()
        }
    }
    return newString == newString.reversed()
}

fun validPalindromeSolution2(s: String): Boolean {
    val s = s.lowercase()
    var i = 0
    var j = s.length - 1
    while (i < j) {
        while (!s[i].isLetterOrDigit() && i < j)
            i++;
        while (!s[j].isLetterOrDigit() && j > i)
            j--;
        if (s[i++] != s[j--]) return false
    }
    return true
}