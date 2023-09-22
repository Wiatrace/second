fun main() {
    println("Количество различных символов во введенной строке в алфавитном порядке: " + second(readln()))
}
fun second(string: String): String {
    var result = ""
    val charCount = mutableMapOf<Char, Int>()
    string.forEach { char ->
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    charCount.toSortedMap().forEach { (char, count) ->
        result += "$char - $count\n"
    }
    return result
}