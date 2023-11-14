package stack

import kotlin.math.min

/**
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 *
 **/

class MinStack {
    private class Node(var `val`: Int, var min: Int, var next: Node?)

    private var head: Node? = null

    fun push(x: Int) {
        head = head?.let {
            Node(x, min(x,it.min),it)
        } ?: Node(x,x,null)
    }

    fun pop() {
        head = head?.next
    }

    fun top(): Int? {
        return head?.`val`
    }

    fun getMin(): Int? {
        return head?.min
    }
}