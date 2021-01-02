name := "$name$"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature"
)

enablePlugins(MdocPlugin)

libraryDependencies  ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.2" % "test",
  "com.github.darrenjw" %% "scala-glm" % "0.4"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at
    "https://oss.sonatype.org/content/repositories/releases/"
)

scalaVersion := "2.13.4"

