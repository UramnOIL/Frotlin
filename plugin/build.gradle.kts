plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow")
    id("net.minecrell.plugin-yml.nukkit") version "0.3.0"
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly(project(":form"))
    compileOnly("cn.nukkit", "nukkit", "1.0-SNAPSHOT")
}

nukkit {
    main = "com.uramnoil.ktform.KtFormPlugin"
    api = listOf("1.0.9")
    author = "UramnOIL"
}