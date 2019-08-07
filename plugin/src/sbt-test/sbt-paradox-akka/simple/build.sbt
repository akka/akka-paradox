val ivyLocal = Resolver.file("local", file(Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns)

resolvers += ivyLocal

enablePlugins(AkkaParadoxPlugin)
