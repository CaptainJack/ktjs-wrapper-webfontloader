package ru.capjack.ktjs.wrapper.webfontloader

import org.w3c.dom.Window

external interface WebFontConfig {
	var custom: Custom?
	var fontdeck: Fontdeck?
	var google: Google?
	var typekit: Typekit?
	
	var classes: Boolean?
	var events: Boolean?
	var timeout: Int?
	var context: Window
	
	var loading: (() -> Unit)?
	var active: (() -> Unit)?
	var inactive: (() -> Unit)?
	var fontloading: ((familyName: String, fvd: String) -> Unit)?
	var fontactive: ((familyName: String, fvd: String) -> Unit)?
	var fontinactive: ((familyName: String, fvd: String) -> Unit)?
	
	interface Custom {
		var families: Array<String>?
		var urls: Array<String>?
		var testStrings: dynamic
	}
	
	interface Fontdeck {
		var id: String?
	}
	
	interface Google {
		var families: Array<String>?
		var text: String?
	}
	
	interface Typekit {
		var id: String?
		var api: String?
	}
}