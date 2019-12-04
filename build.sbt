scalaVersion := "2.12.4"

lazy val akkaParadox = project
  .in(file("."))
  .settings(
    publish / skip := true
  )
  .aggregate(akkaTheme, akkaPlugin)

lazy val akkaTheme = project
  .in(file("theme"))
  .enablePlugins(ParadoxThemePlugin)
  .settings(
    organization := "com.lightbend.akka",
    name := "paradox-theme-akka",
    libraryDependencies ++= Seq(
      "org.webjars" % "foundation" % "6.3.1" % "provided",
      "org.webjars" % "prettify" % "4-Mar-2013-1" % "provided"
    )
  )

lazy val akkaPlugin = project
  .in(file("plugin"))
  .enablePlugins(SbtPlugin)
  .settings(
    sbtPlugin := true,
    organization := "com.lightbend.akka",
    name := "sbt-paradox-akka",
    scriptedLaunchOpts := { scriptedLaunchOpts.value ++
      Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
    },
    scriptedBufferLog := false,
    bintrayRepository := "sbt-plugin-releases",
    addSbtPlugin(
      "com.lightbend.paradox" % "sbt-paradox" % "0.6.7"
    ),
    addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-apidoc" % "0.7"),
    addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-project-info" % "1.1.3"),
    resourceGenerators in Compile += Def.task {
      val file = (resourceManaged in Compile).value / "akka-paradox.properties"
      IO.write(file, s"akka.paradox.version=${version.value}")
      Seq(file)
    }
  )
