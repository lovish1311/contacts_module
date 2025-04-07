plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.contacts_module"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.contacts_module"
        minSdk = 25
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0" // Replace with the latest stable version
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // Jetpack Compose BOM (recommended to simplify dependencies management

    // Compose Material
    implementation(libs.androidx.material.v143)

    // Compose Material3
    implementation(libs.androidx.material3)
    //noinspection GradleDependency
    implementation(libs.androidx.foundation)

    // Compose UI
    implementation(libs.androidx.ui.v143)
    implementation(libs.androidx.ui.tooling.preview.v143)
    debugImplementation(libs.androidx.ui.tooling.v143)

    // ConstraintLayout for Compose
    implementation(libs.androidx.constraintlayout.compose.v101)

    // ViewModel Compose Integration
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // Compose runtime and live data support
    implementation(libs.androidx.runtime.livedata)

    // Additional Jetpack Compose dependencies
    implementation(libs.androidx.activity.compose.v172)

    // Coil (optional for Image loading)
    implementation(libs.coil.compose)

    // Compose Icons (if needed)
    implementation(libs.androidx.material.icons.core)
    implementation(libs.androidx.material.icons.extended)

    // AndroidX Core and AppCompat
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)

    // Material Design Components
    implementation(libs.material)

    // Lifecycle Runtime
    implementation(libs.androidx.lifecycle.runtime.ktx)

    // Unit Testing
    testImplementation(libs.junit)

    // Android Instrumentation Testing
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.ui.test.junit4)

    // Debugging tools
    debugImplementation(libs.androidx.ui.tooling.v143)
}
