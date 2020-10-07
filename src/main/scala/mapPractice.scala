import scala.collection.immutable.TreeMap

object mapPractice {

    def main(args: Array[String]):Unit = {
      val map1: TreeMap[Int, String] = TreeMap(3 -> "鈴木", 2 -> "佐藤", 1 -> "田中")
      val map2: TreeMap[Int, String] = TreeMap(6 -> "山本", 5 -> "中山", 4 -> "原")
    
      println(mapPractice1(map1,map2))
      println(mapPractice2(map1))

    }

    


    def mapPractice1(map1: TreeMap[Int, String], map2: TreeMap[Int, String]):TreeMap[Int, String] = {
      (map1 ++ map2)
    }

    def mapPractice2(map1: TreeMap[Int, String]):String = {
      map1.map(i => i._1 + "位は" + i._2 + "さんです").head
    }
    

}
