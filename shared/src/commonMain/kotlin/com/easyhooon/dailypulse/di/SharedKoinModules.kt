package com.easyhooon.dailypulse.di

import com.easyhooon.dailypulse.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)