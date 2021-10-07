/*
Stub for scala-glm code
*/

import scalaglm.Pca
import breeze.linalg._

@main def sglm() =
  val X = DenseMatrix((1.0,1.5),(1.5,2.0),(2.0,1.5))
  val pca = Pca(X, List("V1","V2"))
  pca.summary

