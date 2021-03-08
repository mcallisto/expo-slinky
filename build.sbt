/* ScalablyTyped configuration */
enablePlugins(ScalablyTypedConverterGenSourcePlugin)

scalaVersion := "2.13.3"
name := "expo-slinky"
version := "0.1.10"

/* javascript / typescript deps */
Compile / npmDependencies ++= Seq(
  "@types/react" -> "~16.9.41",
  "@types/react-native" -> "~0.62.13",
  "expo" -> "^38.0.0",
  "expo-asset" -> "8.2.0",
  "expo-av" -> "~8.2.1",
  "expo-constants" -> "~9.1.1",
  "expo-font" -> "~8.2.1",
  "expo-localization" -> "~8.2.1",
  "expo-sqlite" -> "~8.2.1",
  "expo-status-bar" -> "1.0.2",
  "expo-linking" -> "1.0.4",
  "expo-web-browser" -> "~8.2.1",
  "react-native" -> "https://github.com/expo/react-native/archive/sdk-38.0.2.tar.gz"
)

/* disabled because it somehow triggers many warnings */
scalaJSLinkerConfig ~= (_.withSourceMap(false))

// because npm is slow
useYarn := true

// say we want custom code for slinky
stFlavour := Flavour.SlinkyNative

// focus only on these libraries
stMinimize := Selection.AllExcept(
  "expo-localization",
  "expo-font",
  "expo",
  "expo-constants",
  "expo-sqlite",
  "expo-asset",
  "expo-av",
  "expo-status-bar",
  "expo-linking",
  "expo-web-browser"
)

// shade into another package
stOutputPackage := "vision.id.expo.facade"

ThisBuild / organization := "vision.id.expo-slinky"
ThisBuild / organizationName := "vision.id"
ThisBuild / organizationHomepage := Some(url("http://id.vision/"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/mcallisto/expo-slinky"),
    "scm:git@github.com:mcallisto/expo-slinky.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "mcallisto",
    name  = "Mario Càllisto",
    email = "mario.callisto@gmail.com",
    url   = url("https://github.com/mcallisto")
  )
)

ThisBuild / description := "Expo bindings for slinky (powered by ScalablyTyped)."
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/mcallisto/expo-slinky"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

//publishMavenStyle := true
//homepage := Some(new URL("https://github.com/mcallisto/expo-slinky"))
//startYear := Some(2020)
//pomExtra := (
//  <scm>
//    <connection>scm:git:github.com:/mcallisto/expo-slinky</connection>
//    <developerConnection>scm:git:git@github.com:mcallisto/expo-slinky.git</developerConnection>
//    <url>github.com:mcallisto/expo-slinky.git</url>
//  </scm>
//    <developers>
//      <developer>
//        <id>mcallisto</id>
//        <name>Mario Càllisto</name>
//      </developer>
//    </developers>
//)
//licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
//bintrayRepository := "libs"
