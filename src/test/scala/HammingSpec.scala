import org.scalatest._
import flatspec._
import matchers._

class HammingSpec extends AnyFlatSpec with should.Matchers {

  import Hamming._

  "hamming" should "calculate the Hamming Distance between two DNA strands" in {
    hamming("GAGCCTACTAACGGGAT", "CATCGTAATGACGGCCT") shouldBe Some(7)
  }

  "hamming" should "return None if Strings are not equal" in {
    hamming("GAGCCTAACGGGAT", "CATCCCT") shouldBe None
  }

}
