import com.diffplug.gradle.spotless.SpotlessExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath(plugin.Spotless())
    }
}

plugins {
    kotlin("multiplatform") version "1.4.30"
    kotlin("plugin.serialization") version "1.4.30"
    id("maven-publish")
    id("signing")
}

apply(plugin = "com.diffplug.spotless")

repositories {
    mavenCentral()
    google()
}

version = Library.version
group = Library.group

kotlin {
    explicitApi()
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        testRuns["test"].executionTask.configure {
            useJUnit()
        }
    }

    sourceSets {
        all {
            languageSettings.progressiveMode = true
        }
        val commonMain by getting {
            kotlin.srcDirs("$buildDir/generated/sources/templates/kotlin/main")
            dependencies {
                api(Ktor("client"))
                api(Ktor("client-json"))
                api(Ktor("client-logging"))
                api(Ktor("client-serialization"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation(Ktor("client"))
                implementation(Ktor("client-mock"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
                implementation(Ktor("client-okhttp"))
                implementation(Ktor("client-apache"))
                implementation(Ktor("client-android"))
            }
        }
    }
}

tasks {

    withType<KotlinCompile<*>>().configureEach {
        dependsOn("copyTemplates")
        kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
    }

    register(name = "copyTemplates", type = Copy::class) {
        from("src/commonMain/templates")
        into("$buildDir/generated/sources/templates/kotlin/main")
        expand("projectVersion" to Library.version)
        filteringCharset = "UTF-8"
    }

    withType<Test> {
        maxParallelForks = Runtime.getRuntime().availableProcessors().minus(1).coerceAtLeast(1)
    }
}

configure<SpotlessExtension> {
    kotlin {
        target("**/*.kt")
        ktlint("0.40.0")
        trimTrailingWhitespace()
        endWithNewline()
    }
}

//** Publish **//
val emptyJar by tasks.creating(Jar::class) {
    archiveAppendix.set("empty")
}

publishing {
    repositories {
        maven {
            name = "MavenCentral"
            url = uri("https://oss.sonatype.org/service/local/staging/deploy/maven2")
            credentials {
                username = System.getenv("SONATYPE_USER")
                password = System.getenv("SONATYPE_KEY")
            }
        }
    }

    publications.withType<MavenPublication>().all {
        groupId = Library.group
        version = Library.version
        artifactId = when (name) {
            "kotlinMultiplatform" -> Library.artifact
            else -> "${Library.artifact}-$name"
        }

        artifact(emptyJar) { classifier = "javadoc" }

        pom.withXml {
            asNode().apply {
                appendNode("name", "Algolia Search API Client for Kotlin")
                appendNode("description",
                    "Algolia is a powerful search-as-a-service solution, made easy to use with API clients, UI libraries," +
                        "and pre-built integrations. Algolia API Client for Kotlin lets you easily use the Algolia Search" +
                        "REST API from your JVM project, such as Android or backend implementations.")
                appendNode("url", "https://github.com/algolia/algoliasearch-client-kotlin")
                appendNode("licenses")
                    .appendNode("license").apply {
                        appendNode("name", "MIT")
                        appendNode("url", "http://www.opensource.org/licenses/mit-license.php")
                        appendNode("distribution", "repo")
                    }
                appendNode("developers")
                    .appendNode("developer").apply {
                        appendNode("id", "algolia")
                        appendNode("name", "The Algolia Team")
                        appendNode("email", "hey@algolia.com")
                        appendNode("organization", "Algolia")
                        appendNode("organizationUrl", "https://algolia.com")
                    }
                appendNode("scm").apply {
                    appendNode("url", "https://github.com/algolia/algoliasearch-client-kotlin")
                    appendNode("connection", "scm:git:git://github.com/algolia/algoliasearch-client-kotlin.git")
                    appendNode("developerConnection",
                        "scm:git:ssh://github.com:algolia/algoliasearch-client-kotlin.git")
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("SIGNING_KEY_ID")
    val signingKey = System.getenv("SIGNING_KEY")
    val signingPassword = System.getenv("SIGNING_PASSWORD")
    useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
    sign(publishing.publications)
}
