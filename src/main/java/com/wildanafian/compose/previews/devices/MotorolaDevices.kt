package com.wildanafian.compose.previews.devices

import androidx.compose.ui.tooling.preview.Preview

/**
 * Pre-configured Jetpack Compose [Preview] annotations for Motorola devices (8 devices).
 */

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Edge 30 Fusion",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=402",
    showBackground = true
)
annotation class PreviewMotorolaEdge30Fusion

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Edge 40 Neo",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=402",
    showBackground = true
)
annotation class PreviewMotorolaEdge40Neo

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Edge 40",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=420",
    showBackground = true
)
annotation class PreviewMotorolaEdge40

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Edge 50 Fusion",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=393",
    showBackground = true
)
annotation class PreviewMotorolaEdge50Fusion

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Moto G54 5G",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=405",
    showBackground = true
)
annotation class PreviewMotorolaMotoG545g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Moto G64 5G",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=405",
    showBackground = true
)
annotation class PreviewMotorolaMotoG645g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Moto G84 5G",
    group = "Motorola",
    device = "spec:width=1080px,height=2400px,dpi=405",
    showBackground = true
)
annotation class PreviewMotorolaMotoG845g

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@Preview(
    name = "Motorola Moto G (5S) Plus",
    group = "Motorola",
    device = "spec:width=1080px,height=1920px,dpi=480",
    showBackground = true
)
annotation class PreviewMotorolaMotoG5sPlus

