addSbtPlugin("com.github.gseitz"     % "sbt-release"       % "1.0.12")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-theme" % "0.6.8")
addSbtPlugin("com.dwijnand"          % "sbt-dynver"        % "4.0.0")
addSbtPlugin("org.foundweekends"     % "sbt-bintray"       % "0.5.5")

resolvers += Resolver.url("2m-sbt-plugin-releases", url("https://dl.bintray.com/2m/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
