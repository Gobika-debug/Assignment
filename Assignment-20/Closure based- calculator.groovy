def calculate(a, b, operation) {
    operation(a, b)
}

// Define operations using closures
def add = { x, y -> x + y }
def subtract = { x, y -> x - y }
def multiply = { x, y -> x * y }

// Examples
println "Addition: ${calculate(10, 5, add)}"        // Output: 15
println "Subtraction: ${calculate(10, 5, subtract)}" // Output: 5
println "Multiplication: ${calculate(10, 5, multiply)}" // Output: 50
