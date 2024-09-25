# Java Class Implementations

This repository contains various Java class implementations that demonstrate key object-oriented programming concepts such as constructors, inheritance, method overriding, and polymorphism. Below are the details of each class and their functionalities.

## 1. Box Class

**Question:** Create a class `Box` that uses a parameterized constructor to initialize the dimensions of a box. The dimensions of the Box are width, height, and depth. The class should have a method that can return the volume of the box. Test the functionality by creating an object of the Box class.

### Example
- Input: Width = 3.0, Height = 4.0, Depth = 5.0
- Output: Volume of the box = 60.0

---

## 2. Calculator Class

**Question:** Create a new class called `Calculator` with the following methods:
1. A static method called `powerInt(int num1, int num2)` that returns `num1` raised to the power of `num2`.
2. A static method called `powerDouble(double num1, int num2)` that returns `num1` raised to the power of `num2`.

Test the functionalities of both methods.

### Example
- Input: `powerInt(2, 3)`
- Output: 8
- Input: `powerDouble(2.5, 3)`
- Output: 15.625

---

## 3. Author and Book Classes

**Question:** Create a class `Author` with member variables `name` (String), `email` (String), and `gender` (char) and a parameterized constructor to initialize the variables. 

Create another class `Book` with member variables `name` (String), `author` (of class `Author`), `price` (double), and `qtyInStock` (int). Include a parameterized constructor to initialize the variables along with getters and setters.

In the main method, create a `Book` object and print all details of the book, including author details.

### Example
- Input: Author Name = "J.K. Rowling", Book Name = "Harry Potter", Price = 39.99, Quantity in Stock = 100
- Output: 
  - Book Name: Harry Potter
  - Author Name: J.K. Rowling
  - Price: 39.99
  - Quantity in Stock: 100

---

## 4. Animal and Bird Classes

**Question:** Create a class named `Animal` which includes methods like `eat()` and `sleep()`. Create a child class of `Animal` named `Bird` and override the parent class methods. Add a new method named `fly()`.

Create instances of both classes and invoke their respective methods to demonstrate inheritance.

### Example
- For `Animal`: 
  - Output: "Animal is eating" and "Animal is sleeping"
- For `Bird`:
  - Output: "Bird is eating", "Bird is sleeping", and "Bird is flying"

---

## 5. Person and Employee Classes

**Question:** Create a class called `Person` with a member variable `name`. Save it in a file called `Person.java`.

Create a class called `Employee` that inherits from `Person`. It should contain additional member variables: `annualSalary` (double), `yearStarted` (int), and `nationalInsuranceNumber` (String). Ensure the class has the necessary constructors and getter/setter methods.

Write another class called `TestEmployee` with a main method to fully test the `Employee` class.

### Example
- Input: Name = "John Doe", Salary = 50000, Year Started = 2015, National Insurance Number = "AB123456C"
- Output: 
  - Name: John Doe
  - Salary: 50000
  - Year Started: 2015
  - National Insurance Number: AB123456C

---

## 6. Fruit and Shape Classes

**Question:** Create a base class `Fruit` with attributes `name`, `taste`, and `size`. Create a method called `eat()` which describes the name of the fruit and its taste.

Inherit this class in two other classes: `Apple` and `Orange`, overriding the `eat()` method to represent each fruit's taste.

Additionally, create a class named `Shape` that contains methods `draw()` and `erase()`. Create subclasses `Circle`, `Triangle`, and `Square`, each overriding the `draw()` and `erase()` methods.

### Example
- For `Fruit`:
  - Input: Name = "Apple", Taste = "Sweet"
  - Output: "The Apple tastes Sweet"
  
- For `Shape`:
  - Output:
    - "Drawing Circle"
    - "Erasing Circle"
    - "Drawing Triangle"
    - "Erasing Triangle"
    - "Drawing Square"
    - "Erasing Square"

---

## 7. Additional String Manipulation Questions

1. **Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.**  
   - Input: "Wipro", 3  
   - Output: "propropro"

2. **Write a program to check whether a given string is a palindrome or not.**  
   - Input: "madam"  
   - Output: "madam is a palindrome"

3. **Write a Java program that will concatenate 7 strings and return the result in lowercase. If the concatenation creates a double-char, then one of the characters needs to be omitted.**  
   - Input: "Sachin", "Tendulkar"  
   - Output: "sachintendulkar"

4. **Given a string, return a new string made of 'n' copies of the first 2 chars of the original string where 'n' is the length of the string.**  
   - Input: "Wipro"  
   - Output: "wiwiwiwiwi"

5. **Write a Java program that will return the first half of the string if the length of the string is even; otherwise, return null.**  
   - Input: "TomCat"  
   - Output: "Tom"

6. **Write a Java program that accepts a string and returns a new string without the first and last character of the input string.**  
   - Input: "Suman"  
   - Output: "uma"

7. **Given two strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.**  
   - Input: "hi", "hello"  
   - Output: "hihellohi"

8. **Given a string, if the first or last chars are 'x', return the string without those "x" chars; otherwise, return the string unchanged.**  
   - Input: "His"  
   - Output: "His"

9. **Write a program to create a class named `Shape`. It should contain 2 methods, `draw()` and `erase()` that print "Drawing Shape" and "Erasing Shape" respectively.**  
   - For subclasses, the methods should print specific messages. 

---

## Conclusion

This repository serves as a comprehensive collection of Java class implementations showcasing fundamental concepts of object-oriented programming. Each implementation has been tested to ensure functionality and correctness.
