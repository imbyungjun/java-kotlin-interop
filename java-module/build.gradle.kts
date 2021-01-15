plugins {
    java
}

group = "me.imb"
version = "1.0-SNAPSHOT"
description = "java-module"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.test {
    testLogging {
        showStandardStreams = true
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":kotlin-module"))
    implementation("com.squareup.okhttp3", "okhttp", "4.9.0")

    testImplementation("junit", "junit", "4.12")
}
