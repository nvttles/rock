object SimpleCalculator {
  def main(args: Array[String]): Unit = {
    println("Enter first number:")
    val num1 = scala.io.StdIn.readDouble()

    println("Enter an operator (+, -, *, /):")
    val operator = scala.io.StdIn.readLine()

    println("Enter second number:")
    val num2 = scala.io.StdIn.readDouble()

    val result = operator match {
      case "+" => num1 + num2
      case "-" => num1 - num2
      case "*" => num1 * num2
      case "/" =>
        if (num2 != 0) num1 / num2
        else {
          println("Error: Division by zero!")
          return
        }
      case _ =>
        println("Invalid operator!")
        return
    }

    println(s"Result: $num1 $operator $num2 = $result")
  }
}
