plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    // SwiftUI 를 사용하는 경우에만 필요함
    // id("co.touchlab.skie") version "0.4.19"
    kotlin("plugin.serialization") version "1.9.20"
    alias(libs.plugins.sqlDelight)
    alias(libs.plugins.composeMultiplatformPlugin)
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
    
    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
                implementation(libs.kotlinx.coroutines.core)
                implementation(libs.ktor.client.core)
                implementation(libs.ktor.client.content.negotiation)
                implementation(libs.ktor.serialization.kotlinx.json)
                implementation(libs.kotlinx.datetime)
                implementation(libs.koin.core)
                implementation(libs.sql.coroutines.extensions)

                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.components.resources)
                implementation(compose.material3)
                implementation(libs.compose.material)
                implementation(libs.koin.compose)
                implementation(libs.kamel.image)
                implementation(libs.voyager.navigator)
                implementation(libs.voyager.transitions)
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.androidx.lifecycle.viewmodel.ktx)
                implementation(libs.ktor.client.android)
                implementation(libs.sql.android.driver)
            }
        }

        val iosMain by getting {
            dependencies {
                implementation(libs.ktor.client.darwin)
                implementation(libs.sql.native.driver)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(libs.kotlin.test)
            }
        }
    }
}

android {
    namespace = "com.easyhooon.dailypulse"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}

sqldelight {
    databases {
        create(name = "DailyPulseDatabase") {
            packageName.set("easyhooon.dailypulse.db")
        }
    }
}