package ru.capjack.ktjs.wrapper.webfontloader

@JsModule("ktjs-wrapper-webfontloader/webfontloader")
external object WebFont {
	fun load(configuration: WebFontConfig)
}
