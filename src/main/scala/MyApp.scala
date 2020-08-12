class User(_name: String) {
  val name = _name
  def sayHi() = println("Hi " + this.name )
}

class AdminUser(name: String, val age: Int) extends User(name) {
  def sayHello() = println("Hello " + name + "("+ age +")")
  override def sayHi() = println("[admin] こんにちは " +  name)
}

object MyApp {
  def main(args: Array[String]): Unit = {
  val bob = new AdminUser("bob", 23)
  println(bob.name)
  println(bob.age)
  bob.sayHi()
  bob.sayHello()
  }
}