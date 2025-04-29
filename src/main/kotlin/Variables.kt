fun main() {
    // Integers
    var x = 6
    x = x + 12
    x += 23
    x -= 10
    println(x)

    // Booleans
    var isBarking = true
    var isRaining = false
    println(!isBarking)
    println(isRaining)

    // Strings
    var name = "Fido"
    println("Hey my dog name is $name.")

    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val arraySize1 = wordArray1.size
    val arraySize2 = wordArray2.size
    val arraySize3 = wordArray3.size
    println(arraySize1)
    println(arraySize2)
    println(arraySize3)

    
}