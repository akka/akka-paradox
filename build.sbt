scalaVersion := "2.13.11"

licenses += "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html")

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
      // There are newer versions of foundation available, but
      // they break the 3-column indexes and the left margin on
      // zoomed-in breakpoints, so let's stick with 6.3.1 until
      // we find time to fix that.
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
    addSbtPlugin(
      // When updating the sbt-paradox version,
      // remember to also update project/plugins.sbt
      "com.lightbend.paradox" % "sbt-paradox" % "0.10.5"
    ),
    addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-apidoc" % "1.0.0"),
    addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-lightbend-project-info" % "2.0.0"),
    Compile / resourceGenerators += Def.task {
      val file = (Compile / resourceManaged).value / "akka-paradox.properties"
      IO.write(file, s"akka.paradox.version=${version.value}")
      Seq(file)
    }
  )
