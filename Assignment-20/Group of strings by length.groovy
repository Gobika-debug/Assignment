print "Enter a sentence: "
def input = System.console()?.readLine() ?: "hello world hello"

def words = input.toLowerCase().split("\\s+")
def freqMap = [:]

words.each { word ->
    freqMap[word] = freqMap.get(word, 0) + 1
}

freqMap.each { word, count ->
    println "${word} → ${count}"
}
