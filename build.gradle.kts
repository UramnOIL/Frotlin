plugins {
    kotlin("jvm") version "1.3.61"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "com.uramnoil"
version = "0.1.5"

subprojects {
    repositories {
        jcenter()
        maven {
            url = uri("https://repo.nukkitx.com/main/")
        }
    }
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}