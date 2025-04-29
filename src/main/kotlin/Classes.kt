fun main() {
    val myDog = Dog("Fido", 70, "mixed")
    myDog.bark()
    println(myDog.name)
    myDog.weight = 17
    myDog.bark()
    println("${myDog.name} weightInKgs = ${myDog.weightInKgs}")  // => 17/2.2 = 7.727.....
    myDog.weight = -2
    println("${myDog.name} weight now is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        println("${myDog.name} enjoys $item.")
    }
    val dogs = arrayOf(
        Dog("Kelpie", 20, "Westie"),
        Dog("Ripper", 10, "Poodle")
    )
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")

    val songOne = Song("The Mesopotamians", "They might be Giants")
    val songTwo = Song("Going underground", "The Jam")
    val songThree = Song("Make me smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
    songOne.play()

    val d = DrumKit(hasHotHat = true, hasSnare = true)
    d.playTopHat()
    d.playToSnare()
    d.hasSnare = false
    d.playToSnare()
    d.playTopHat()

    val dvd = DVDPlayer(true)
    dvd.recordDVD()
    dvd.playDVD()
}

class Dog(
    val name: String,
    weight_param: Int,
    breedParam: String
) {
    init {
        println("Dog $name has been created.")
    }
    var activities = arrayOf("Walks")
    val breed = breedParam.uppercase()
    init {
        println("The breed is $breed")
    }
    // setter
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    // getter
    val weightInKgs: Double
        get() = weight / 2.2


    fun bark() {
        println(if (weight < 20) "Yip!" else "Woof!")
    }
}

class Song(
    val title: String,
    val artist: String
) {
    fun play() {
        println("Playing the song $title by $artist..")
    }
    fun stop() {
        println("Stopped playing $title.")
    }
}

class DrumKit(
    var hasHotHat: Boolean,
    var hasSnare: Boolean
) {
    fun playTopHat() {
        if (hasHotHat) println("ding ding ba-da ding!")
    }
    fun playToSnare() {
        if (hasSnare) println("bang bang bang!")
    }
}

class DVDPlayer(var hasRecorder: Boolean) {
    fun recordDVD() {
        if (hasRecorder) {
            println("DVD recording..")
        }
    }
    fun playDVD() {
        if (hasRecorder) {
            println("DVD playing..")
        }
    }
}

// custom getters and setters
