package com.easyhooon.dailypulse.di

import app.cash.sqldelight.db.SqlDriver
import com.easyhooon.dailypulse.db.DailyPulseDatabase
import com.easyhooon.dailypulse.db.DatabaseDriverFactory
import org.koin.dsl.module

val databaseModule = module {
    single<SqlDriver> { DatabaseDriverFactory().createDriver()!! }
    single<DailyPulseDatabase> { DailyPulseDatabase(get()) }
}