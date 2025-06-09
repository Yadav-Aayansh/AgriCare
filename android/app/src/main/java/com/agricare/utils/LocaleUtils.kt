package com.agricare.utils

import android.content.Context
import java.util.*

fun setLocale(context: Context, langCode: String): Context {
    val locale = Locale(langCode)
    Locale.setDefault(locale)
    val config = context.resources.configuration
    config.setLocale(locale)
    return context.createConfigurationContext(config)
}
