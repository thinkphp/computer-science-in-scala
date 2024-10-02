class Fibonacci {
  // Method to compute the nth Fibonacci number
  def fib(n: Int): Int = {
    if (n <= 1) n else fib(n - 1) + fib(n - 2)
  }

  // Method to compute the Fibonacci sequence up to n
  def sequence(n: Int): List[Int] = {
    (0 to n).toList.map(fib)
  }
}
