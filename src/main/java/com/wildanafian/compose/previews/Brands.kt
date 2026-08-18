package com.wildanafian.compose.previews

import androidx.compose.ui.tooling.preview.Preview

/**
 * Pre-configured Jetpack Compose MultiPreview annotations grouping representative devices by brand.
 */

/**
 * MultiPreview for representative Samsung Galaxy devices (Flagship, Mid-Range, Foldable, Tablet).
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Galaxy S24 Ultra",
    group = "Samsung",
    device = "spec:width=1440px,height=3120px,dpi=505",
    showBackground = true
)
@Preview(
    name = "Galaxy S24",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=422",
    showBackground = true
)
@Preview(
    name = "Galaxy A55 5G",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=390",
    showBackground = true
)
@Preview(
    name = "Galaxy A15 5G",
    group = "Samsung",
    device = "spec:width=1080px,height=2340px,dpi=396",
    showBackground = true
)
@Preview(
    name = "Galaxy Z Fold6",
    group = "Samsung",
    device = "spec:width=1856px,height=2160px,dpi=374",
    showBackground = true
)
@Preview(
    name = "Galaxy Tab S9",
    group = "Samsung",
    device = "spec:width=1600px,height=2560px,dpi=274",
    showBackground = true
)
annotation class PreviewSamsung

/**
 * MultiPreview for representative Google Pixel devices (Pro, Standard, A-Series, Fold).
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Google Pixel 9 Pro XL",
    group = "Google Pixel",
    device = "spec:width=1344px,height=2992px,dpi=560",
    showBackground = true
)
@Preview(
    name = "Google Pixel 9",
    group = "Google Pixel",
    device = "spec:width=1080px,height=2424px,dpi=428",
    showBackground = true
)
@Preview(
    name = "Google Pixel 8a",
    group = "Google Pixel",
    device = "spec:width=1080px,height=2400px,dpi=420",
    showBackground = true
)
@Preview(
    name = "Google Pixel 7a",
    group = "Google Pixel",
    device = "spec:width=1080px,height=2400px,dpi=420",
    showBackground = true
)
@Preview(
    name = "Google Pixel Fold",
    group = "Google Pixel",
    device = "spec:width=1840px,height=2208px,dpi=380",
    showBackground = true
)
annotation class PreviewGooglePixel

/**
 * MultiPreview for representative Xiaomi, Redmi, and POCO devices.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Xiaomi 15",
    group = "Xiaomi / Redmi / POCO",
    device = "spec:width=1200px,height=2670px,dpi=460",
    showBackground = true
)
@Preview(
    name = "POCO F6 Pro",
    group = "Xiaomi / Redmi / POCO",
    device = "spec:width=1440px,height=3200px,dpi=560",
    showBackground = true
)
@Preview(
    name = "POCO F6",
    group = "Xiaomi / Redmi / POCO",
    device = "spec:width=1220px,height=2712px,dpi=440",
    showBackground = true
)
@Preview(
    name = "Redmi Note 13 Pro",
    group = "Xiaomi / Redmi / POCO",
    device = "spec:width=1220px,height=2712px,dpi=446",
    showBackground = true
)
@Preview(
    name = "Redmi 13C 5G",
    group = "Xiaomi / Redmi / POCO",
    device = "spec:width=720px,height=1600px,dpi=260",
    showBackground = true
)
annotation class PreviewXiaomiRedmiPoco

/**
 * MultiPreview for representative Vivo and iQOO devices.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Vivo X100 Pro",
    group = "Vivo & iQOO",
    device = "spec:width=1260px,height=2800px,dpi=452",
    showBackground = true
)
@Preview(
    name = "iQOO 12",
    group = "Vivo & iQOO",
    device = "spec:width=1260px,height=2800px,dpi=453",
    showBackground = true
)
@Preview(
    name = "iQOO Neo 8",
    group = "Vivo & iQOO",
    device = "spec:width=1260px,height=2800px,dpi=452",
    showBackground = true
)
@Preview(
    name = "Vivo V30 Pro",
    group = "Vivo & iQOO",
    device = "spec:width=1260px,height=2800px,dpi=453",
    showBackground = true
)
@Preview(
    name = "Vivo Y100 5G",
    group = "Vivo & iQOO",
    device = "spec:width=1080px,height=2400px,dpi=395",
    showBackground = true
)
annotation class PreviewVivoIqoo

/**
 * MultiPreview for representative OnePlus devices.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OnePlus 13",
    group = "OnePlus",
    device = "spec:width=1440px,height=3168px,dpi=560",
    showBackground = true
)
@Preview(
    name = "OnePlus 12",
    group = "OnePlus",
    device = "spec:width=1440px,height=3168px,dpi=560",
    showBackground = true
)
@Preview(
    name = "OnePlus 11",
    group = "OnePlus",
    device = "spec:width=1440px,height=3216px,dpi=560",
    showBackground = true
)
@Preview(
    name = "OnePlus Nord 4",
    group = "OnePlus",
    device = "spec:width=1240px,height=2772px,dpi=450",
    showBackground = true
)
@Preview(
    name = "OnePlus Nord 3",
    group = "OnePlus",
    device = "spec:width=1080px,height=2412px,dpi=420",
    showBackground = true
)
annotation class PreviewOneplus

/**
 * MultiPreview for representative OPPO devices.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OPPO Find X7 Ultra",
    group = "OPPO",
    device = "spec:width=1440px,height=3168px,dpi=560",
    showBackground = true
)
@Preview(
    name = "OPPO Reno 12 Pro",
    group = "OPPO",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
@Preview(
    name = "OPPO Reno 10 5G",
    group = "OPPO",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
@Preview(
    name = "OPPO A78 5G",
    group = "OPPO",
    device = "spec:width=720px,height=1612px,dpi=269",
    showBackground = true
)
@Preview(
    name = "OPPO A58",
    group = "OPPO",
    device = "spec:width=1080px,height=2400px,dpi=392",
    showBackground = true
)
annotation class PreviewOppo

/**
 * MultiPreview for representative Realme devices.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Realme GT 6",
    group = "Realme",
    device = "spec:width=1264px,height=2780px,dpi=450",
    showBackground = true
)
@Preview(
    name = "Realme GT 5 Pro",
    group = "Realme",
    device = "spec:width=1264px,height=2780px,dpi=480",
    showBackground = true
)
@Preview(
    name = "Realme 12 Pro+",
    group = "Realme",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
@Preview(
    name = "Realme 11 Pro+",
    group = "Realme",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
@Preview(
    name = "Realme C55",
    group = "Realme",
    device = "spec:width=1080px,height=2400px,dpi=392",
    showBackground = true
)
annotation class PreviewRealme

/**
 * MultiPreview for representative Motorola devices.
 */
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Edge 50 Fusion",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=393",
    showBackground = true
)
@Preview(
    name = "Motorola Edge 40 Pro",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=394",
    showBackground = true
)
@Preview(
    name = "Motorola Edge 40",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=420",
    showBackground = true
)
@Preview(
    name = "Motorola Moto G84 5G",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=405",
    showBackground = true
)
@Preview(
    name = "Motorola Moto G54 5G",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=405",
    showBackground = true
)
annotation class PreviewMotorola
