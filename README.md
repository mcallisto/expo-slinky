# expo-slinky
Expo bindings for slinky (powered by ScalablyTyped)

It is distributed for Scala 2.13 and Scala.js 1

```
resolvers += Resolver.bintrayRepo("mcallisto", "libs")
libraryDependencies ++= Seq(
    "default" %%% "expo-slinky" % "0.1.1" 
) 
```

## Minimization

See the following compilation output:

```
[warn] Wrote expo-font (11 files) [ms => 27546]
[warn] Wrote expo-sqlite (14 files) [ms => 27546]
[warn] Wrote expo-constants (21 files) [ms => 27557]
[warn] Wrote expo (225 files) [ms => 27620]
[warn] Wrote minimized fbemitter (1 files) [ms => 28048]
[warn] Wrote minimized prop-types (4 files) [ms => 28048]
[warn] Wrote minimized @unimodules/react-native-adapter (1 files) [ms => 28048]
[warn] Wrote minimized expo-linking (4 files) [ms => 28050]
[warn] Wrote minimized expo-asset (6 files) [ms => 28050]
[warn] Wrote minimized react-native-view-shot (6 files) [ms => 28052]
[warn] Wrote minimized expo-linear-gradient (18 files) [ms => 28067]
[warn] Wrote minimized react (29 files) [ms => 28070]
[warn] Wrote minimized @expo/vector-icons (24 files) [ms => 28070]
[warn] Wrote minimized csstype (0 files) [ms => 28071]
[warn] Wrote minimized std (11 files) [ms => 28083]
[warn] Wrote minimized react-native (307 files) [ms => 28252]
```