package com.easyhooon.dailypulse.sources.presentation

import com.easyhooon.dailypulse.sources.domain.Source


data class SourcesState (
    val sources: List<Source>,
    val loading: Boolean = false,
    val error: String? = null
)
