package com.ballisticapps.DreamJournalAIWebsite.sections

import androidx.compose.runtime.Composable
import com.ballisticapps.DreamJournalAIWebsite.models.Section
import com.ballisticapps.DreamJournalAIWebsite.styles.LogoStyle
import com.ballisticapps.DreamJournalAIWebsite.styles.NavigationItemStyle
import com.ballisticapps.DreamJournalAIWebsite.styles.QuoteStyle
import com.ballisticapps.DreamJournalAIWebsite.styles.SubQuoteStyle
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainSection() {
    MainSectionContent()
    Column(
        modifier = Modifier
            .id(Section.Home.id)
            .maxWidth(1920.px)
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .padding(10.px)
                .fillMaxWidth(),
            contentAlignment = Alignment.TopStart
        ) {
            LogoSection()
        }
        Spacer()
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.CenterStart
        ) {
            QuoteSection(
                quote = "Dream analysis made easy",
                subQuote = "Dream Journal AI is a free, open-source, and privacy-focused dream journal app that uses AI to help you understand your dreams."
            )
        }
        Spacer()
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomEnd
        ) {
            PrivatePolicyLink()
        }
    }
}


@Composable
fun QuoteSection(quote: String, subQuote: String) {
    val breakpoint = rememberBreakpoint()
    Column(
    ) {
        P(attrs = QuoteStyle.toModifier().maxWidth(
            if (breakpoint >= Breakpoint.MD) 100.percent
            else 90.percent
        ).fontSize(
            if (breakpoint >= Breakpoint.MD) 40.px
            else 24.px
        ).toAttrs()
        ) {
            Text(quote)
        }
        P(attrs = SubQuoteStyle.toModifier().maxWidth(
            if (breakpoint >= Breakpoint.MD) 60.percent
            else 80.percent
        ).fontSize(
            if (breakpoint >= Breakpoint.MD) 26.px
            else 16.px
        ).toAttrs()
        ) {
            Text(subQuote)
        }
    }
}


@Composable
fun PrivatePolicyLink(){
    Link(
        path = "privacy-policy",
        text = "Privacy Policy",
        modifier = NavigationItemStyle.toModifier()
            .padding(all = 10.px)
            .fontSize(16.px)
            .textDecorationLine(TextDecorationLine.None)
            .textAlign(
                TextAlign.Center
            )
    )
}

@Composable
fun LogoSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Logo()
        HeaderSection()
    }

}
@Composable
fun HeaderSection(

) {
    Link(
        path = "/",
        text = "Dream Journal AI",
        modifier = NavigationItemStyle.toModifier()
            .padding(all = 10.px)
            .fontSize(32.px)
            .textDecorationLine(TextDecorationLine.None)
            .textAlign(
                TextAlign.Center
            )
    )
}

@Composable
fun Logo() {
    val nav = rememberPageContext()
    Box(
        modifier = Modifier
            .size(30.percent)
            .maxSize(100.px)
            .padding(all = 10.px)
            .background(color = Color.transparent)
            .onClick {
                nav.router.navigateTo("/")
            },
        contentAlignment = Alignment.Center,
    ) {
        Image(
            modifier = LogoStyle.toModifier()
                .size(100.percent)
                .background(color = Color.transparent),
            src = "DreamJournalAILogoWeb.png",
            desc = "Dream Journal AI Website Art"
        )
    }

}


@Composable
fun MainSectionContent(
) {
    Image(
        modifier = Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover),
        src = "LargeDreamJournalAIWebImage.png",
        desc = "Dream Journal AI Website Art"
    )
}
