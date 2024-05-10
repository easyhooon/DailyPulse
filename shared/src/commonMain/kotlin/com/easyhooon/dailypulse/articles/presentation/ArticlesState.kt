package com.easyhooon.dailypulse.articles.presentation

import com.easyhooon.dailypulse.articles.domain.Article

data class ArticlesState (
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
