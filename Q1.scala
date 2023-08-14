object InterestCalculator {
  def main(args: Array[String]): Unit = {
    val calculateInterest = (deposit: Double) => {
      val interest = if (deposit <= 20000) {
        deposit * 0.02
      } else if (deposit <= 200000) {
        deposit * 0.04
      } else if (deposit <= 2000000) {
        deposit * 0.035
      } else {
        deposit * 0.065
      }
      interest
    }
    println("Enter amount :")
    val depositAmount = scala.io.StdIn.readDouble()
    val interestAmount = calculateInterest(depositAmount)
    
    println(s"Deposit Amount: $depositAmount")
    println(s"Interest Amount: $interestAmount")
  }
}
