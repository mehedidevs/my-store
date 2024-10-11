plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.kotlin.serialization)

}

android {
    namespace = "com.mehedi.mystore"
    compileSdk = 34
    
    defaultConfig {
        applicationId = "com.mehedi.mystore"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // AndroidX Libraries
    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.lifecycle.viewmodel)
    implementation("com.google.android.material:material:1.9.0")
    // Compose
/*    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling)
    implementation(libs.androidx.compose.foundation)
    implementation(libs.androidx.compose.material)*/
    
    // Networking: Retrofit, OkHttp, Moshi
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.moshi)
    implementation(libs.okhttp.core)
    implementation(libs.okhttp.logging)
    implementation(libs.moshi.core)
    implementation(libs.moshi.kotlin)
    
    // Coroutines
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)
    
    // Hilt for Dependency Injection
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
    
    // Epoxy for UI components
    implementation(libs.epoxy.core)
    kapt(libs.epoxy.processor)
  //  implementation(libs.epoxy.composable)
    
    // Room for database
    implementation(libs.room.runtime)
    kapt(libs.room.compiler)
    implementation(libs.room.ktx)
    
    // Image loading: Glide and Coil
    implementation(libs.glide)
    kapt(libs.glide.compiler)
    implementation(libs.coil)
   // implementation(libs.coil.compose)
    
    // Timber for logging
    implementation(libs.timber)
    
    // Testing libraries
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.junit)
    androidTestImplementation(libs.androidx.test.espresso)
    testImplementation(libs.mockk)
    
    // Kotlin Serialization
    implementation(libs.kotlinx.serialization.json)
    
    // DataStore Preferences
    implementation(libs.datastore.preferences)
    
    // Navigation Component
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    
    // WorkManager
    implementation(libs.workmanager)
}
