object MyApp {

  def main(args: Array[String]): Unit = {

    // val x = 10
    // println(x / 3.0)

    // println(x % 3)

    // var y = 5
    // y -= 2
    // println(y)

    // val flag = true
    // println(!flag)

    // val name = "taguchi"
    // val score = 80
    // val height = 158.3

    // println(s"name:$name , score:$score , height:$height") //変数を埋め込みたい時は前にsを付与する
    // println(s"name:$name , score:${score + 10 } , height:$height")
    // println(f"name:$name%s , score:$score%-10d , height:$height%-1.2f") //10は最小表示桁数

    val score = 70

    val  result =  
      if (score > 80) "great"
      else if (score > 60) "good"
      else "so so..."
    println(result)
  }
}