addSbtPlugin("com.github.sbt"     % "sbt-release"       % "1.0.14")
// even update the paradox plugin in build.sbt
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-theme" % "0.9.2")
addSbtPlugin("com.dwijnand"          % "sbt-dynver"        % "4.1.1")
addSbtPlugin("org.foundweekends"     % "sbt-bintray"       % "0.6.1")

resolvers += Resolver.url("2m-sbt-plugin-releases", url("https://dl.bintray.com/2m/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
