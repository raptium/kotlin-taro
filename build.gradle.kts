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

val kotlinWrapperVersion = "16.13.1-pre.124-kotlin-1.4.10"

kotlin {
    js {
        nodejs()
        useCommonJs()
    }
}

dependencies {
    api(kotlin("stdlib-js"))
    api("org.jetbrains:kotlin-react:$kotlinWrapperVersion")
    api("org.jetbrains:kotlin-css:1.0.0-pre.138-kotlin-1.4.21")

    compileOnly(npmv("@tarojs/taro"))
    compileOnly(npmv("@tarojs/components"))
    compileOnly(npmv("@tarojs/runtime"))
    compileOnly(npmv("@tarojs/react"))
    compileOnly(npmv("react"))
}

