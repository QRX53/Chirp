plugins {
    id("java")
}

group = "org.acmanager"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.antlr:antlr4:4.13.1")
}

tasks.test {
    useJUnitPlatform()
}