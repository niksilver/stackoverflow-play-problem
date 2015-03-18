name := "my-first-app"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// This line fixes Eclipse but causes problems when
// we try to run the app in sbt
//
unmanagedJars in Compile += ( baseDirectory.value / "target/scala-2.11/classes_managed" )

