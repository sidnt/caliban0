val scalaV = "2.13.4"
val zioV = "1.0.4-2"
val calibanV = "0.9.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "caliban0",
    version := "0.1.0",
    scalaVersion := scalaV,
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % zioV,
      "com.github.ghostdogpr" %% "caliban" % calibanV
    )
  )
