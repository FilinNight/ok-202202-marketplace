plugins {
    kotlin("jvm") version "1.5.10"
}

group = "kotlin.marketplace"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test-junit"))
}