import scala.util._

object MainRefact {

  case class  Address(id: Int, name: String, postCode: Option[String])  //アドレスクラスの定義
  case class  User(id: Int, name: String, addressId: Option[Int]) //Userクラスの定義

  // Userのデータベースを定義
  val userDatabase: Map[Int, User] = Map(
    1 -> User(1, "太朗", Some(1)),
    2 -> User(2, "次郎", Some(2)),
    3 -> User(3, "ダメ太朗", None)
   )

   //アドレスのデータベースを定義
  val addressDatabase: Map[Int, Address] = Map(
    1 -> Address(1, "渋谷", Some("150-0002")),
    2 -> Address(2, "宇宙ステーション", None)
  )


  sealed abstract class PostCodeResult
  case class Success(postCode: String) extends PostCodeResult //Success(postCode)の値を持つクラス
  abstract class Failure extends PostCodeResult
  case object UserNotFound extends Failure
  case object UserNotHasAddress extends Failure
  case object AddressNotFound extends Failure
  case object AddressNotHasPostCode extends Failure

  //UserIdから郵便番号を求めるメソッド
  def getPostCodeResult(userId: Int):PostCodeResult = {

    (for {
      user <- findUser(userId)
      address <- findAddress(user)
      postCode <- findPostCode(address)
    } yield Success(postCode)).merge
  }


  def findUser(userId: Int): Either[Failure, User] = {
    userDatabase.get(userId).toRight(UserNotFound)
  }

  //Userクラスからアドレスクラスを求めるメソッド
  def findAddress(user: User): Either[Failure, Address] = {

    for {
      addressId <- user.addressId.toRight(UserNotHasAddress)
      address <- addressDatabase.get(addressId).toRight(AddressNotFound)
    } yield address
  }

  //アドレスクラスから郵便番号を求めるメソッド
  def findPostCode(address: Address): Either[Failure, String] = {

    address.postCode.toRight(AddressNotHasPostCode)
  }

  def main(args: Array[String]): Unit = {

    println(getPostCodeResult(1))
    println(getPostCodeResult(2))
    println(getPostCodeResult(3))
    println(getPostCodeResult(4))
  }


}
