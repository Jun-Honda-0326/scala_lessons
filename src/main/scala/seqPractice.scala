object seqPractice {

  def main(args: Array[String]): Unit = {

    val Seq1: Seq[Int] = Seq(1,3,4,5,6,9,12,22)
    val SeqSeq: Seq[Seq[Int]] = Seq(Seq(1,3,5), Seq(2,4,6))
    println(seqMethod1(Seq1))
    println(seqMethod2(SeqSeq))
    println(seqMethod3(Seq1))
    println(seqMethod4(Seq1))
    println(seqMethod5(SeqSeq))
  }


  def  seqMethod1(seq: Seq[Int]): Int = {
    seq.fold(-13)(_ - _)
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


}
