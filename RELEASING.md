# Releasing

1. Wait until all running [Travis CI jobs](https://travis-ci.org/akka/akka-paradox/builds) complete, if any.
1. Fix up the [draft release](https://github.com/akka/akka-paradox/releases) created by the release drafter and set the next tag version (e.g. `v0.2`)
1. Travis CI will start a [CI build](https://travis-ci.org/akka/akka-paradox/builds) for the new tag and publish artifacts to Bintray.
