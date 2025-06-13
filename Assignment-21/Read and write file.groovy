def file = new File("name.txt")

// Write to file
file.text = "Comics"

// Read from file
def content = file.text
println "Read from file: $content"
