# Lox Interpreter🚀 

A simple implementation of a Lox interpreter, inspired by the [*Crafting Interpreters*](https://craftinginterpreters.com/) book by Robert Nystrom.  

This project walks through the various stages of building an interpreter for the Lox programming language, a dynamically-typed, object-oriented language designed for educational purposes.  

---

## Table of Contents  
- [What is Lox?](#what-is-lox)  
- [Project Overview](#project-overview)  
- [Features](#features)  
- [Build Process](#build-process)  
- [Requirements](#requirements)  
- [Usage](#usage)  

---

## What is Lox?  
Lox is a lightweight programming language with a C-like syntax. It supports:  
- Variables and scopes  
- Control flow (`if`, `while`, `for`)  
- Functions and closures  
- Classes and inheritance  

This project focuses on creating an interpreter for Lox, covering the entire pipeline from code input to execution.  

---

## Project Overview  

The interpreter is built in the following stages:  

1. **Scanner (Lexical Analysis)**:  
   - Breaks the input source code into a sequence of tokens (e.g., keywords, operators, literals).  

2. **Parser (Syntax Analysis)**:  
   - Converts tokens into an Abstract Syntax Tree (AST), representing the structure of the code.  

3. **Resolver (Static Analysis)**:  
   - Analyzes variable usage and scope resolution to ensure correctness before runtime.  

4. **Interpreter (Execution)**:  
   - Executes the AST directly by evaluating expressions and executing statements.  

Each stage is modular, making it easier to understand and extend.  

---

## Features  

- **Full Lox Syntax Support**: Implements variables, functions, classes, and control structures.  
- **Dynamic Typing**: Supports numbers, strings, booleans, and `nil` values.  
- **Error Handling**: Graceful error messages for both syntax and runtime issues.  
- **Extendable Design**: The modular architecture allows for easy addition of new features.  

---

## Build Process  

Follow these steps to build and run the Lox interpreter:  

1. **Clone the Repository**:  
   ```bash  
   git clone https://github.com/yourusername/lox-interpreter.git  
   cd lox-interpreter  
   ```  

2. **Install Dependencies**:  
   Ensure you have Java installed. The interpreter is written in Java and uses no external libraries.  

3. **Compile the Code**:  
   ```bash  
   javac -d out src/**/*.java  
   ```  

4. **Run the Interpreter**:  
   ```bash  
   java -cp out com.example.lox.Lox  
   ```  

---

## Requirements  

- **Java Development Kit (JDK)**: Version 11 or higher.  
- **Text Editor or IDE**: For writing and modifying Lox scripts.  

---

## Usage  

You can run the interpreter in two modes:  

1. **Interactive Mode**:  
   Start the interpreter with no arguments to enter the REPL (Read-Eval-Print Loop):  
   ```bash  
   java -cp out com.example.lox.Lox  
   ```  
   Example:  
   ```lox  
   > print "Hello, Lox!";  
   Hello, Lox!  
   ```  

2. **Script Mode**:  
   Provide a Lox file as an argument:  
   ```bash  
   java -cp out com.example.lox.Lox path/to/script.lox  
   ```  

---

## Example  

Lox Script:  
```lox  
fun greet(name) {  
  print "Hello, " + name + "!";  
}  

greet("World");  
```  
Output:  
```  
Hello, World!  
```  

---

## Contributing  

Contributions are welcome! Feel free to fork this repository and submit pull requests.  

---

## License  

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.  

---  
 
