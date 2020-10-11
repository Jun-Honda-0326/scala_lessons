case class Point(x:Int,y:Int)

object MainCaseClassPractice {


  def main(args: Array[String]):Unit = {

    val person = Person.aboutPerson("hoge", 30)
    println(person)


   val p = Point(40,40)
     p match {
     case Point(x,y) =>
       println(x)
       println(y)
     }

  }
}

object  Person{

  def aboutPerson(name: String, age: Int): String = {
    s"名前は${name}さんです。年齢は${age}です"
  }

}
