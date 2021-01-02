import org.scalatest._
import flatspec._
import matchers._

// Unit tests

class LinalgSpec extends AnyFlatSpec
    with should.Matchers {

  import scalaglm.Utils.backSolve
  import breeze.linalg._

  "backSolve" should "invert correctly" in {
    val A = DenseMatrix((4,1),(0,2)) map (_.toDouble)
    val x = DenseVector(3.0,-2.0)
    val y = A * x
    val xx = backSolve(A,y)
    norm(x-xx) < 0.00001 shouldBe true
  }

}

// Property-based tests

import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class LinalgProps extends AnyFlatSpec
    with should.Matchers
    with ScalaCheckPropertyChecks {

  import scalaglm.Utils.backSolve
  import breeze.linalg._

  forAll { (x0: Double, x1: Double) =>
    whenever (math.abs(x0) < 1e80 && math.abs(x1) < 1e80) {

    val A = DenseMatrix((4,1),(0,2)) map (_.toDouble)
    val x = DenseVector(x0, x1)
    val y = A * x
    val xx = backSolve(A,y)
    norm(x-xx) < 0.00001 + 0.0001*norm(x) shouldBe true
    }
  }


}
