package com.ballisticapps.DreamJournalAIWebsite.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb

enum class Theme(val hex: String, val rgb: CSSColorValue) {
    Primary("#00A78E", rgb = rgb(r = 0, g = 167, b = 142)),
    Secondary("#FFFFFF", rgb = rgb(r = 255, g = 255, b = 255)),
    Gray("#E8E8E8", rgb = rgb(r = 232, g = 232, b = 232)),
    LightGray("#F8F8F8", rgb = rgb(r = 248, g = 248, b = 248)),
    LighterGray("#F0F0F0", rgb = rgb(r = 240, g = 240, b = 240)),
    DarkBlue("#101925", rgb = rgb(r = 16, g = 25, b = 37))
}
