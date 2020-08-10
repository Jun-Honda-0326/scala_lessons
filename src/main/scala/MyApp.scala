object MyApp {

  def main(args: Array[String]): Unit = {

    // val 再代入できない
    // var 再代入できる

    var msg = "Hello World" //型推論
    println(msg)
     msg = "Hello World Again"
    println(msg)
  }

}