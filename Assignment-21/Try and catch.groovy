try {
    def a = 10
    def b = 0
    println "Result: ${a / b}"
} catch (ArithmeticException e) {
    println "Error: Cannot divide by zero"
} finally {
    println "Division block finished"
}

try {
    def nonExistentFile = new File("missing.txt")
    println nonExistentFile.text
} catch (FileNotFoundException e) {
    println "Error: File not found"
} finally {
    println "File block finished"
}
