name := "play_trail_1"
 
version := "1.0" 
      
lazy val `play_trail_1` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( 
  jdbc , 
  ehcache , 
  ws , 
  specs2 % Test ,
  guice,
  "com.pauldijou" %% "jwt-play" % "0.19.0",
  "com.pauldijou" %% "jwt-core" % "0.19.0",
  "com.auth0" % "jwks-rsa" % "0.6.1"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      