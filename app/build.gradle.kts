import de.fayard.refreshVersions.core.versionFor

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    namespace = "top.sokeriaaa.assembleexample"
    compileSdk = 33

    defaultConfig {
        applicationId = "top.sokeriaaa.assembleexample"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "0.1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.compiler)
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":material2"))
    implementation(project(":material3"))
    // =====================================================
    // Android
    // =====================================================
    implementation(AndroidX.activity.compose)
    implementation(AndroidX.activity.ktx)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.core.ktx)

    // =====================================================
    // Compose
    // =====================================================
    implementation(platform(AndroidX.compose.bom))
    implementation(AndroidX.compose.ui)
    // Tooling support (Previews, etc.)
    implementation(AndroidX.compose.ui.tooling)
    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation(AndroidX.compose.foundation)
    // Integration with observables
    implementation(AndroidX.compose.runtime.liveData)
    implementation(AndroidX.compose.runtime.rxJava3)
    implementation(AndroidX.compose.ui)
    // Material
    implementation(AndroidX.compose.material)
    implementation(AndroidX.compose.material3)

    androidTestImplementation(AndroidX.compose.ui.testJunit4)
    testImplementation(Testing.junit4)
    androidTestImplementation(AndroidX.test.ext.junit.ktx)
    androidTestImplementation(AndroidX.test.espresso.core)
}