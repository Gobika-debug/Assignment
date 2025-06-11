// Function to remove duplicates using 'unique()'
def removeDuplicates(List inputList) {
    return inputList.unique()
}

// Get user input
print "Enter numbers separated by spaces: "
def inputLine = System.console()?.readLine() ?: new Scanner(System.in).nextLine()
def inputList = inputLine.split("\\s+").collect { it as Integer }

// Remove duplicates and print result
def result = removeDuplicates(inputList)
println "List without duplicates: ${result}"
