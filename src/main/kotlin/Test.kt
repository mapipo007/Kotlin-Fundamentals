open class Monster {
    open fun frighten(): Boolean {
        println("Argh!")
        return true
    }
}

class Vampire: Monster() {
    override fun frighten(): Boolean {
        println("Fancy a bite?")
        return false
    }

    fun beScary(): Boolean {
        println("Fancy a bite?")
        return true
    }
}

class Dragon : Monster() {
    override fun frighten(): Boolean {
        println("Fire!")
        return true
    }
}

fun main(args: Array<String>) {
    val m = arrayOf(Vampire(), Dragon(), Monster())
    for (item in m) {
        item.frighten()
    }
    println()
    val v = Vampire()
    v.beScary()
}