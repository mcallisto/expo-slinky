# expo-slinky
[Expo SDK 38](https://dev.to/expo/expo-sdk-38-is-now-available-5aa0) bindings for slinky (powered by ScalablyTyped) with:
 * [expo-localization](https://docs.expo.io/versions/v38.0.0/sdk/localization/) 
 * [expo-font](https://docs.expo.io/versions/v38.0.0/sdk/font/)
 * [expo-constants](https://docs.expo.io/versions/v38.0.0/sdk/constants/)
 * [expo-sqlite](https://docs.expo.io/versions/v38.0.0/sdk/sqlite/)

It is distributed for Scala 2.13 and Scala.js 1

```
resolvers += Resolver.bintrayRepo("mcallisto", "libs")
libraryDependencies ++= Seq(
    "default" %%% "expo-slinky" % "0.1.5" 
) 
```

## Minimization

See the following compilation output:

```
[warn] Wrote expo-localization (5 files)
[warn] Wrote expo-font (13 files)
[warn] Wrote expo-sqlite (15 files)
[warn] Wrote expo-constants (19 files)
[warn] Wrote expo (102 files)
[warn] Wrote minimized @unimodules/react-native-adapter (1 files)
[warn] Wrote minimized prop-types (3 files)
[warn] Wrote minimized expo-linking (4 files)
[warn] Wrote minimized expo-asset (6 files)
[warn] Wrote minimized csstype (0 files)
[warn] Wrote minimized react (29 files)
[warn] Wrote minimized std (11 files)
[warn] Wrote minimized react-native (308 files)
```