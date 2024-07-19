package KotlinQuestions

fun main() {
    var hashMap = hashMapOf<Char,Char>(
        'A' to '1',
        'C' to '2',
        'D' to '3',
        'V' to '4')

    var entries =    hashMap.entries.iterator()
    while(entries.hasNext()){
        var entry = entries.next()
        println(entry.key)
        println(entry.value)
    }
}