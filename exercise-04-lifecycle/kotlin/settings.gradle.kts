/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/5.4.1/userguide/multi_project_builds.html
 */

rootProject.name = "gradle-workshop"

//1.
println("Gradle Workshop: settings.gradle.kts : This is also initialization phase!")

// Script Object: https://docs.gradle.org/current/dsl/org.gradle.api.Script.html
logger.lifecycle("Current dir: ${file(".").path}")

// we have access to project file tree at this point
fileTree(".") {
    files.filter { it.path.contains(".") }.forEach { file ->
        logger.lifecycle("- ${file.path}")
    }
}

// we can perform file operations
mkdir(".aem")
mkdir(".gap")

delete(".aem", ".gap")

// Settings Object: https://docs.gradle.org/current/dsl/org.gradle.api.initialization.Settings.html

logger.lifecycle("Root dir: $rootDir")
logger.lifecycle("Settings: $settingsDir")

// plus configuration of projects which we will cover in multiproject builds: include(projectPaths), etc.
//include("bluewhale", "krill", "tropicalFish")

// accessing properties: https://kotlinlang.org/docs/reference/delegated-properties.html

val property: String by settings
logger.lifecycle("Property value: $property")
