open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun makeNoise () {
        println("The animal is making noise..")
    }
    open fun eat() {
        println("The animal is eating..")
    }
    open fun roam() {
        println("The animal is roaming..")
    }
    fun sleep() {
        println("The animal is sleeping..")
    }
}

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food.")
    }
}

open class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming..")
    }
}

class Wolf: Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println(println("hoowwwwww!"))
    }

    override fun eat() {
        println("The wold is eating $food")
    }
}

class Vet {
    fun giveShot(animal: Animal) {
        // Code to do something medical to an animal
        animal.makeNoise()
    }
}

fun main(args: Array<String>) {
    val w = Wolf()
    w.makeNoise()
    w.roam()
    w.sleep()

    val animals = arrayOf<Animal>(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}