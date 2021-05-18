
val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  scalaVersion := "2.13.6",
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-unchecked",
    "-language:implicitConversions",
    "-Xlint",
    "-Xfatal-warnings",
    "-Ywarn-numeric-widen",
    "-Ywarn-unused",
    "-Ywarn-unused:imports",
    "-Ywarn-value-discard",
  )
)

lazy val Benchmark = config("bench") extend Test
lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
      name := "scalameter-getting-started",
      libraryDependencies ++= Seq(
          "com.storm-enroute" %% "scalameter" % "0.19" % "bench",
          "org.scalatest" %% "scalatest"   % "3.1.1" % "test",
          ),
      resolvers ++= Seq(
          "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
          "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
      ),
      testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

  ).configs(Benchmark).settings(inConfig(Benchmark)(Defaults.testSettings): _*)

