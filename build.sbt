scalaVersion := "2.12.4"

lazy val akkaParadox = project
  .in(file("."))
  .enablePlugins(NoPublish)
  .aggregate(akkaTheme, akkaPlugin)

lazy val akkaTheme = project
  .in(file("theme"))
  .enablePlugins(ParadoxThemePlugin, ReproducibleBuildsPlugin)
  .settings(
    organization := "com.lightbend.akka",
    name := "paradox-theme-akka",
    libraryDependencies ++= Seq(
      Library.foundation % "provided",
      Library.prettify % "provided"
    )
  )

lazy val akkaPlugin = project
  .in(file("plugin"))
  .enablePlugins(ReproducibleBuildsPlugin)
  .settings(
    sbtPlugin := true,
    organization := "com.lightbend.akka",
    name := "sbt-paradox-akka",
    bintrayRepository := "sbt-plugin-releases",
    addSbtPlugin(Library.sbtParadox),
    resourceGenerators in Compile += Def.task {
      val file = (resourceManaged in Compile).value / "akka-paradox.properties"
      IO.write(file, s"akka.paradox.version=${version.value}")
      Seq(file)
    }
  )
