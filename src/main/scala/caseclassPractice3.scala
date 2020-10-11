object BinaryTree {
  sealed abstract class Tree
  case class Branch(value: Int, left: Tree, right: Tree) extends Tree
  case object Empty extends Tree


  def max(tree: Tree): Int = tree match {
    case Branch(a, Empty, Empty) => a
    case Branch(a, b, Empty) =>
      val x = max(b)
        if(x < a) a else x
    case Branch(a, Empty, c) =>
      val x = max(c)
        if(x > a) x else a
    case Branch(a, b, c) =>
      val x = max(b)
      val y = max(c)
        if(a > x) {
          if(a > y) a else y
          } else {
            if(x > y) x else y
            }
    case Empty => throw new RuntimeException

  }

  def toList(tree: Tree): List[Int] = tree match {
    case Empty => Nil
    case Branch(a, b, c ) => toList(b) ++ List(a) ++ toList(c)
  }



  def depth(tree: Tree): Int = tree match {
    case Empty => 0
    case Branch(_, l, r) =>
      val ldepth = depth(l)
      val rdepth = depth(r)
      (if( ldepth < rdepth) rdepth else ldepth) + 1
  }



  def main(args:Array[String]): Unit = {
    val tree: Tree = Branch(1, Branch(2, Empty, Empty), Branch(5, Empty, Empty))
    val tree2: Tree = Branch(10, Branch(5, Empty, Empty),
                      Branch(30, Branch(20, Branch(50, Branch(34, Empty, Empty)
                      ,Empty), Empty), Empty))

    println(max(tree))
    println(depth(tree2))
    println(depth(tree))


  }

}
