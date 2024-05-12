package com.easyhooon.dailypulse.articles.presentation

import com.easyhooon.dailypulse.articles.domain.Article
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

data class ArticlesState (
    val articles: ImmutableList<Article> = persistentListOf(),
    val loading: Boolean = false,
    val error: String? = null
)
