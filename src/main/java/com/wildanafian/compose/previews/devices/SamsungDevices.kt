package com.wildanafian.compose.previews.devices

import androidx.compose.ui.tooling.preview.Preview

/**
 * Pre-configured Jetpack Compose [Preview] annotations for Samsung Galaxy devices.
 * Curated to cover representative flagships, mid-range, budget, foldables, and tablets.
 */

// ==========================================
// GALAXY S SERIES (FLAGSHIP)
// ==========================================

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S24 Ultra",
    group = "Samsung",
    device = "spec:width=1440px,height=3120px,dpi=505",
    showBackground = true
)
annotation class PreviewGalaxyS24Ultra

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S24+",
    group = "Samsung",
    device = "spec:width=1440px,height=3120px,dpi=512",
    showBackground = true
)
annotation class PreviewGalaxyS24Plus

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S24",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=422",
    showBackground = true
)
annotation class PreviewGalaxyS24

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S24 FE",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=384",
    showBackground = true
)
annotation class PreviewGalaxyS24Fe

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S23 Ultra",
    group = "Samsung",
    device = "spec:width=1440px,height=3088px,dpi=501",
    showBackground = true
)
annotation class PreviewGalaxyS23Ultra

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S23",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=422",
    showBackground = true
)
annotation class PreviewGalaxyS23

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S22 Ultra",
    group = "Samsung",
    device = "spec:width=1440px,height=3088px,dpi=500",
    showBackground = true
)
annotation class PreviewGalaxyS22Ultra

// ==========================================
// GALAXY A SERIES (MID-RANGE & BUDGET)
// ==========================================

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A55 5G",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=390",
    showBackground = true
)
annotation class PreviewGalaxyA555g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A54 5G",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=402",
    showBackground = true
)
annotation class PreviewGalaxyA545g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A35 5G",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=390",
    showBackground = true
)
annotation class PreviewGalaxyA355g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A25 5G",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=396",
    showBackground = true
)
annotation class PreviewGalaxyA255g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A15 5G",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=396",
    showBackground = true
)
annotation class PreviewGalaxyA155g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A05s",
    group = "Samsung",
    device = "spec:width=1080px,height=2400px,dpi=392",
    showBackground = true
)
annotation class PreviewGalaxyA05s

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy A05",
    group = "Samsung",
    device = "spec:width=720px,height=1600px,dpi=261",
    showBackground = true
)
annotation class PreviewGalaxyA05

// ==========================================
// GALAXY Z SERIES (FOLDABLES & FLIPS)
// ==========================================

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Fold6 (Cover Screen)",
    group = "Samsung",
    device = "spec:width=968px,height=2376px,dpi=410",
    showBackground = true
)
annotation class PreviewGalaxyZFold6CoverScreen

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Fold6",
    group = "Samsung",
    device = "spec:width=1856px,height=2160px,dpi=374",
    showBackground = true
)
annotation class PreviewGalaxyZFold6

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Fold5 (Cover Screen)",
    group = "Samsung",
    device = "spec:width=904px,height=2316px,dpi=401",
    showBackground = true
)
annotation class PreviewGalaxyZFold5CoverScreen

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Fold5",
    group = "Samsung",
    device = "spec:width=1812px,height=2176px,dpi=373",
    showBackground = true
)
annotation class PreviewGalaxyZFold5

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Flip6 (Cover Screen)",
    group = "Samsung",
    device = "spec:width=720px,height=748px,dpi=306",
    showBackground = true
)
annotation class PreviewGalaxyZFlip6CoverScreen

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Flip6",
    group = "Samsung",
    device = "spec:width=1080px,height=2640px,dpi=426",
    showBackground = true
)
annotation class PreviewGalaxyZFlip6

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Flip5 (Cover Screen)",
    group = "Samsung",
    device = "spec:width=720px,height=748px,dpi=306",
    showBackground = true
)
annotation class PreviewGalaxyZFlip5CoverScreen

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Z Flip5",
    group = "Samsung",
    device = "spec:width=1080px,height=2640px,dpi=425",
    showBackground = true
)
annotation class PreviewGalaxyZFlip5

// ==========================================
// GALAXY TAB SERIES (TABLETS)
// ==========================================

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Tab S9 Ultra",
    group = "Samsung",
    device = "spec:width=1848px,height=2960px,dpi=239",
    showBackground = true
)
annotation class PreviewGalaxyTabS9Ultra

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Tab S9+",
    group = "Samsung",
    device = "spec:width=1752px,height=2800px,dpi=266",
    showBackground = true
)
annotation class PreviewGalaxyTabS9Plus

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Tab S9",
    group = "Samsung",
    device = "spec:width=1600px,height=2560px,dpi=274",
    showBackground = true
)
annotation class PreviewGalaxyTabS9

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Tab S9 FE",
    group = "Samsung",
    device = "spec:width=1440px,height=2304px,dpi=249",
    showBackground = true
)
annotation class PreviewGalaxyTabS9Fe

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Tab A9+",
    group = "Samsung",
    device = "spec:width=1200px,height=1920px,dpi=206",
    showBackground = true
)
annotation class PreviewGalaxyTabA9Plus

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy Tab A9",
    group = "Samsung",
    device = "spec:width=800px,height=1340px,dpi=179",
    showBackground = true
)
annotation class PreviewGalaxyTabA9
