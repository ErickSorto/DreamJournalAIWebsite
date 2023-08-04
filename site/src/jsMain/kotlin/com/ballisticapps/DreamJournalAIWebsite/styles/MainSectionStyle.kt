package com.ballisticapps.DreamJournalAIWebsite.styles

import com.ballisticapps.DreamJournalAIWebsite.models.Theme
import com.ballisticapps.DreamJournalAIWebsite.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.anyLink
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.unaryMinus

@OptIn(ExperimentalComposeWebApi::class)
val NavigationItemStyle by ComponentStyle {
    base {
        Modifier
            .color(Theme.Secondary.rgb)
            .transform { scale(1.0) }
            .transition(CSSTransition(property = "color", duration = 200.ms))
            .transition(CSSTransition(property = "transform", duration = 200.ms))
    }
    anyLink {
        Modifier
            .color(Theme.Secondary.rgb)
    }
    hover {
        Modifier
            .color(Theme.Primary.rgb)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val LogoStyle by ComponentStyle {
    base {
        Modifier
            .transform { scale(1.0) }
            .transition(CSSTransition(property = "transform", duration = 200.ms))
    }
    hover {
        Modifier
            .transform { scale(1.2) }
    }
}

val PrivacyPolicyHeaderStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(FONT_FAMILY)
            .fontSize(28.px)
            .fontWeight(FontWeight.Bold)
            .color(Theme.Primary.rgb)
    }
    hover {
        Modifier
            .color(Theme.Secondary.rgb)
    }
}

val SectionTitleStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(FONT_FAMILY)
            .fontSize(32.px)
            .fontWeight(FontWeight.Bold)
            .color(Theme.Primary.rgb)
            .padding(bottom = 16.px)
    }
    hover {
        Modifier
            .color(Theme.Secondary.rgb)
    }
}

val PrivacyPolicyDescriptionStyle by ComponentStyle {
    base {
        Modifier
            .margin(top = (-25).px) // Added top padding
            .margin(bottom = 25.px)
            .maxWidth(500.px)
            .fontFamily(FONT_FAMILY)
            .fontSize(18.px)
            .fontWeight(FontWeight.Normal)
            .fontStyle(FontStyle.Normal)
            .color(Theme.Secondary.rgb)
    }
}

val QuoteStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(FONT_FAMILY)
            .fontWeight(FontWeight.Bold)
            .color(Theme.Primary.rgb)
            .padding(left = 20.px)
            .margin(topBottom = (0).px)
    }
}

val SubQuoteStyle by ComponentStyle {
    base {
        Modifier
            .padding(left = 20.px) // Added left padding
            .maxWidth(500.px)
            .fontFamily(FONT_FAMILY)
            .fontWeight(FontWeight.Normal)
            .fontStyle(FontStyle.Italic)
            .color(Theme.Secondary.rgb)
    }
}
