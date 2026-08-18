package com.wildanafian.compose.previews.devices

import androidx.compose.ui.tooling.preview.Preview

/**
 * Pre-configured Jetpack Compose [Preview] annotations for Oppo devices (6 devices).
 */

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OPPO A58",
    group = "OPPO",
    device = "spec:width=1080px,height=2400px,dpi=392",
    showBackground = true
)
annotation class PreviewOppoA58

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OPPO A78 5G",
    group = "OPPO",
    device = "spec:width=720px,height=1612px,dpi=269",
    showBackground = true
)
annotation class PreviewOppoA785g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OPPO Find X7 Ultra",
    group = "OPPO",
    device = "spec:width=1440px,height=3168px,dpi=560",
    showBackground = true
)
annotation class PreviewOppoFindX7Ultra

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OPPO Reno 10 5G",
    group = "OPPO",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
annotation class PreviewOppoReno105g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OPPO Reno 8 Pro",
    group = "OPPO",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
annotation class PreviewOppoReno8Pro

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "OPPO Reno 9 5G",
    group = "OPPO",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
annotation class PreviewOppoReno95g

