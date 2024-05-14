package com.easyhooon.dailypulse.articles.data

import easyhooon.dailypulse.db.DailyPulseDatabase

class ArticlesDataSource(private val database: DailyPulseDatabase?) {

    fun getAllArticles(): List<ArticleRaw> =
        database?.dailyPulseDatabaseQueries?.selectAllArticles(::mapToArticleRaw)?.executeAsList() ?: listOf()

    fun insertArticles(articles: List<ArticleRaw>) {
        database?.dailyPulseDatabaseQueries?.transaction {
            articles.forEach { articleRaw ->
                insertArticle(articleRaw)
            }
        }
    }

    fun clearArticles() =
        database?.dailyPulseDatabaseQueries?.removeAllArticles()

    private fun insertArticle(articleRaw: ArticleRaw) {
        database?.dailyPulseDatabaseQueries?.insertArticle(
            articleRaw.title,
            articleRaw.desc,
            articleRaw.date,
            articleRaw.imageUrl
        )
    }

    private fun mapToArticleRaw(
        title: String,
        desc: String?,
        date: String,
        url: String?
    ): ArticleRaw =
        ArticleRaw(
            title,
            desc,
            date,
            url
        )
}