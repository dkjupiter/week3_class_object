package example.myapp

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

//fun String..example.myapp.hasSpaces(): Boolean {
//    val found = this.indexOf(' ')
//    // also valid: this.indexOf(" ")
//    // returns positive number index in String or -1 if not found
//    return found != -1
//}

fun String.hasSpaces() = indexOf(" ") != -1

//class example.myapp.AquariumPlant(val color: String, private val size: Int)
//
//fun example.myapp.AquariumPlant.isRed() = color == "red"    // OK
//fun example.myapp.AquariumPlant.isBig() = size > 50         // gives error

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println(".example.myapp.AquariumPlant")
fun GreenLeafyPlant.print() = println(".example.myapp.GreenLeafyPlant")

//val example.myapp.plant = example.myapp.GreenLeafyPlant(size = 10)
//example.myapp.plant.example.myapp.print()
//println("\n")
//val aquariumPlant: example.myapp.AquariumPlant = example.myapp.plant
//aquariumPlant.example.myapp.print()  // what will it

//fun example.myapp.AquariumPlant?.example.myapp.pull() {
//    this?.apply {
//        println("removing $this")
//    }
//}
//
//val example.myapp.plant: example.myapp.AquariumPlant? = null
//example.myapp.plant.example.myapp.pull()
//
//val example.myapp.AquariumPlant.isGreen: Boolean
//    get() = color == "green"
//
//aquariumPlant.isGreen

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

val plant: AquariumPlant? = null
plant.pull()