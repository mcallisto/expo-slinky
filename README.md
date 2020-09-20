# expo-slinky
Expo v37 bindings for slinky (powered by ScalablyTyped) with:
 * [expo-localization](https://docs.expo.io/versions/v37.0.0/sdk/localization/) 
 * [expo-font](https://docs.expo.io/versions/v37.0.0/sdk/font/)
 * [expo-constants](https://docs.expo.io/versions/v37.0.0/sdk/constants/)

It is distributed for Scala 2.13 and Scala.js 1

```
resolvers += Resolver.bintrayRepo("mcallisto", "libs")
libraryDependencies ++= Seq(
    "default" %%% "expo-slinky" % "0.1.3" 
) 
```

## Minimization

See the following compilation output:

```
[warn] Wrote expo-localization (5 files)
[warn] Wrote expo-font (11 files)
[warn] Wrote expo-sqlite (14 files)
[warn] Wrote expo-constants (21 files)
[warn] Wrote expo (225 files)
[warn] Wrote minimized fbemitter (1 files)
[warn] Wrote minimized @unimodules/react-native-adapter (1 files)
[warn] Wrote minimized prop-types (4 files)
[warn] Wrote minimized expo-linking (4 files)
[warn] Wrote minimized expo-asset (6 files)
[warn] Wrote minimized react-native-view-shot (6 files)
[warn] Wrote minimized @expo/vector-icons (24 files)
[warn] Wrote minimized expo-linear-gradient (18 files)
[warn] Wrote minimized csstype (0 files)
[warn] Wrote minimized react (29 files)
[warn] Wrote minimized std (11 files)
[warn] Wrote minimized react-native (307 files)
```