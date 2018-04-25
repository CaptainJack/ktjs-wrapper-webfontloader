import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import ru.capjack.degos.publish.DegosPublishExtension
import java.net.URL

group = "ru.capjack.ktjs"

plugins {
	id("kotlin2js") version "1.2.40"
	id("ru.capjack.degos-publish") version "1.4.0"
	id("nebula.release") version "6.0.0"
}

repositories {
	maven("http://artifactory.capjack.ru/public")
}

dependencies {
	implementation("ru.capjack.ktjs:ktjs-common:0.1.0-SNAPSHOT")
}

tasks.withType<Kotlin2JsCompile> {
	kotlinOptions {
		moduleKind = "amd"
	}
}