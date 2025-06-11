// Function to check for palindrome
def isPalindrome(String input) {
    def cleaned = input.toLowerCase()
    for (int i = 0; i < cleaned.length() / 2; i++) {
        if (cleaned[i] != cleaned[cleaned.length() - 1 - i]) {
            return false
        }
    }
    return true
}

// Get user input
print "Enter a string: "
def input = System.console()?.readLine() ?: new Scanner(System.in).nextLine()

// Check and print result
println "Is Palindrome: ${isPalindrome(input)}"
