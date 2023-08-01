package com.ballisticapps.DreamJournalAIWebsite.pages

import androidx.compose.runtime.Composable
import com.ballisticapps.DreamJournalAIWebsite.sections.PrivatePolicySection
import com.varabyte.kobweb.core.Page

@Page(routeOverride = "privacy-policy")
@Composable
fun PrivacyPage() {
    PrivatePolicySection()
}