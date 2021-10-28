# Releasing

1. Wait until all running [Travis CI jobs](https://travis-ci.org/akka/akka-paradox/builds) complete, if any.
1. Tag the next build (`git tag -a -s -m 'Release v$VERSION$' v$VERSION$`) and push the tag (`git push --tags`)
1. GitHub Actions will start a [CI build](https://github.com/akka/akka-paradox/actions) for the new tag and publish artifacts to Sonatype.
1. When the new artifact has reached Maven Central, fix up the [draft release](https://github.com/akka/akka-paradox/releases) created by the release drafter and attach the GitHub Release to the tag
