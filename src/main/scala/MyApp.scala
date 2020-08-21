 object MyApp {

   case class Point(x: Int, y:Int) 

  def main(args: Array[String]): Unit = {
    val points = List(
      Point(5,3),
      Point(0,0),
      Point (1,2)
    )

    points.foreach(_ match {
      case Point(0,0) => println("origin")
      case Point(5, _) => println("right")
      case Point(x, y) => println(s"$x: $y")
    })

    
    
        
  }
}

