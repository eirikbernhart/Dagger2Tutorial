import configuration.setAppConfig

plugins {
    androidApp()
    kotlinAndroid()
    kotlinKapt()
}

android {
    setAppConfig()

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
    implementation ("androidx.core:core-ktx:1.1.0")

    // KOTLIN
    implementation(Libraries.Kotlin.stdLib)
    implementation(Libraries.Kotlin.anko)

    // GOOGLE
    implementation(Libraries.Google.material)

    // DAGGER2
    api(Libraries.Dagger2.dagger2)
    annotationProcessor(Libraries.Dagger2.dagger2AnnotationProcessor)
    api(Libraries.Dagger2.dagger2Android)
    api(Libraries.Dagger2.dagger2AndroidSupport)
    annotationProcessor(Libraries.Dagger2.dagger2AndroidAnnotationProcessor)

    // ANDROIDX
    implementation(Libraries.AndroidX.appCompat)
    implementation(Libraries.AndroidX.fragmentAndroidX)
    implementation(Libraries.AndroidX.recyclerView)
    implementation(Libraries.AndroidX.legacySupport)
    implementation(Libraries.AndroidX.constraintLayout)
    implementation(Libraries.AndroidX.ktxCore)
    implementation(Libraries.AndroidX.lifeCycleExtensions)
    implementation(Libraries.AndroidX.viewmodel)
    implementation(Libraries.AndroidX.preferences)
    implementation(Libraries.AndroidX.multidex)
    implementation(Libraries.AndroidX.navigationFragmentKtx)
    implementation(Libraries.AndroidX.navigationUiKtx)

    // RX
    api(Libraries.Rx.android)
    api(Libraries.Rx.java)

    // TESTING
    testImplementation(Libraries.Test.junit)
    testImplementation(Libraries.Test.mockitoCore)
    testImplementation(Libraries.Test.mockitoInline)
    testImplementation(Libraries.Test.mockitokotlin)
    testImplementation(Libraries.AndroidX.Test.coreTesting)
    androidTestImplementation(Libraries.AndroidX.Test.runner)
    androidTestImplementation(Libraries.AndroidX.Test.espresso)

    // OTHER
    api(Libraries.Other.timber)

    kapt("com.google.dagger:dagger-compiler:2.28.3")
}
