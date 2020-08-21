 object MyApp {

  def main(args: Array[String]): Unit = {

    val prices = List(53.2, 48.2, 32.8)

    prices.map(_ * 1.08 ).filter(_ > 50).foreach(println)

    
        
  }
}

