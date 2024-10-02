import java.util.ArrayList

object MainApp {

  def main(args: Array[String]): Unit = {
  
    // Create a Java ArrayList
    val javaList = new ArrayList[String]()

    // Add elements to the ArrayList
    javaList.add("Hello")
    javaList.add("from")
    javaList.add("Scala!")

    // Print the ArrayList using Scala's println
    println(javaList) 

    // Iterate through the ArrayList using Java's Iterator
    val iterator = javaList.iterator()
    while (iterator.hasNext()) {
      val element = iterator.next()
      println(element)
    }
  }
}
