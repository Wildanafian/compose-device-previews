package com.wildanafian.compose.previews.devices

import androidx.compose.ui.tooling.preview.Preview

/**
 * Pre-configured Jetpack Compose [Preview] annotations for Realme devices (6 devices).
 */

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Realme GT 5 Pro",
    group = "Realme",
    device = "spec:width=1264px,height=2780px,dpi=480",
    showBackground = true
)
annotation class PreviewRealmeGt5Pro

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Realme GT 6T",
    group = "Realme",
    device = "spec:width=1264px,height=2780px,dpi=450",
    showBackground = true
)
annotation class PreviewRealmeGt6t

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Realme 10",
    group = "Realme",
    device = "spec:width=1080px,height=2400px,dpi=411",
    showBackground = true
)
annotation class PreviewRealme10

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Realme 11 Pro+",
    group = "Realme",
    device = "spec:width=1080px,height=2412px,dpi=394",
    showBackground = true
)
annotation class PreviewRealme11Pro

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Realme C55",
    group = "Realme",
    device = "spec:width=1080px,height=2400px,dpi=392",
    showBackground = true
)
annotation class PreviewRealmeC55

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Realme Narzo 60",
    group = "Realme",
    device = "spec:width=1080px,height=2400px,dpi=411",
    showBackground = true
)
annotation class PreviewRealmeNarzo60

