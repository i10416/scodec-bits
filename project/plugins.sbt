resolvers += "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/"

addSbtPlugin("org.scodec" % "scodec-build" % "1.15.0")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.6.0")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.6.1")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.1")
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "0.6.31")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.3.9")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.0")
