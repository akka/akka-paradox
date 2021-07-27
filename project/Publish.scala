import sbt._
import sbt.Keys._
import xerial.sbt.Sonatype

object Publish extends AutoPlugin {
  import Sonatype.autoImport.sonatypeProfileName

  override def trigger = allRequirements
  override def requires = Sonatype

  override def projectSettings = Seq(
    sonatypeProfileName := "com.lightbend",
    homepage := Some(url("https://developer.lightbend.com/docs/paradox")),
    developers := List(
      Developer(
        "akka-contributors",
        "Akka Contributors",
        "akka.official@gmail.com",
        url("https://github.com/akka/akka-paradox/graphs/contributors"))),
    licenses += "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html"),
  )

}
