# Problem Statement-1
<b>Using inheritance, one class can acquire the properties of others. Consider the following Animal class:</b>
```java
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
```
<b>
This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
</b>

```java
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}
```

<b>
Finally, we can create a Bird object that can both fly and walk.
</b>

```java
public class Solution{
   public static void main(String[] args){

      Bird bird = new Bird();
      bird.walk();
      bird.fly();
   }
}
```
<b>
The above code will print:
</b>

```
I am walking
I am flying
```

<b>
This means that a Bird object has all the properties that an Animal object has, as well as some additional unique properties.

The code above is provided for you in your editor. You must add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
</b>

```
I am walking
I am flying
I am singing
```