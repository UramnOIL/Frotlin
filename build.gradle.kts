plugins {
    kotlin("jvm") version "1.3.61"
    id("com.github.johnrengelman.shadow") version "5.2.0"
    id("net.minecrell.plugin-yml.nukkit") version "0.3.0"
}

group = "com.uramnoil"
version = "0.1.5"

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    archiveVersion.set("")
}

repositories {
    jcenter()
    maven {
        url = uri("https://repo.nukkitx.com/main/")
    }
}

dependencies {
    compileOnly(kotlin("stdlib"))
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
    main = "com.uramnoil.ktform.KtFormPlugin"
    api = listOf("1.0.9")
    author = "UramnOIL"
    depend = listOf("Kotlib")
}