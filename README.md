# Jetpack Compose Device Previews

[![JitPack](https://jitpack.io/v/Wildanafian/compose-device-previews.svg)](https://jitpack.io/#Wildanafian/compose-device-previews)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Pre-configured Jetpack Compose MultiPreview annotations for real-world Android devices. Preview your layouts on exact phone, foldable, and tablet screen dimensions directly in Android Studio with a single annotation.

---

## Why This Library?

When building responsive UIs in Jetpack Compose, the default `@Preview` only renders generic device sizes. Testing on realistic hardware usually means manually defining custom specification strings:

```kotlin
// Tedious, easy to mistype, and repetitive across projects
@Preview(device = "spec:width=1440px,height=3120px,dpi=505")
@Preview(device = "spec:width=1856px,height=2160px,dpi=374")
```

**Compose Device Previews** replaces manual spec strings with clean, reusable annotations:
* **Instant MultiPreviews**: Preview across entire categories (Flagships, Mid-Range, Foldables, Tablets) with a single annotation.
* **Exact Real-World Hardware**: Precise resolutions, aspect ratios, and DPI buckets for major Android brands.
* **Zero APK Size Impact**: Built with `AnnotationRetention.SOURCE`, so annotations are stripped at compile time. 0 KB added to release binaries.
* **KMP and CMP Ready**: Usable in both pure Jetpack Compose and Kotlin Multiplatform / Compose Multiplatform projects.

---

## Installation

### Step 1. Add JitPack repository

Add JitPack to your root `settings.gradle.kts`:

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
```

### Step 2. Add the dependency

#### Option A: Jetpack Compose (Pure Android)
In your `app/build.gradle.kts`:
```kotlin
dependencies {
    implementation("com.github.Wildanafian:compose-device-previews:v1.0.0")
}
```

#### Option B: Compose Multiplatform / KMP
In your `composeApp/build.gradle.kts` (or `shared/build.gradle.kts`):
```kotlin
kotlin {
    sourceSets {
        androidMain.dependencies {
            implementation("com.github.Wildanafian:compose-device-previews:v1.0.0")
        }
    }
}
```
*Note: In CMP/KMP, place your preview functions in `src/androidMain` to preview shared composables from `commonMain` directly in Android Studio.*

---

## How to Use

### 1. MultiPreview Groups (Test Multiple Devices at Once)

Annotate your `@Composable` function with pre-configured category or brand groups:

```kotlin
import androidx.compose.runtime.Composable
import com.wildanafian.compose.previews.PreviewFoldableDevices
import com.wildanafian.compose.previews.PreviewFlagshipDevices

@PreviewFoldableDevices
@Composable
fun DashboardFoldablePreview() {
    MyApplicationTheme {
        DashboardScreen()
    }
}

@PreviewFlagshipDevices
@Composable
fun DashboardFlagshipPreview() {
    MyApplicationTheme {
        DashboardScreen()
    }
}
```

### 2. Individual Device Previews

Preview your UI on a specific phone or tablet model:

```kotlin
import androidx.compose.runtime.Composable
import com.wildanafian.compose.previews.devices.PreviewGalaxyS24Ultra
import com.wildanafian.compose.previews.devices.PreviewPixel9ProXl
import com.wildanafian.compose.previews.devices.PreviewXiaomi15

@PreviewGalaxyS24Ultra
@Composable
fun SpecificDevicePreview() {
    MyApplicationTheme {
        DashboardScreen()
    }
}
```

---

## Available MultiPreview Groups

Located in `com.wildanafian.compose.previews`:

| Annotation Class | Included Devices & Form Factors |
| :--- | :--- |
| **`@PreviewFoldableDevices`** | Pixel Fold (Main & Cover), Galaxy Z Fold6 (Main & Cover), Galaxy Z Flip6 (Main & Cover) |
| **`@PreviewTabletDevices`** | Galaxy Tab S9 Ultra (14.6"), Tab S9+ (12.4"), Tab S9 (11"), Tab A9+ (11"), Tab A9 (8.7") |
| **`@PreviewFlagshipDevices`** | Pixel 9 Pro XL, Galaxy S24 Ultra, Xiaomi 15, OPPO Find X7 Ultra, OnePlus 12, Vivo X100 Pro |
| **`@PreviewMidRangeDevices`** | Galaxy A55 5G, Redmi Note 13 Pro, POCO F6, OnePlus Nord 4, Moto Edge 50, Realme GT 6T |
| **`@PreviewBudgetDevices`** | Galaxy A15 5G, Galaxy A05s, Galaxy A05, Redmi 13C 5G, Moto G54 5G, Realme Narzo 60 |

---

## Brand-Specific Previews

Located in `com.wildanafian.compose.previews` (Brand MultiPreviews) and `com.wildanafian.compose.previews.devices` (Individual Devices):

* **Samsung** (`@PreviewSamsung` & `SamsungDevices.kt`): Galaxy S24 Ultra, S24+, S24, S23, Z Fold6, Z Flip6, Tab S9 Ultra, Tab A9, A55, A15, etc.
* **Google Pixel** (`@PreviewGooglePixel` & `PixelDevices.kt`): Pixel 9 Pro XL, Pixel 9, Pixel 8a, Pixel 7a, Pixel Fold, etc.
* **Xiaomi / Redmi / POCO** (`@PreviewXiaomiRedmiPoco` & `XiaomiDevices.kt`): Xiaomi 15, 14, 13, Redmi Note 13 Pro, POCO F6 Pro, POCO F6, etc.
* **Vivo & iQOO** (`@PreviewVivoIqoo` & `VivoIqooDevices.kt`): Vivo X100 Pro, iQOO 12, iQOO Neo 8, Vivo V30 Pro, Vivo Y100, etc.
* **OnePlus** (`@PreviewOneplus` & `OnePlusDevices.kt`): OnePlus 13, 12, 11, Nord 4, Nord 3, etc.
* **OPPO** (`@PreviewOppo` & `OppoDevices.kt`): Find X7 Ultra, Reno 12 Pro, Reno 10, A78 5G, A58, etc.
* **Realme** (`@PreviewRealme` & `RealmeDevices.kt`): Realme GT 6, GT 5 Pro, 12 Pro+, 11 Pro+, C55, Narzo 60, etc.
* **Motorola** (`@PreviewMotorola` & `MotorolaDevices.kt`): Edge 50 Fusion, Edge 40 Pro, Edge 40, Moto G84 5G, Moto G54 5G, etc.

---

## Requirements

* Android Gradle Plugin `8.0+`
* Kotlin `2.0+`
* Jetpack Compose UI Tooling Preview
