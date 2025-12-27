# Module 1: Java Setup & Basic Syntax

## Objective
Set up the Java development environment and understand the basic structure and syntax of a Java program.

---

## 1. Java Installation

### Step 1: Install JDK
- Download JDK (Java 17 or later – LTS recommended)
- Install using default settings

### Step 2: Verify Installation
Open terminal / command prompt and run:
```
java -version
javac -version
```
If the version is displayed, Java is installed correctly.
<BR>
## 2. Environment Variables (Windows)

Set the following variables:

- JAVA_HOME  
  Example:
  ````
  C:\Program Files\Java\jdk-17
  ````
  <br>
  
- Add to PATH:
```
%JAVA_HOME%\bin
```
<br>


Restart the system after setup.

---

## 3. Java IDE Setup

You can use any one of the following:
- IntelliJ IDEA (Recommended)
- Eclipse
- VS Code (with Java Extension Pack)

Create a new Java project after IDE installation.

---

## 4. First Java Program

```java
public class Main {
  public static void main(String[] args) {
      System.out.println("Hello, Java");
  }
}
```
<br>
Explanation:-

* class : Blueprint of the program

* main() : Entry point of execution

* System.out.println() : Prints output to console
<br>

##  5. Basic Java Syntax Rules

* Java is case-sensitive

* Every statement ends with ;

* Code blocks use { }

* File name should match class name

## 6. Java Program Structure
```java
class ClassName {
    public static void main(String[] args) {
        // code
    }
}
```
## 7. Comments in Java
```java
// Single-line comment

/*
 Multi-line
 comment
*/
```
## 8. Keywords & Identifiers
<b>Keywords:-</b>
<i>Reserved words in Java (cannot be used as variable names)</i>
Example:
```c++
class, public, static, void
```
<b>Identifiers:-</b>

<i>Names given to variables, classes, and methods.
Rules:</i>

* Cannot start with a number

* Cannot use keywords

* No spaces allowed

## 9. Common Beginner Errors

* Missing semicolon ( ; )

* Wrong class name

* JDK not configured

* main() method written incorrectly

## 10. Practice Tasks

* Install JDK and verify version

* Write and run the first Java program

* Modify output message

* Add comments to code

## Module Outcome

* After completing this module, you should be able to:

* Install and configure Java

* Set up a Java IDE

* Write and run basic Java programs

* Understand basic Java syntax
