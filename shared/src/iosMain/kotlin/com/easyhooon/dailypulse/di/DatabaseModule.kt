package com.easyhooon.dailypulse.di

import app.cash.sqldelight.db.SqlDriver
import com.easyhooon.dailypulse.db.DatabaseDriverFactory
import easyhooon.dailypulse.db.DailyPulseDatabase
import org.koin.dsl.module

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory().createDriver() }
    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}