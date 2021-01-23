plugins {
    `maven-publish`
}

val publishVersion = version("taro") + "-" + project.version

afterEvaluate {
    publishing {
        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/raptium/kotlin-taro")
                credentials {
                    username = System.getenv("GITHUB_ACTOR")
                    password = System.getenv("GITHUB_TOKEN")
                }
            }
        }
        publications {
            create<MavenPublication>("kotlin") {
                from(components["kotlin"])
                groupId = project.group.toString()
                artifactId = project.name
                version = publishVersion
                artifact(tasks.getByName<Zip>("jsLegacySourcesJar"))
            }
        }
    }
}
