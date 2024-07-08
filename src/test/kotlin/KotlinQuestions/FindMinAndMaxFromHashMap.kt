package KotlinQuestions

fun main() {
    // Initialize the HashMap with some values
    val map = hashMapOf(
        "a" to 1,
        "b" to 2,
        "c" to 3,
        "d" to 4,
        "e" to 5
    )

    // Adding more values to the HashMap
    map["f"] = 6
    map["g"] = 0

    // Print the HashMap
    println("HashMap: $map")

    // Find the minimum value
    val minEntry = map.minByOrNull { it.value }
    println("minEntry: $minEntry") // Print the entry with the minimum value
    val minValue = minEntry?.value
    if (minValue != null) {
        println("Minimum value: $minValue")
    } else {
        println("Map is empty, no minimum value.")
    }

    // Find the maximum value
    val maxEntry = map.maxByOrNull { it.value }
    println("maxEntry: $maxEntry") // Print the entry with the maximum value
    val maxValue = maxEntry?.value
    if (maxValue != null) {
        println("Maximum value: $maxValue")
    } else {
        println("Map is empty, no maximum value.")
    }
}
