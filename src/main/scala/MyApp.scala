 object MyApp {

   def msg(from: String, to: String, text: String) = s"($from -> $to): $text"

  def main(args: Array[String]): Unit = {
    val msgToFkoji = msg(_: String, "fkoji", _: String )

    println(msgToFkoji("taguchi", "OK"))

    
  }
}

