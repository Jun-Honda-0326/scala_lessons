
class MyDate[T] {
  def getThree(i: T ): Unit = println (s"$i, $i, $i") 
}




object MyApp {

  def main(args: Array[String]): Unit = {
    val  i = new MyDate[Int]
    i.getThree(3)
    val s = new MyDate[String]
    s.getThree("hello")
  }
}