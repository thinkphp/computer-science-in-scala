class Factorial {
  // Method to compute the factorial of a number
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }
}
