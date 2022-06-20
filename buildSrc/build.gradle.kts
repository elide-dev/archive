val kotlinVersion = "1.7.0"
val micronautPluginVersion = "3.4.1"
val atomicFuPluginVersion = "0.18.0"

plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
  implementation("org.jetbrains.kotlinx:atomicfu-gradle-plugin:$atomicFuPluginVersion")
  implementation("io.micronaut.gradle:micronaut-gradle-plugin:$micronautPluginVersion")
}
