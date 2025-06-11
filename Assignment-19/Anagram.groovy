// Function to check if two strings are anagrams
def areAnagrams(String str1, String str2) {
    def s1 = str1.toLowerCase().toList().sort()
    def s2 = str2.toLowerCase().toList().sort()
    return s1 == s2
}

// Get user input
print "Enter first string: "
def str1 = System.console()?.readLine() ?: new Scanner(System.in).nextLine()

print "Enter second string: "
def str2 = System.console()?.readLine() ?: new Scanner(System.in).nextLine()

// Check and display result
println "Are Anagrams: ${areAnagrams(str1, str2)}"
