import sbt._
import sbt.Keys._
import bintray.{ BintrayKeys, BintrayPlugin }

object Publish extends AutoPlugin {

  override def trigger = allRequirements
  override def requires = BintrayPlugin

  override def buildSettings = Seq(
    BintrayKeys.bintrayOrganization := Some("akka")
  )

  override def projectSettings = Seq(
    BintrayKeys.bintrayRepository := "maven",
    BintrayKeys.bintrayPackage := normalizedName.value,
    licenses += "Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html"),
    pomIncludeRepository := { _ => false }
  )

}