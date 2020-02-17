plugins {
    kotlin("jvm") version "1.3.61"
    id("com.github.johnrengelman.shadow") version "5.2.0"
    id("net.minecrell.plugin-yml.nukkit") version "0.3.0"
}

group = "com.github.uramnoil"
version = "1.0-SNAPSHOT"

val GITHUB_TOKEN = "8ed6425507b387044c8d2d42b8c140fe00084382"
val GITHUB_USER = "UramnOIL"

defaultTasks("shadowJar")

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

dependencies {
    shadow(kotlin("stdlib"))
    compileOnly("cn.nukkit", "nukkit", "1.0-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

nukkit {
    main = "com.github.uramnoil.ktform.KtFormPlugin"
    api = listOf("1.0.9")
    authors = listOf("UramnOIL")
}