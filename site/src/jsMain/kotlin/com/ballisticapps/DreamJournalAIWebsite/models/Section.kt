package com.ballisticapps.DreamJournalAIWebsite.models

enum class Section (
    val id: String,
    val title: String,
    val subtitle: String,
    val route: String,
) {
    Home(
        id = "home",
        title = "Dream Journal AI",
        subtitle = "A website to help you understand your dreams",
        route = "#home",
    ),
    PrivacyPolicy(
        id = "privacy",
        title = "Privacy Policy",
        subtitle = "Our privacy policy",
        route = "#privacy",
    ),
}
