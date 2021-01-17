import org.gradle.api.Project
import org.gradle.kotlin.dsl.the
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependency
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

fun Project.npmv(name: String): NpmDependency {
    val npm = dependencies.the<NpmDependencyExtension>()
    return npm(name, "^${version(name)}")
}
