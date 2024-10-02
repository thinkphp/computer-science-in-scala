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
