 object MyApp {

  def main(args: Array[String]): Unit = {

    val multiFunc = (a: Int, b: Int) => a * b
    val multiFuncCurried = (a: Int)  => ((b: Int) => a * b)

    // println(multiFunc(3,5))
    // println(multiFuncCurried(3)(5))

    val double = multiFuncCurried(2)
    val triple = multiFuncCurried(3)

    println(double(5))
    println(triple(5))
  }
}