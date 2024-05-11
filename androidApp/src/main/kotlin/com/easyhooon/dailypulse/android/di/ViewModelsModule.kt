package com.easyhooon.dailypulse.android.di

import com.easyhooon.dailypulse.articles.presentation.ArticlesViewModel
import com.easyhooon.dailypulse.sources.presentation.SourcesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

// TODO: koin viewModel 에 대해 알아보기
val viewModelsModule = module {

    viewModel { ArticlesViewModel(get()) }
    viewModel { SourcesViewModel(get()) }
}