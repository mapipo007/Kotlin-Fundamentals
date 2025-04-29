fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    foo(6)
    printSum(34, 16)
    max(34, 76)
}

fun foo(param: Int) {
    println("Parameter is $param")
}

fun printSum(int1: Int, int2: Int) {
    val result = int1 + int2
    println("Result = $result")
}

fun max(a: Int, b: Int): Int {
    val maxValue = if (a > b) a else b
    return maxValue
}

fun min(a: Int, b: Int) = if (a < b) a else b  // both min and ma functions are the same in syntaxes