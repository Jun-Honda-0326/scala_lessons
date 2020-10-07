object seqPractice {

  def main(args: Array[String]): Unit = {

    val Seq1: Seq[Int] = Seq(1,3,4,5,6,9,12,22)
    val SeqSeq: Seq[Seq[Int]] = Seq(Seq(1,3,5), Seq(2,4,6))
    val SeqSeq2: Seq[Seq[Int]] = Seq(Seq(2,4,6), Seq(3,1))

    println(seqMethod1(Seq1))
    println(seqMethod2(SeqSeq))
    println(seqMethod3(Seq1))
    println(seqMethod4(Seq1))
    println(seqMethod5(SeqSeq))
    println(seqMethod6(SeqSeq2))
    //println(seqMethod6(SeqSeq))
    println(seqMethod7(SeqSeq))
    println(seqMethod7(SeqSeq2))
  }


  def  seqMethod1(seq: Seq[Int]): Int = {
    seq.foldLeft(-13)(_ - _)
    // (-13)-1)-3)-4)-5)-6)-9)-12)-22
  }

  def seqMethod2(seqSeq: Seq[Seq[Int]]): Option[Int] = {
    seqSeq.flatMap{n => n.map(_ * 3)}.filter(_ %2 == 0).find(_ > 10)
  }
  
  def seqMethod3(seq: Seq[Int]): Int = {
    seq.find(_ % 11 == 0).getOrElse(0)
  }

  def seqMethod4(seq: Seq[Int]):Seq[Int] = {
    seq.takeWhile(_ < 10)
  }

  def seqMethod5(seqSeq: Seq[Seq[Int]]):Seq[Int] = {
    val seq:Seq[Int] = seqSeq.flatMap{n => n.map(_ * 5)}
    val rev: Seq[Int] = Nil
    seq.foldLeft(rev)((a, x) => x +: a)
  } 

  def seqMethod6(seqSeq: Seq[Seq[Int]]):Int = {
    val seq: Seq[Int] = seqSeq(0) ++ seqSeq(1)
      seq match {
        case List(a,b,c,d,e) => 99
        
      }
  }

  def seqMethod7(seqSeq: Seq[Seq[Int]]):String = {
    val  seq: Seq[Int] = seqSeq(0) ++ seqSeq(1)
     print(seq)
      seq match {
        case List(a,b,c,d,e,f) if c == 5  => "3つ目の要素は5です"
        case List(a,b,c,d,e) => "5つです"
        case List(a,b,c,d) => "4つです"
        case List(a,b,c) => "3つです"
        case _ => "それ以外です"
      }

  }  

  
}
