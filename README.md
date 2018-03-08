# Paradox for Akka documentation

This plugin extends the Paradox sbt plugin with some default settings and sets the Akka Paradox theme.

## Usage

Use the sbt plugin for Akka Paradox:

```scala
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "<version>")
```

And then enable it instead of the upstream `ParadoxPlugin`:

```scala
enablePlugins(AkkaParadoxPlugin)
```

For more settings refer to the [Paradox documentation](https://developer.lightbend.com/docs/paradox/latest/)


## Releasing

- Tag the commit you want to release
- Travis should automatically release to https://bintray.com/akka
