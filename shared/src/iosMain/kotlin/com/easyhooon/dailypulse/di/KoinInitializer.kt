package com.easyhooon.dailypulse.di

import com.easyhooon.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

fun initKoin() {

    val modules = sharedKoinModules

    startKoin {
        modules(modules)
    }
}

class ArticlesInjector : KoinComponent {

    val articlesViewModel: ArticlesViewModel by inject()
}