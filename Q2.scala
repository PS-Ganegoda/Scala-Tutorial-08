object Question2 {
  def getInput(): Int = {
    println("Enter the integer:")
    val input = scala.io.StdIn.readInt()
    input
  }

  def main(args: Array[String]): Unit = {
    val input = getInput()

    val patternMatching: Int => String = {
      case 0 => "Zero"
      case n if n < 0 => "Negative value"
      case n if n % 2 == 0 => "Even"
      case n if n % 2 != 0 => "Odd"
    }

    val result = patternMatching(input)
    println(result)
  }
}
