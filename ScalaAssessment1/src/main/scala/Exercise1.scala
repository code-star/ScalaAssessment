object Exercise1 {
  def scrapeBumps[T](input: Seq[T])(implicit num: Numeric[T]) = {
    input match {
      case Nil => Nil
      case _ =>
        input.tail.foldLeft(Seq[T](input.head)) { (accu, n) =>
          if (num.gt(n, accu.head))
            accu.head +: accu
          else
            n +: accu
        }.reverse
    }
  }
}
