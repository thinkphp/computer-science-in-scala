// Euclid class for computing the GCD
class Euclid {
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

// Fibonacci class for computing Fibonacci sequence
class Fibonacci {
  def fib(n: Int): Int = {
    if (n <= 1) n else fib(n - 1) + fib(n - 2)
  }

  def sequence(n: Int): List[Int] = {
    (0 to n).toList.map(fib)
  }
}

// Factorial class for computing factorial
class Factorial {
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }
}

// MainApp object that handles user interaction
object MainApp {
  def main(args: Array[String]): Unit = {
    val euclid = new Euclid()
    val fibonacci = new Fibonacci()
    val factorial = new Factorial()

    var continue = true

    while (continue) {
      println("\nChoose an action: ")
      println("1. Compute GCD (Euclid's algorithm)")
      println("2. Compute Fibonacci sequence")
      println("3. Compute Factorial")
      println("4. Exit")

      val choice = scala.io.StdIn.readInt()

      choice match {
        case 1 =>
          println("Enter the first number:")
          val a = scala.io.StdIn.readInt()
          println("Enter the second number:")
          val b = scala.io.StdIn.readInt()
          val gcd = euclid.gcd(a, b)
          println(s"The GCD of $a and $b is $gcd")

        case 2 =>
          println("Enter a number to compute Fibonacci sequence up to:")
          val n = scala.io.StdIn.readInt()
          val fibSeq = fibonacci.sequence(n)
          println(s"The Fibonacci sequence up to $n is: ${fibSeq.mkString(", ")}")

        case 3 =>
          println("Enter a number to compute the factorial:")
          val n = scala.io.StdIn.readInt()
          val fact = factorial.factorial(n)
          println(s"The factorial of $n is $fact")

        case 4 =>
          continue = false
          println("Goodbye!")

        case _ =>
          println("Invalid choice. Please choose again.")
      }
    }
  }
}
