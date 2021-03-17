# expo-slinky
[Expo SDK 39](https://dev.to/expo/expo-sdk-39-is-now-available-1lm8) bindings for slinky (powered by ScalablyTyped) with:
 * [expo-localization](https://docs.expo.io/versions/v39.0.0/sdk/localization/) 
 * [expo-font](https://docs.expo.io/versions/v39.0.0/sdk/font/)
 * [expo-constants](https://docs.expo.io/versions/v39.0.0/sdk/constants/)
 * [expo-sqlite](https://docs.expo.io/versions/v39.0.0/sdk/sqlite/)
 * [expo-status-bar](https://docs.expo.io/versions/v39.0.0/sdk/status-bar/)
 * [expo-asset](https://docs.expo.io/versions/v39.0.0/sdk/asset/)
 * [expo-av](https://docs.expo.io/versions/v39.0.0/sdk/audio/)
 * [expo-linking](https://docs.expo.io/workflow/linking/)
 * [expo-web-browser](https://docs.expo.io/versions/v39.0.0/sdk/webbrowser/)

It is distributed for Scala 2.13 and Scala.js 1

```
libraryDependencies ++= Seq("vision.id" %%% "expo-slinky" % "0.2.0") 
```

## Minimization

See the following compilation output:

```
[warn] Wrote expo-localization (5 files)
[warn] Wrote expo-font (13 files)
[warn] Wrote expo-sqlite (15 files)
[warn] Wrote expo-status-bar (17 files)
[warn] Wrote expo-linking (10 files)
[warn] Wrote expo-web-browser (16 files)
[warn] Wrote expo-constants (19 files)
[warn] Wrote expo (79 files)
[warn] Wrote expo-asset (24 files)
[warn] Wrote expo-av (213 files)
[warn] Wrote minimized @unimodules/core (2 files)
[warn] Wrote minimized unimodules-permissions-interface (4 files)
[warn] Wrote minimized @unimodules/react-native-adapter (5 files)
[warn] Wrote minimized prop-types (3 files)
[warn] Wrote minimized csstype (0 files)
[warn] Wrote minimized react (31 files)
[warn] Wrote minimized std (11 files)
[warn] Wrote minimized react-native (324 files)
```