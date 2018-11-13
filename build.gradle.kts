import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import ru.capjack.degos.publish.DegosPublishExtension
import java.net.URL

group = "ru.capjack.ktjs"

plugins {
	id("kotlin2js") version "1.2.61"
	id("ru.capjack.degos.publish") version "1.7.0"
	id("nebula.release") version "6.3.5"
}

repositories {
	maven("http://artifactory.capjack.ru/public")
}

dependencies {
	implementation(kotlin("stdlib-js"))
}

degosPublish {
	publicationSources = DegosPublishExtension.PublicationSource.ALWAYS
}

tasks.withType<Kotlin2JsCompile> {
	kotlinOptions {
		moduleKind = "amd"
		sourceMap = true
		sourceMapEmbedSources = "always"
	}
}