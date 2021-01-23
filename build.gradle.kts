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

    compileOnly(npm("@tarojs/taro", version("taro")))
    compileOnly(npm("@tarojs/components", version("taro")))
    compileOnly(npm("@tarojs/runtime", version("taro")))
    compileOnly(npm("@tarojs/react", version("taro")))
    compileOnly(npmv("react"))
}
