addSbtPlugin("com.github.gseitz"     % "sbt-release"             % "1.0.7")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-theme"       % "0.3.2")
addSbtPlugin("com.dwijnand"          % "sbt-dynver"              % "2.0.0")
addSbtPlugin("org.foundweekends"     % "sbt-bintray"             % "0.5.2")
addSbtPlugin("net.bzzt"              % "sbt-reproducible-builds" % "0.3")

resolvers += Resolver.url("2m-sbt-plugin-releases", url("https://dl.bintray.com/2m/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
