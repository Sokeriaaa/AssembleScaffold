import de.fayard.refreshVersions.core.versionFor

plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "top.sokeriaaa.assemblescaffold.material2"
    compileSdk = 33

    defaultConfig {
        minSdk = 21
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = versionFor(AndroidX.compose.compiler)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // =====================================================
    // Android
    // =====================================================
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
    // Material Design
    implementation(AndroidX.compose.material)

    androidTestImplementation(AndroidX.compose.ui.testJunit4)
    testImplementation(Testing.junit4)
    androidTestImplementation(AndroidX.test.ext.junit.ktx)
    androidTestImplementation(AndroidX.test.espresso.core)
}