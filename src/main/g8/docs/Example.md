# Example mdoc document

## Scala mdoc markdown

This is an example [mdoc](https://scalameta.org/mdoc/) document. Markdown examples and documentation that gets typechecked and run. Documents in this directory can be processed with:

```bash
sbt mdoc
```

## Scala-glm example

Here is some example code to be type-checked and run:

```scala mdoc
import scalaglm.Pca
import breeze.linalg._

val X = DenseMatrix((1.0,1.5),(1.5,2.0),(2.0,1.5))
val pca = Pca(X, List("V1","V2"))
pca.summary 
```

