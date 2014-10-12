
object BinarySearch {
  def apply[A](array: Array[A], key: A, minIdx: Int, maxIdx: Int)(implicit ord: math.Ordering[A]): Int = {
    if (maxIdx <= minIdx)
      -1
    else {
      val midIdx = (maxIdx - minIdx) / 2 + minIdx
      if (ord.lt(array(midIdx), key))
        BinarySearch(array, key, midIdx + 1, maxIdx)
      else if (ord.gt(array(midIdx), key))
        BinarySearch(array, key, minIdx, midIdx)
      else
        midIdx
    }
  }

  def apply[A](array: Array[A], key: A)(implicit ord: math.Ordering[A]): Int = {
    BinarySearch(array, key, 0, array.length)(ord)
  }
}