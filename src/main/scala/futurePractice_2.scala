package futures

import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util._

object MultiFutures extends App {

  val startTime = currentTime //今の時間
  // getStockPriceの結果を代入
  val aaplFuture = getStockPrice("AAPL")
  val amznFuture = getStockPrice("AMZN")
  val googFuture = getStockPrice("GOOG")

  val result: Future[(Double, Double, Double)] = for  {  //Futureで3つのfor処理を同時並行で行う
    aapl <- aaplFuture
    amzn <- amznFuture
    goog <- googFuture
  } yield (aapl, amzn, goog)

  result.onComplete {  //Futureが完了したあとの処理 Success型で返ってくる
    case Success(x) => {
      val totalTime = dataTime(startTime) //currentTime（定義した時） - currenTime(FutureがSuccessしたタイミング)
      println(s"In Success case, time data: ${totalTime}")
      println(s"The stock prices are $x") // 各randomPriceを表記
    }
    case Failure(e) => e.printStackTrace //Futureが失敗した時の対応
  }

  def sleep(time: Long): Unit = Thread.sleep(time)

  def getStockPrice(stockSymbol: String):Future[Double] = Future {
    val r = scala.util.Random //乱数の定義
    val randomSleepTime = r.nextInt(3000) //3000を上限としたランダムな数字の作成（Int型）
    println(s"For $stockSymbol, sleep time is $randomSleepTime") //各randomSleepTimeを表記
    val randomPrice = r.nextDouble * 1000 //ランダムな数列の作成(Double型)

    sleep(randomSleepTime) //sleepメソッドのrandomSleepTimeを引数とした値を返す
    randomPrice //randomPriceを返す
  }

  def currentTime = System.currentTimeMillis() //currentTimeの定義
  def dataTime(t0: Long) = currentTime - t0 //datatimeの定義



}
