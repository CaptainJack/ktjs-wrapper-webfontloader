@file:Suppress("UnsafeCastFromDynamic")

package ru.capjack.ktjs.wrapper.webfontloader

inline fun WebFont.load(init: WebFontConfig.() -> Unit) {
	WebFont.load(jst(init))
}

inline fun WebFontConfig.custom(init: WebFontConfig.Custom.() -> Unit) {
	custom = jst(init)
}

inline fun WebFontConfig.Custom.families(vararg values: String) {
	families = values.asDynamic()
}

inline fun <T : Any> jst(init: T.() -> Unit): T {
	val o: T = js("{}")
	o.init()
	return o
}