package com.easyhooon.dailypulse.sources.di

import com.easyhooon.dailypulse.sources.data.SourcesDataSource
import com.easyhooon.dailypulse.sources.data.SourcesRepository
import com.easyhooon.dailypulse.sources.data.SourcesService
import com.easyhooon.dailypulse.sources.domain.SourcesUseCase
import com.easyhooon.dailypulse.sources.presentation.SourcesViewModel
import org.koin.dsl.module

val sourcesModule = module {

    single<SourcesService> { SourcesService(get()) }
    single<SourcesUseCase> { SourcesUseCase(get()) }
    single<SourcesDataSource> { SourcesDataSource(get()) }
    single<SourcesRepository> { SourcesRepository(get(), get()) }
    single<SourcesViewModel> { SourcesViewModel(get()) }
}