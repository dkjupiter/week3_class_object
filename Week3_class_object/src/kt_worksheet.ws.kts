// val twoLists = fish.partition { isFreshWater(it) }
// println("freshwater: ${twoLists.first}")
// println("saltwater: ${twoLists.second}")

val equipment = "fish net" to "catching fish"
println("${equipment.first} used for ${equipment.second}") //fish net used for catching fish

val numbers = Triple(6, 9, 42)
println(numbers.toString())
println(numbers.toList())
//(6, 9, 42)
//[6, 9, 42]

val equipment2 = ("fish net" to "catching fish") to "equipment"
println("${equipment2.first} is ${equipment2.second}\n")
println("${equipment2.first.second}")

// val equipment = "fish net" to "catching fish"
val (tool, use) = equipment
println("$tool is used for $use")

// val numbers = Triple(6, 9, 42)
val (n1, n2, n3) = numbers
println("$n1 $n2 $n3")

val list = listOf(1, 5, 3, 4)
println(list.sum())

val list2 = listOf("a", "bbb", "cc")
// println(list2.sum()) error
println(list2.sumBy { it.length })
for (s in list2.listIterator()) {
    println("$s ")
}

//val scientific = hashMapOf("guppy" to "poecilia reticulata", "catfish" to "corydoras", "zebra fish" to "danio rerio" )
//println (scientific.get("guppy"))
//println(scientific.get("zebra fish"))
//println("scientific.get("swordtail"")
//println(scientific.getOrDefault("swordtail", "sorry, I don't know"))
//println(scientific.getOrElse("swordtail") {"sorry, I don't know"})

//const val rocks = 3
//val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2