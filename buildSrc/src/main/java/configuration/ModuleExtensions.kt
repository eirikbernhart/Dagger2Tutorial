package configuration

import Constants
import com.android.build.gradle.BaseExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.JavaVersion

fun BaseAppModuleExtension.setAppConfig() {
    compileSdkVersion(Config.compileSdkVersion)
    buildToolsVersion(Config.buildTools)

    defaultConfig {
        dataBinding { isEnabled = true }

        minSdkVersion(Config.minSdk)
        targetSdkVersion(Config.targetSdkVersion)
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
        javaCompileOptions {
            annotationProcessorOptions.includeCompileClasspath = true
        }

        applicationId = Config.applicationId
        versionCode = Config.versionCode
        versionName = Config.versionName
        testInstrumentationRunner = Config.testInstrumentationRunner
    }
}

fun BaseExtension.setBuildTypeConfig() = buildTypes {
    named("debug") {
        signingConfig = signingConfigs.getByName("config_debug")

        buildConfigBoolean(Constants.REPORT_FIREBASE_CRASHLYTICS, false)
        buildConfigBoolean(Constants.REPORT_INSTABUG, false)
        buildConfigString(Constants.INSTABUG_API_TOKEN, "5bc9d1411bfcaffe7ad466c33e87ce1e")
        buildConfigBoolean(Constants.REPORT_FIREBASE_ANALYTICS, false)

        buildConfigString(Constants.BASE_URL_ID_API, "https://api.id-test.fagforbundet.no/")
        buildConfigString(Constants.BASE_URL_PROXY_API, "https://proxy-api-test.fagforbundet.no/")

        applicationIdSuffix = ".debug"

        manifestPlaceholders["iconPath"] = "@mipmap/ic_launcher_dev"
        manifestPlaceholders["roundIconPath"] = "@mipmap/ic_launcher_dev_round"
    }

    create("staging") {
        signingConfig = signingConfigs.getByName("config_staging")

        isDebuggable = true

        buildConfigBoolean(Constants.REPORT_FIREBASE_CRASHLYTICS, true)
        buildConfigBoolean(Constants.REPORT_INSTABUG, true)
        buildConfigString(Constants.INSTABUG_API_TOKEN, "5bc9d1411bfcaffe7ad466c33e87ce1e")
        buildConfigBoolean(Constants.REPORT_FIREBASE_ANALYTICS, true)

        buildConfigString(Constants.BASE_URL_ID_API, "https://api.id-test.fagforbundet.no/")
        buildConfigString(Constants.BASE_URL_PROXY_API, "https://proxy-api-test.fagforbundet.no/")

        applicationIdSuffix = ".staging"

        manifestPlaceholders["iconPath"] = "@mipmap/ic_launcher_staging"
        manifestPlaceholders["roundIconPath"] = "@mipmap/ic_launcher_staging_round"
    }

    named("release") {
        signingConfig = signingConfigs.getByName("config_release")

        buildConfigBoolean(Constants.REPORT_FIREBASE_CRASHLYTICS, true)
        buildConfigBoolean(Constants.REPORT_INSTABUG, true)
        buildConfigString(Constants.INSTABUG_API_TOKEN, "5bc9d1411bfcaffe7ad466c33e87ce1e")
        buildConfigBoolean(Constants.REPORT_FIREBASE_ANALYTICS, true)

        buildConfigString(Constants.BASE_URL_ID_API, "https://api.id.fagforbundet.no/")
        buildConfigString(Constants.BASE_URL_PROXY_API, "https://api.proxy.fagforbundet.no/")

        manifestPlaceholders["iconPath"] = "@mipmap/ic_launcher_default"
        manifestPlaceholders["roundIconPath"] = "@mipmap/ic_launcher_default_round"

        isMinifyEnabled = true
        isShrinkResources = true
        proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
}
