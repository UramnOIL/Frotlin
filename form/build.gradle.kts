plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
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