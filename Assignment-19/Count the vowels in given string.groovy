// Function to count vowels
def countVowels(String input) {
    def vowels = ['a', 'e', 'i', 'o', 'u']
    def count = 0
    input.toLowerCase().each { ch ->
        if (ch in vowels) {
            count++
        }
    }
    return count
}

// Read user input
print "Enter a string: "
def input = System.console()?.readLine() ?: new Scanner(System.in).nextLine()

// Count and print vowels
println "Vowel Count: ${countVowels(input)}"
