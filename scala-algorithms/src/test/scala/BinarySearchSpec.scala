import org.scalatest._

class BinarySearchSpec extends FlatSpec with Matchers {

  "A binary search" should "return the index of the given key" in {
    val array = Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    BinarySearch(array, 2) shouldBe 2
    BinarySearch(array, 3) shouldBe 3
    BinarySearch(array, 5) shouldBe 4
    BinarySearch(array, 8) shouldBe 5
    BinarySearch(array, 13) shouldBe 6
    BinarySearch(array, 21) shouldBe 7
    BinarySearch(array, 34) shouldBe 8
    BinarySearch(array, 55) shouldBe 9
  }

  it should "return -1 if key not found" in {
    val array = Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55)
    BinarySearch(array, 0) shouldBe -1
    BinarySearch(array, 4) shouldBe -1
    BinarySearch(array, 6) shouldBe -1
    BinarySearch(array, 100) shouldBe -1
  }
}
