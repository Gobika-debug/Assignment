class Person {}

def p = new Person()

// Add new property dynamically
p.metaClass.age = 25
p.metaClass.name = "Jay"

// Add method dynamically
p.metaClass.sayHello = { -> println "Hello, my name is $p.name and I am $p.age years old." }

p.sayHello()  // Output: Hello, my name is Gobika and I am 25 years old.
