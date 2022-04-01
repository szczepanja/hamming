object Hamming {

  def hamming(leftString: String, rightString: String): Option[Integer] = {
    if (leftString.length == rightString.length) {
      Some(leftString
        .zip(rightString)
        .count(tuple => tuple._1 != tuple._2))
    }
    else None
  }

}
