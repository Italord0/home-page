package com.github.italord0.data

import home_page.composeapp.generated.resources.*

object Articles {
    val data = listOf(
        Article(
            image = Res.drawable.compose_multiplatform,
            title = "Compose Multiplatform : Building an app for Android, iOS and Desktop",
            description = "Learn Compose Multiplatform: Build apps for Android, iOS, and Desktop using JetBrains' toolkit for efficient, responsive development across multiple devices.",
            link = "https://medium.com/@italord.melo/compose-multiplatform-mvvm-ktor-building-an-app-with-patterns-for-android-ios-and-desktop-4ae01594887c",
            date = "Feb 3, 2024"
        ),
        Article(
            image = Res.drawable.voyager,
            title = "Voyager : Compose Multiplatform Navigation and ViewModels (ScreenModel)",
            description = "Seamlessly integrate powerful Compose Multiplatform navigation and robust ScreenModel ViewModels, ensuring unified app experiences across Android, iOS, and Desktop platforms with precision and efficiency.",
            link = "https://medium.com/@italord.melo/voyager-compose-multiplatform-navigation-and-viewmodels-screenmodel-b36693484d98",
            date = "Apr 14, 2024"
        ),
        Article(
            image = Res.drawable.leak_canary,
            title = "Leak Canary : Find and handle memory leaks on Android Development",
            description = "Identify and manage memory leaks in Android development with expert techniques for robust app performance, stability, and enhanced user experience.",
            link = "https://medium.com/@italord.melo/leak-canary-find-and-handle-memory-leaks-on-android-development-25c24a3fb930",
            date = "Feb 14, 2024"
        ),
        Article(
            image = Res.drawable.chat,
            title = "Creating a realtime chat app with Compose Multiplatform and Firestore Database",
            description = "Learn how to build a realtime chat app using Jetpack Compose Multiplatform and Firebase Database.",
            link = "https://medium.com/@italord.melo/creating-a-realtime-chat-app-with-compose-multiplatform-and-firestore-e7afafc0be57",
            date = "Nov 21, 2024"
        )
    )
}