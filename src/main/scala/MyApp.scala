<<<<<<< HEAD
 object MyApp {

   def msg(from: String, to: String, text: String) = s"($from -> $to): $text"

  def main(args: Array[String]): Unit = {
    val msgToFkoji = msg(_: String, "fkoji", _: String )
=======

class MyDate[T] {
  def getThree(i: T ): Unit = println (s"$i, $i, $i") 
}



>>>>>>> c0a08015175a0b0505a61b07c9108c38046121ec

    println(msgToFkoji("taguchi", "OK"))

<<<<<<< HEAD
    
=======
  def main(args: Array[String]): Unit = {
    val  i = new MyDate[Int]
    i.getThree(3)
    val s = new MyDate[String]
    s.getThree("hello")
>>>>>>> c0a08015175a0b0505a61b07c9108c38046121ec
  }
}

