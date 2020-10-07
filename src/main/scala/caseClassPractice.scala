case class Point(x:Int,y:Int)

object caseClassPractice {
  
   
  def main(args: Array[String]):Unit = {
     
   val p = Point(40,40)
     p match {
     case Point(x,y) => 
       println(x)
       println(y)
     }
   
  }
}  
