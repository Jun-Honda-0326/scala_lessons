object optionPractice {
  
  def main(args: Array[String]):Unit = {
    val option1: Option[Int] = Some(10)
    val optionNone: Option[Int] = None
    
    println(optionMethod1(option1))
    println(optionMethod1(optionNone))
    println(optionMethod2(option1))
    println(optionMethod2(optionNone))

  }


  def optionMethod1(option: Option[Int]):Int = {
    option.getOrElse(0)
  }

  def optionMethod2(option: Option[Int]):Int = {
    option.map(_ * 1000).getOrElse(-1)
  }
}
