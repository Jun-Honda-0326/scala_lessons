 abstract class User {
    def sayHello()
 }

 class Japanese extends User {
   def sayHello() = println("こんにちは")
 }

 class Americann extends User {
    def sayHello() = println("Hello")
 }

object MyApp {

  def main(args: Array[String]): Unit = {
    val aki = new Japanese
    val tom = new Americann
    aki.sayHello()
    tom.sayHello()
  }
}