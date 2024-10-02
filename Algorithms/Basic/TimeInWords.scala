import scala.io._

object Result{

  def timeInWords(h: Int, m: Int): String = {
  
    val dStr = Map(
      1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five", 6 -> "six",
      7 -> "seven", 8 -> "eight", 9 -> "nine", 10 -> "ten", 11 -> "eleven", 12 -> "twelve",
      13 -> "thirteen", 14 -> "fourteen", 15 -> "fifteen", 16 -> "sixteen",
      17 -> "seventeen", 18 -> "eighteen", 19 -> "nineteen", 20 -> "twenty",
      21 -> "twenty one", 22 -> "twenty two", 23 -> "twenty three", 24 -> "twenty four",
      25 -> "twenty five", 26 -> "twenty six", 27 -> "twenty seven", 28 -> "twenty eight",
      29 -> "twenty nine", 30 -> "thirty"
    )

    m match {
      case 0 => s"${dStr(h)} o' clock"
      case 15 => s"quarter past ${dStr(h)}"
      case 30 => s"half past ${dStr(h)}"
      case 45 => s"quarter to ${dStr(if (h == 12) 1 else h + 1)}"
      case past if past <= 30 =>
        s"${dStr(past)} minute${if (past > 1) "s" else ""} past ${dStr(h)}"
      case to =>
        val nextHour = if (h == 12) 1 else h + 1
        s"${dStr(60 - to)} minute${if (60 - to > 1) "s" else ""} to ${dStr(nextHour)}"
    }
  }
}

object Solution {

  def main(args: Array[String]): Unit = {
    val h = StdIn.readLine.trim.toInt
    val m = StdIn.readLine.trim.toInt

    val result = Result.timeInWords(h, m)

    // Print result to the console instead of writing to file
    println(result)
  }
  
}
