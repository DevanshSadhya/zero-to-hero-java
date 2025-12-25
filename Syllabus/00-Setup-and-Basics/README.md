
# #00-Setup-and-Basics
## IDE SETUP:-

✅ Step 1: Install JDK (Most Important)
<BR>🔹 Download JDK

1. Go to 👉 https://www.oracle.com/java/technologies/downloads/

2. Download JDK (LTS version – Java 17 or 21)

3. Install using default settings

🔹 Verify Installation

Open <b>Command Prompt / Terminal</b> and run:
```
java -version
javac -version
```
✔ If version shows → Java installed correctly
❌ If not → JDK not set properly
<br>
# 🖥️ Step 2: Set Environment Variable (Windows)
1. Search Environment Variables
2. Click <b>Edit the system environment variables</b>
3. Click Environment Variables
4. Under <b>System Variables</b> → New
```
Variable name: JAVA_HOME
Variable value: C:\Program Files\Java\jdk-17
```
5. Select Path → Edit → New → add:
```
%JAVA_HOME%\bin
```
PS:- I AM CHOOSING INTELIJ IDLE FOR JAVA
<br>
# 🧠 Step 3: Choose Your Java IDE
🔹 Install

   *  Download: https://www.jetbrains.com/idea/

   * Choose Community Edition (Free)

🔹 Create Java Project

   1. Open IntelliJ

  2. Click New Project

   3. Select Java

  4. Choose installed JDK

   5. Click Create
      
🔹 Run First Program
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```
