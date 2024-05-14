package com.easyhooon.dailypulse.articles.di

import com.easyhooon.dailypulse.articles.data.ArticlesDataSource
import com.easyhooon.dailypulse.articles.data.ArticlesRepository
import com.easyhooon.dailypulse.articles.data.ArticlesService
import com.easyhooon.dailypulse.articles.domain.ArticlesUseCase
import com.easyhooon.dailypulse.articles.presentation.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
    single<ArticlesDataSource> { ArticlesDataSource(getOrNull()) }
    single<ArticlesRepository> { ArticlesRepository(get(), get()) }
}