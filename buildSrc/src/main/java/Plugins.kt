import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.androidApp(): PluginDependencySpec = id("com.android.application")

fun PluginDependenciesSpec.androidLibrary(): PluginDependencySpec = id("com.android.library")


fun PluginDependenciesSpec.kotlinAndroid(): PluginDependencySpec = kotlin("android")

fun PluginDependenciesSpec.kotlinAndroidExt(): PluginDependencySpec = kotlin("android.extensions")

// fun PluginDependenciesSpec.kotlinAndroidPlugin(): PluginDependencySpec = kotlin("kotlin-android") // NOT FOUND

fun PluginDependenciesSpec.kapt(): PluginDependencySpec = kotlin("kapt")

fun PluginDependenciesSpec.kotlinKapt(): PluginDependencySpec = id("kotlin-kapt")

const val versions = "com.github.ben-manes.versions"

fun PluginDependenciesSpec.firebaseCrashlytics(): PluginDependencySpec = id("com.google.firebase.crashlytics")

fun PluginDependenciesSpec.safeargs(): PluginDependencySpec = id("androidx.navigation.safeargs")

fun PluginDependenciesSpec.gms(): PluginDependencySpec = id("com.google.gms.google-services")

fun PluginDependenciesSpec.dokka(): PluginDependencySpec = id("org.jetbrains.dokka")

fun PluginDependenciesSpec.unmock(): PluginDependencySpec = id("de.mobilej.unmock")

fun PluginDependenciesSpec.allOpen(): PluginDependencySpec = id("kotlin-allopen")

object Classpath {
    const val androidGradle = "com.android.tools.build:gradle:3.6.3"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val navigationSafeArgs = "android.arch.navigation:navigation-safe-args-gradle-plugin:1.0.0"
    const val gms = "com.google.gms:google-services:4.3.3"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.1.0"
    const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:0.10.0"
    const val unmock = "de.mobilej.unmock:UnMockPlugin:0.7.3"
    const val allOpen = "org.jetbrains.kotlin:kotlin-allopen:1.3.72"
}
