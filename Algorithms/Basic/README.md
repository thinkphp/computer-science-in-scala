# Basic Algorithms


### Hackerank

1. The Time in Words https://www.hackerrank.com/challenges/the-time-in-words/problem

2. 
In Scala, you can define as many **objects** as you like, but only **one** object should contain the `main` method if it's meant to be the entry point of the program.

### Key Points:

- **Multiple Objects**: You can have multiple objects in your Scala code. Each object can have its own methods, fields, and logic, but they won’t be executed unless explicitly called.
  
- **Single Entry Point**: To run a Scala application, the Scala runtime looks for an object that contains a **`main`** method with the following signature:
  
  ```scala
  def main(args: Array[String]): Unit
  ```

  This `main` method acts as the entry point where the program starts execution.

- **Why Only One Main Method**: When you run the application, Scala needs to know where to start executing the program. The `main` method serves this purpose, and typically, only **one object** should have this method, as it tells the runtime where to begin.

### Example of Multiple Objects with One Entry Point

```scala
// Object with utility functions
object Utils {
  def greet(name: String): String = {
    s"Hello, $name!"
  }
}

// Object with Euclidean algorithm
object Euclid {
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

// Main object where execution starts
object MainApp {
  def main(args: Array[String]): Unit = {
    // Using the Utils object
    println(Utils.greet("Scala Developer"))

    // Using the Euclid object
    val gcdResult = Euclid.gcd(54, 24)
    println(s"The GCD of 54 and 24 is $gcdResult")
  }
}
```

- **`Utils`** and **`Euclid`** are utility objects that define some logic.
- **`MainApp`** contains the `main` method, which is the entry point of the program.

When you run this program (e.g., `scala MainApp.scala`), the **`MainApp`** object’s `main` method is executed. Inside that method, it calls methods from the other objects (`Utils` and `Euclid`).

### Summary:

- You can define **many objects** in a Scala program.
- **Only one object** should contain the **`main`** method, which is the program's entry point.
- The `main` method directs the flow of the program, and it can make use of other objects and methods within the program.


