// Function to check if a number is prime
def isPrime(int num) {
    if (num <= 1) return false
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) return false
    }
    return true
}

// Get user input
print "Enter a number: "
def input = (System.console()?.readLine() ?: new Scanner(System.in).nextLine()) as Integer

// Check and print result
println "Is Prime: ${isPrime(input)}"
