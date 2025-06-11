// Function to manually reverse a string
def reverseString(String input) {
    def reversed = ''
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed += input[i]
    }
    return reversed
}

// Read user input
print "Enter a string to reverse: "
def input = System.console()?.readLine() ?: new Scanner(System.in).nextLine()

// Print reversed string
println "Reversed String: ${reverseString(input)}"
