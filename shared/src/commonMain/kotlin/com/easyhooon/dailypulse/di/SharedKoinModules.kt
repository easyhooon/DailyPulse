package com.easyhooon.dailypulse.di

import com.easyhooon.dailypulse.articles.di.articlesModule
import com.easyhooon.dailypulse.sources.di.sourcesModule

val sharedKoinModules = listOf(
    articlesModule,
    sourcesModule,
    networkModule
)