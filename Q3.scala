object Question3 {
  def convertToUppercase(input: String): String = {
    val upper = input.toUpperCase()
    upper
  }

  def convertToLowercase(input: String): String = {
    val lower = input.toLowerCase()
    lower
  }

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  val formatName: String => String = name => {
    val formatted = name.take(1).toUpperCase + name.slice(1, 5).toLowerCase + name.drop(5).toUpperCase
    formatted
  }

  def main(args: Array[String]): Unit = {
    val upper = convertToUppercase("benny")
    println("Convert to uppercase: " + upper)

    val input = "Niroshan"
    val formattedName = input.take(2).toUpperCase + input.drop(2).toLowerCase
    println(formattedName) // Output: "NIroshan"

    val lower = convertToLowercase("SAMAN")
    println(lower)

    val formattedName2 = formatNames("Kumara")(formatName)
    println(formattedName2) // Output: "KumarA"
  }
}

