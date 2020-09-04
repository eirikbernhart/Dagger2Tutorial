plugins {
    `kotlin-dsl`
}

val kotlinVersion = "1.3.72"

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:4.0.1")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
}
