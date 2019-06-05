/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */

plugins { // we cannon execute any code in plugins section, it is only declaration of plugins
    id("application") // https://docs.gradle.org/current/userguide/application_plugin.html
}

// ./gradlew tasks

// ./gradlew run

// defining java libraries repository so we can solve our repo
repositories { // project script block used by java plugin
    mavenCentral()
}

// defining needed dependencies
dependencies { // project script block used by java plugin
    implementation("org.apache.commons:commons-math3:3.6.1")
}

// plugin DSL - configuration
application {
    mainClassName = "workshop.Main"
}
