package stack


/**
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * 1.Open brackets must be closed by the same type of brackets.
 * 2.Open brackets must be closed in the correct order.
 * 3.Every close bracket has a corresponding open bracket of the same type.
 *
 **/

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false
    val bracketsMap = hashMapOf(
        '(' to ')',
        '[' to ']',
        '{' to '}'
    )
    val openingBracketsStack = ArrayDeque<Char>()
    s.forEach {
       if (bracketsMap.containsKey(it)) {
           openingBracketsStack.addFirst(it)
       } else {
           if (openingBracketsStack.isEmpty() || bracketsMap[openingBracketsStack.removeFirst()] != it) {
               return false
           }
       }
    }
    return openingBracketsStack.isEmpty()
}