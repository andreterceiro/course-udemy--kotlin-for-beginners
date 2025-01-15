fun main() {
    val sentence = "Welcome to Kotlin!"
    val words = sentence.split(' ');
    println(words.joinToString(separator = "_"))
    println(words.joinToString(separator = "_") { word -> word })
    println(words.joinToString(separator = "_") { word -> word.replaceFirstChar { "Banana" } })
    println(words.joinToString(separator = "_") { word -> word.replaceFirstChar { it.lowercase() } }) // welcome_to_kotlin! 
}