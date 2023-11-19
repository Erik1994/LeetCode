package linkedlist

/**
 *
 * Given the head of a singly linked list,
 * reverse the list, and return the reversed list.
 *
 * Example:
 *  * var li = ListNode(5)
 *  * var v = li.`val`
 *  * Definition for singly-linked list.
 *  * class ListNode(var `val`: Int) {
 *  *     var next: ListNode? = null
 *  * }
 **/

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) return null
    var current = head
    var previous: ListNode? = null

    while (current != null) {
        val next = current.next
        current.next = previous
        previous = current
        current = next
    }
    return previous
}