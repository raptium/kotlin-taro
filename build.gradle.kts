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

val taroVersion = "3.0.23"
var reactVersion = "16.10.0"

kotlin {
    js {
        browser()
    }
}

dependencies {
    api(kotlin("stdlib-js"))
    api("org.jetbrains:kotlin-react:16.13.1-pre.105-kotlin-1.3.72")
    api("org.jetbrains:kotlin-react-dom:16.13.1-pre.105-kotlin-1.3.72")

    api(npmv("@tarojs/taro"))
    api(npm("@tarojs/components", taroVersion))
    api(npm("@tarojs/runtime", taroVersion))
    api(npm("@tarojs/react", taroVersion))
    api(npm("react", reactVersion))
    api(npm("react-dom", reactVersion))

    // test
    testImplementation(kotlin("test-js"))
}

