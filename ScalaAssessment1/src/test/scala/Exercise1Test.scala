import org.scalacheck.Prop.{AnyOperators, forAll}
import org.scalatest.PropSpec
import org.scalatest.prop.Checkers

import Exercise1.scrapeBumps

class Exercise1Test extends PropSpec with Checkers {

  property("#1: scraping bumps off a list results in descending lists") {
    check(
      forAll { numbers: Seq[Int] =>
        val result = scrapeBumps(numbers)
        result.sortWith(_ > _) ?= result
      }
    )
  }

  property("#2: length of output list doesn't change") {
    check(
      forAll { numbers: Seq[Int] =>
        val result = scrapeBumps(numbers)
        result.length ?= numbers.length
      }
    )
  }

  property("#3: the first element of the output should not be altered") {
    check(
      forAll { numbers: Seq[Int] =>
        val result = scrapeBumps(numbers)
        result.headOption ?= numbers.headOption
      }
    )
  }

  property("#4: the minimum number should be the same in output and input") {
    check(
      forAll { numbers: Seq[Int] =>
        val result = scrapeBumps(numbers)
        result.sortWith(_ < _).headOption ?= numbers.sortWith(_ < _).headOption
      }
    )
  }

}
