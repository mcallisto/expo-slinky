/* ScalablyTyped configuration */
enablePlugins(ScalablyTypedConverterGenSourcePlugin)

scalaVersion := "2.13.4"
name := "expo-slinky"
version := "0.2.2"

/* javascript / typescript deps */
Compile / npmDependencies ++= Seq(
  "@types/react" -> "~16.9.35",
  "@types/react-native" -> "~0.63.2",
  "expo" -> "^40.0.0",
  "expo-app-loading" -> "~1.0.1",
  "expo-asset" -> "~8.2.1",
  "expo-auth-session" -> "2.0.3",
  "expo-av" -> "~8.7.0",
  "expo-constants" -> "~9.3.3",
  "expo-font" -> "~8.4.0",
  "expo-localization" -> "~9.1.0",
  "expo-sqlite" -> "~8.2.1",
  "expo-status-bar" -> "~1.0.3",
  "expo-linking" -> "~2.0.1",
  "expo-web-browser" -> "~8.6.0",
  "react-native" -> "https://github.com/expo/react-native/archive/sdk-40.0.1.tar.gz"
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
  "expo-app-loading",
  "expo-font",
  "expo",
  "expo-constants",
  "expo-sqlite",
  "expo-asset",
  "expo-auth-session",
  "expo-av",
  "expo-status-bar",
  "expo-linking",
  "expo-web-browser"
)

stIgnore := List("@expo/config-plugins")

// shade into another package
stOutputPackage := "vision.id.expo.facade"

ThisBuild / organization := "vision.id"
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
