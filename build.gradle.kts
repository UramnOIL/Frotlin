
plugins {
    kotlin("jvm") version "1.3.61"
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        url = uri("https://repo.nukkitx.com/snapshot/")
    }
}

repositories {
    jcenter()
    maven {
        url = uri("https://repo.nukkitx.com/main/")
    }
}

configurations {
    implementation.get().extendsFrom(shadow.get())
}

dependencies {
    shadow(kotlin("stdlib"))
    compileOnly("cn.nukkit:nukkit:1.0-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}