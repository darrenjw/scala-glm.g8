name := "$name$"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature"
)

enablePlugins(MdocPlugin)

libraryDependencies  ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.16" % "test",
  "org.scalactic" %% "scalactic" % "3.2.16" % "test",
  "org.scalatestplus" %% "scalacheck-1-17" % "3.2.16.0" % "test",
  "com.github.darrenjw" %% "scala-glm" % "0.8"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at
    "https://oss.sonatype.org/content/repositories/releases/"
)

scalaVersion := "3.3.0"

