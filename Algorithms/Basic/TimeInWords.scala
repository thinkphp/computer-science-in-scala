import java.io._
import java.math._
import java.security._
import java.text._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

def timeInWords(h: Int, m: Int): String = {
  val dStr = Map(
    1 -> "one",
    2 -> "two",
    3 -> "three",
    4 -> "four",
    5 -> "five",
    6 -> "six",
    7 -> "seven",
    8 -> "eight",
    9 -> "nine",
    10 -> "ten",
    11 -> "eleven",
    12 -> "twelve",
    13 -> "thirteen",
    14 -> "fourteen",
    15 -> "fifteen",
    16 -> "sixteen",
    17 -> "seventeen",
    18 -> "eighteen",
    19 -> "nineteen",
    20 -> "twenty",
    21 -> "twenty one",
    22 -> "twenty two",
    23 -> "twenty three",
    24 -> "twenty four",
    25 -> "twenty five",
    26 -> "twenty six",
    27 -> "twenty seven",
    28 -> "twenty eight",
    29 -> "twenty nine",
    30 -> "thirty",
  )
  m match {
    case 0 => s"${dStr(h)} o' clock"
    case 15 => s"quarter past ${dStr(h)}"
    case 30 => s"half past ${dStr(h)}"
    case 45 => s"quarter to ${dStr(if (h == 12) 1 else h + 1)}"
    case past if past <= 30 =>
      s"${dStr(past)} minute${if (past > 1) "s" else ""} past ${dStr(h)}"
    case to =>
      val ah = if (h == 12) 1 else h + 1
      s"${dStr(60 - to)} minute${if (to >= 1) "s"} to ${dStr(ah)}"
  }
}

}

object Solution {
    def main(args: Array[String]) {
        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val h = StdIn.readLine.trim.toInt

        val m = StdIn.readLine.trim.toInt

        val result = Result.timeInWords(h, m)

        printWriter.println(result)

        printWriter.close()
    }
}
