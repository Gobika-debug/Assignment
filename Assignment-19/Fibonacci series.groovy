// Function to generate Fibonacci series
def fibonacci(int n) {
    def series = []
    for (int i = 0; i < n; i++) {
        if (i == 0) {
            series << 0
        } else if (i == 1) {
            series << 1
        } else {
            series << (series[i - 1] + series[i - 2])
        }
    }
    return series
}

// Get user input
print "Enter number of terms: "
def n = (System.console()?.readLine() ?: new Scanner(System.in).nextLine()) as Integer

// Print the Fibonacci series
def result = fibonacci(n)
println "Fibonacci Series: ${result.join(' ')}"
