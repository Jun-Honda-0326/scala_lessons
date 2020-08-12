class User {
  val name = "Jun"
  def sayHi() = println("Hi")
}


object MyApp {

  def main(args: Array[String]): Unit = {
    val user = new User
    println(user.name)
    user.sayHi()
  }
}