name := "$name$"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature"
)

enablePlugins(MdocPlugin)

libraryDependencies  ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.14" % "test",
  "org.scalactic" %% "scalactic" % "3.2.14" % "test",
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.14.0" % "test",
  "com.github.darrenjw" %% "scala-glm" % "0.8"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at
    "https://oss.sonatype.org/content/repositories/releases/"
)

scalaVersion := "3.2.1"

