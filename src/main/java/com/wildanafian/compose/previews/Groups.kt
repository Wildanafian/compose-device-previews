package com.wildanafian.compose.previews

import androidx.compose.ui.tooling.preview.Preview

/**
 * Pre-configured Jetpack Compose MultiPreview annotations grouping devices by category (Foldables, Tablets, Flagships, etc.).
 */

/**
 * MultiPreview for foldable and flip devices in both unfolded and cover screen states.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Google Pixel Fold (Cover Screen)",
    group = "Foldables & Flips",
    device = "spec:width=1080px,height=2092px,dpi=408",
    showBackground = true
)
@Preview(
    name = "Google Pixel Fold (Main Screen)",
    group = "Foldables & Flips",
    device = "spec:width=1840px,height=2208px,dpi=380",
    showBackground = true
)
@Preview(
    name = "Galaxy Z Fold6 (Cover Screen)",
    group = "Foldables & Flips",
    device = "spec:width=968px,height=2376px,dpi=410",
    showBackground = true
)
@Preview(
    name = "Galaxy Z Fold6 (Main Screen)",
    group = "Foldables & Flips",
    device = "spec:width=1856px,height=2160px,dpi=374",
    showBackground = true
)
@Preview(
    name = "Galaxy Z Flip6 (Cover Screen)",
    group = "Foldables & Flips",
    device = "spec:width=720px,height=748px,dpi=306",
    showBackground = true
)
@Preview(
    name = "Galaxy Z Flip6 (Main Screen)",
    group = "Foldables & Flips",
    device = "spec:width=1080px,height=2640px,dpi=426",
    showBackground = true
)
annotation class PreviewFoldableDevices

/**
 * MultiPreview for tablet devices ranging from compact to ultra-large screens.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Tab S9 Ultra (14.6\")",
    group = "Tablets",
    device = "spec:width=1848px,height=2960px,dpi=239",
    showBackground = true
)
@Preview(
    name = "Galaxy Tab S9+ (12.4\")",
    group = "Tablets",
    device = "spec:width=1752px,height=2800px,dpi=266",
    showBackground = true
)
@Preview(
    name = "Galaxy Tab S9 (11.0\")",
    group = "Tablets",
    device = "spec:width=1600px,height=2560px,dpi=274",
    showBackground = true
)
@Preview(
    name = "Galaxy Tab A9+ (11.0\")",
    group = "Tablets",
    device = "spec:width=1200px,height=1920px,dpi=206",
    showBackground = true
)
@Preview(
    name = "Galaxy Tab A9 (8.7\")",
    group = "Tablets",
    device = "spec:width=800px,height=1340px,dpi=179",
    showBackground = true
)
annotation class PreviewTabletDevices

/**
 * MultiPreview for representative modern flagship smartphones.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Google Pixel 9 Pro XL",
    group = "Flagship Smartphones",
    device = "spec:width=1344px,height=2992px,dpi=560",
    showBackground = true
)
@Preview(
    name = "Galaxy S24 Ultra",
    group = "Flagship Smartphones",
    device = "spec:width=1440px,height=3120px,dpi=505",
    showBackground = true
)
@Preview(
    name = "Xiaomi 15",
    group = "Flagship Smartphones",
    device = "spec:width=1200px,height=2670px,dpi=460",
    showBackground = true
)
@Preview(
    name = "OPPO Find X7 Ultra",
    group = "Flagship Smartphones",
    device = "spec:width=1440px,height=3168px,dpi=560",
    showBackground = true
)
@Preview(
    name = "OnePlus 12",
    group = "Flagship Smartphones",
    device = "spec:width=1440px,height=3168px,dpi=510",
    showBackground = true
)
@Preview(
    name = "Vivo X100 Pro",
    group = "Flagship Smartphones",
    device = "spec:width=1260px,height=2800px,dpi=452",
    showBackground = true
)
annotation class PreviewFlagshipDevices

/**
 * MultiPreview for representative mid-range smartphones.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A55 5G",
    group = "Mid-Range Smartphones",
    device = "spec:width=1080px,height=2340px,dpi=390",
    showBackground = true
)
@Preview(
    name = "Redmi Note 13 Pro",
    group = "Mid-Range Smartphones",
    device = "spec:width=1220px,height=2712px,dpi=446",
    showBackground = true
)
@Preview(
    name = "POCO F6",
    group = "Mid-Range Smartphones",
    device = "spec:width=1220px,height=2712px,dpi=440",
    showBackground = true
)
@Preview(
    name = "OnePlus Nord 4",
    group = "Mid-Range Smartphones",
    device = "spec:width=1240px,height=2772px,dpi=450",
    showBackground = true
)
@Preview(
    name = "Motorola Edge 50 Fusion",
    group = "Mid-Range Smartphones",
    device = "spec:width=1080px,height=2400px,dpi=393",
    showBackground = true
)
@Preview(
    name = "Realme GT 6T",
    group = "Mid-Range Smartphones",
    device = "spec:width=1264px,height=2780px,dpi=450",
    showBackground = true
)
annotation class PreviewMidRangeDevices

/**
 * MultiPreview for entry-level and budget smartphones.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A15 5G",
    group = "Entry-Level / Budget Smartphones",
    device = "spec:width=1080px,height=2340px,dpi=396",
    showBackground = true
)
@Preview(
    name = "Galaxy A05s",
    group = "Entry-Level / Budget Smartphones",
    device = "spec:width=1080px,height=2400px,dpi=392",
    showBackground = true
)
@Preview(
    name = "Galaxy A05",
    group = "Entry-Level / Budget Smartphones",
    device = "spec:width=720px,height=1600px,dpi=261",
    showBackground = true
)
@Preview(
    name = "Redmi 13C 5G",
    group = "Entry-Level / Budget Smartphones",
    device = "spec:width=720px,height=1600px,dpi=260",
    showBackground = true
)
@Preview(
    name = "Motorola Moto G54 5G",
    group = "Entry-Level / Budget Smartphones",
    device = "spec:width=1080px,height=2400px,dpi=405",
    showBackground = true
)
@Preview(
    name = "Realme Narzo 60",
    group = "Entry-Level / Budget Smartphones",
    device = "spec:width=1080px,height=2400px,dpi=411",
    showBackground = true
)
annotation class PreviewBudgetDevices
