plugins {
    kotlin("jvm") version "1.3.20"
    id("org.jetbrains.intellij") version "0.4.2"
    id("java")
}

group = "de.halirutan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

intellij {
    version = "2018.3.3"
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    patchPluginXml {
        changeNotes("")
    }
}