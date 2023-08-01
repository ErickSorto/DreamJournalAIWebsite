package com.ballisticapps.DreamJournalAIWebsite.sections

import androidx.compose.runtime.Composable
import com.ballisticapps.DreamJournalAIWebsite.models.Section
import com.ballisticapps.DreamJournalAIWebsite.styles.PrivacyPolicyDescriptionStyle
import com.ballisticapps.DreamJournalAIWebsite.styles.PrivacyPolicyHeaderStyle
import com.ballisticapps.DreamJournalAIWebsite.styles.SectionTitleStyle
import com.ballisticapps.DreamJournalAIWebsite.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun PrivatePolicySection() {
    Box(
        modifier = Modifier
            .id(Section.PrivacyPolicy.id)
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.Center
    ) {
        PrivatePolicyContent()
    }
}

@Composable
fun PrivatePolicyContent() {
    Column(
        modifier = Modifier
            .padding(10.px)
            .fillMaxWidth(
                100.percent
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LogoSection()
        PrivacyPolicyText()
    }
}

@Composable
fun PrivacyPolicyText() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top
    ) {
        SectionTitle(section = Section.PrivacyPolicy)

        val privacyPolicyPoints = listOf(
            Pair(
                "Dream Journal AI Privacy Policy",
                "This Privacy Policy describes the collection, use, and disclosure of personal information by Dream Journal AI, an app developed and provided by BallisticApps. This Privacy Policy applies to all Dream Journal AI users who access or use the app, including those who use the app with a paid subscription."
            ),
            Pair(
                "Information Collection and Use",
                "We collect personal information from you when you use Dream Journal AI. The personal information we collect includes: User email, Dream data, Payment information (if applicable). We use this information to provide and improve the Dream Journal AI app, and to communicate with you about your use of the app."
            ),
            Pair(
                "Ads and Third-Party Services",
                "Dream Journal AI contains advertisements to access specific app functionality. These advertisements are provided by third-party services, such as AdMob and Facebook. We may also use third-party analytics services, such as Google Analytics for Firebase and Firebase Crashlytics, to collect information about your use of the app. These third-party services"
            ),
            Pair(
                "Payment Information",
                "If you choose to subscribe to Dream Journal AI, we will collect payment information, such as your credit card number and billing information. This information is used to process your subscription and is stored securely by our payment processor."
            ),
            Pair(
                "Security",
                "We take the security of your personal information very seriously. We use appropriate technical and organizational measures to protect your personal information from unauthorized access, disclosure, alteration, or destruction. However, please be aware that no method of transmitting or storing personal information is completely secure, and we cannot guarantee the security of your personal information."
            ),
            Pair(
               "Cookies and Log Data",
                "Dream Journal AI may use cookies and log data to improve the app and to understand how users interact with the app. Cookies are small data files stored on your device, and log data includes information about your device, operating system, and app usage."
            ),
            Pair(
                "Service Providers",
                "Dream Journal AI is not intended for children under the age of 13. We do not knowingly collect personal information from children under the age of 13."
            ),
            Pair(
                "Links to Other Sites",
                "Dream Journal AI may contain links to other websites or apps. Please be aware that we are not responsible for the privacy practices of these other sites or apps. We encourage you to read the privacy policies of any site or app you visit."
            ),
            Pair(
                "Changes to This Privacy Policy",
                "We may update this Privacy Policy from time to time to reflect changes to our practices or for other operational, legal, or regulatory reasons. We will notify you of any changes by posting the updated Privacy Policy on our app and/or by sending you an email."
            ),
            Pair(
                "Contact Us",
                "If you have any questions or concerns about this Privacy Policy or our privacy practices, please contact us at DreamJournalAI@gmail.com."
            ),
        )

        privacyPolicyPoints.forEach { (subtitle, description) ->
            P(
                attrs = PrivacyPolicyHeaderStyle.toModifier().toAttrs()
            ) {
                Text(subtitle)
            }
            P(
                attrs = PrivacyPolicyDescriptionStyle.toModifier().toAttrs()
            ) {
                Text(description)
            }
        }
    }
}

@Composable
fun SectionTitle(section: Section) {
    P(
        attrs = SectionTitleStyle.toModifier().toAttrs()
    ) {
        Text(section.title)
    }
}

