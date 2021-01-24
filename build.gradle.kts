plugins {
    kotlin("js")
    `publish-convensions`
}

group = "me.hguan"
version = "1.0.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    js {
        nodejs()
        useCommonJs()
    }
}

dependencies {
    api(kotlin("stdlib-js"))
    api("org.jetbrains:kotlin-react:${version("kotlin-react")}")
    api("org.jetbrains:kotlin-css:${version("kotlin-css")}")
}
