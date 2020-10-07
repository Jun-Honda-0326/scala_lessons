trait Name{
  val name: String
  def display():Unit = println(name)
}

class Employee(val name:String) extends AnyRef with Name{ 
  
  override def display(): Unit = println(s"${name}さん")
  
}

object  traitPractice{

  def main(args:Array[String]):Unit = {
   val hello = new Employee("jun")
    hello.display()
  }
  

}

