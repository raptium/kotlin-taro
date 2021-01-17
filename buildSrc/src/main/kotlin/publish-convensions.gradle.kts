plugins {
    `maven-publish`
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("kotlin") {
                from(components["kotlin"])
                groupId = project.group.toString()
                artifactId = project.name
                version = version
                artifact(tasks.getByName<Zip>("jsSourcesJar"))
            }
        }
    }
}
