import scala.util.{Try, Success, Failure}

object eitherPractice {

  def main(args:Array[String]):Unit = {

    val either1: Either[String,Int] = Right(100)
    val either2: Either[String, Int] = Left("Error")
    val success: Try[Int] = Success(100)
    val failure: Try[Nothing] = Failure(new Exception ("エラー処理です"))

    println(eitherMethod1(either1))
    println(tryMethod1(10,2))
    println(tryMethod1(0,0))
    println(tryMethod2(success))
    println(tryMethod2(failure))
  }

 def eitherMethod1(either: Either[String, Int]):Either[String, Int] = {
    either.flatMap(_  =>  Left("Error"))
  }


 def tryMethod1(x:Int, y:Int): String  = {
    val try1:Try[Int] = Try(x / y)
    try1 match {
       case Success(s) => (s).toString
       case Failure(f) => f.getMessage
    }
  }


  def tryMethod2(try1:Try[Int]):Either[String,Int] = {
      try1.toEither.left.map(_.getMessage)
    }

}
