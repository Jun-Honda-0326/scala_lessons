 object MyApp {

   def swap(a: Int, b: Int) = (b,a)

   
   
  def main(args: Array[String]): Unit = {

    val set_1 = Set(5,3,8)
    val set_2 = Set(5,1,2,8,10)

    println(set_1 | set_2)
    println(set_1 & set_2)
    println(set_1 intersect set_2)
    println(set_1 diff set_2)
 
    
        
  }
}

