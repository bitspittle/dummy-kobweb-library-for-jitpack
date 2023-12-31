import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.library)
    id("maven-publish")
}

group = "org.example.dummykobweblibraryforjitpack"
version = "0.5"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
    maven("https://us-central1-maven.pkg.dev/varabyte-repos/public")
}

kotlin {
    configAsKobwebLibrary()

    @Suppress("UNUSED_VARIABLE") // Suppress spurious warnings about sourceset variables not being used
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
                implementation(npm("is-sorted", "1.0.5"))
                implementation(npm("bootstrap", "5.3.1"))
            }
        }

        val jsTest by getting {
            dependencies {
                implementation("com.varabyte.truthish:truthish:0.6.5")
                implementation(kotlin("test-js"))
            }
        }
    }
}
