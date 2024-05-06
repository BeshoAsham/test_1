object Main {
  def main(args: Array[String]): Unit = {

    val supplies = List("pencil", "pen", "sharpener")
    val books = List("math book", "french book", "english book")

    val combinedList: List[List[String]] = List(supplies, books)

    combinedList.flatten.foreach(item => println(s"$item is required in the classroom."))


  }
}