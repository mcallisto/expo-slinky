# expo-slinky
[Expo SDK 40](https://dev.to/expo/expo-sdk-40-is-now-available-1lm8) bindings for slinky (powered by ScalablyTyped) with:
 * [expo-app-loading](https://docs.expo.io/versions/v40.0.0/sdk/app-loading/)
 * [expo-auth-session](https://docs.expo.io/versions/v40.0.0/sdk/auth-session/)
 * [expo-localization](https://docs.expo.io/versions/v40.0.0/sdk/localization/)
 * [expo-font](https://docs.expo.io/versions/v40.0.0/sdk/font/)
 * [expo-constants](https://docs.expo.io/versions/v40.0.0/sdk/constants/)
 * [expo-sqlite](https://docs.expo.io/versions/v40.0.0/sdk/sqlite/)
 * [expo-status-bar](https://docs.expo.io/versions/v40.0.0/sdk/status-bar/)
 * [expo-asset](https://docs.expo.io/versions/v40.0.0/sdk/asset/)
 * [expo-av](https://docs.expo.io/versions/v40.0.0/sdk/audio/)
 * [expo-linking](https://docs.expo.io/workflow/linking/)
 * [expo-web-browser](https://docs.expo.io/versions/v40.0.0/sdk/webbrowser/)

It is distributed for Scala 2.13 and Scala.js 1

```
libraryDependencies ++= Seq("vision.id" %%% "expo-slinky" % "0.2.2") 
```

## Minimization

See the following compilation output:

```
[warn] Wrote expo-app-loading (9 files)
[warn] Wrote expo-linking (9 files)
[warn] Wrote expo-localization (5 files)
[warn] Wrote expo-status-bar (15 files)
[warn] Wrote expo-web-browser (7 files)
[warn] Wrote expo-sqlite (5 files)
[warn] Wrote expo-constants (7 files)
[warn] Wrote expo-font (10 files)
[warn] Wrote expo-asset (13 files)
[warn] Wrote expo (42 files)
[warn] Wrote expo-auth-session (42 files)
[warn] Wrote expo-av (44 files)
[warn] Wrote minimized @unimodules/core (2 files)
[warn] Wrote minimized unimodules-permissions-interface (2 files)
[warn] Wrote minimized @unimodules/react-native-adapter (4 files)
[warn] Wrote minimized prop-types (2 files)
[warn] Wrote minimized csstype (0 files)
[warn] Wrote minimized react (27 files)
[warn] Wrote minimized std (14 files)
[warn] Wrote minimized react-native (326 files)
```