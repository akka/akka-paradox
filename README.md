# Paradox for Akka documentation

This plugin extends the Paradox sbt plugin with some default settings and sets the Akka Paradox theme.

It is intended as a shared doc theme for the Akka umbrella of projects, and not as a public theme to use on "any" project.

## Usage

Use the sbt plugin for Akka Paradox:

```scala
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "<version>")
```

Enable it instead of the upstream `ParadoxPlugin`:

```scala
enablePlugins(AkkaParadoxPlugin)
```

And add JCenter resolver to the project where `AkkaParadoxPlugin` is enabled. This is needed for the [Akka Paradox Theme](https://bintray.com/akka/maven/paradox-theme-akka) to be resolved:

```scala
resolvers += Resolver.jcenterRepo
```

For more settings refer to the [Paradox documentation](https://developer.lightbend.com/docs/paradox/latest/)

## Testing

When you have made changes to akka-paradox, you can test it locally with:

```
sbt publishLocal sbtPlugin/scripted
```

This should show:

```
Pausing in /tmp/sbt_e457458e/simple
Press enter to continue.
```

Now in your browser you can see the docs at file:///tmp/sbt_e457458e/simple/target/paradox/site/main/index.html

## Releasing

- Tag the commit you want to release
- Travis should automatically release to https://bintray.com/akka
