package com.easyhooon.dailypulse.db

import app.cash.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver? {
        return null
    }
}