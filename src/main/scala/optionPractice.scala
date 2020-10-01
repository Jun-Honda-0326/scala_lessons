object optionPractice {
  
  def main(args: Array[String]):Unit = {
    val option1: Option[Int] = Some(10)
    val optionNone: Option[Int] = None
    val optionStr: Option[String] = Some("GoodMorning")
    
    println(optionMethod1(option1))
    println(optionMethod1(optionNone))
    println(optionMethod2(option1))
    println(optionMethod2(optionNone))
    println(optionMethod3(option1))
    println(optionMethod3(optionNone))
    println(optionMethod4(optionStr))

  }


  def optionMethod1(option: Option[Int]):Int = {
    option.getOrElse(0)
  }

  def optionMethod2(option: Option[Int]):Int = {
    option.map(_ * 1000).getOrElse(-1)
  }

  def optionMethod3(option: Option[Int]):Int = {
    option match{
      case Some(option) => 100
      case None => -1
    }
  }

  def optionMethod4(option: Option[String]):Int = {
      option.get.size
    }
  
}
