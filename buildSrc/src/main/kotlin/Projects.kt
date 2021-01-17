import org.gradle.api.Project

internal fun Project.version(target: String): String =
    prop("${target}.version")
