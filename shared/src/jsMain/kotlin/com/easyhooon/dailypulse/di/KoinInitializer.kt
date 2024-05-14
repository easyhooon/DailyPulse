package com.easyhooon.dailypulse.di

import org.koin.core.context.startKoin

fun initKoin() = startKoin {
    modules(
        sharedKoinModules
    )
}.koin