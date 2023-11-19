package recursion

/**
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence,
 * called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
 * starting from 0 and 1. That is,
 *
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 *
 **/


fun fib(n: Int): Int {
    if (n <= 1) return n

    return fib(n-1) + fib(n-2)
}

fun fibWithoutRecursion(n: Int): Int {
    if (n <=1) return n
    var prev = 0
    var next = 1

    for (i in 2 .. n) {
        next += prev
        prev = next - prev
    }
    return next
}


fun fib(position: Int, previous: Int = 1, next: Int = 1): Int {

    if (position == 0) return 0
    if (position <= 2) return next

    return fib(position - 1, next, previous + next)
}