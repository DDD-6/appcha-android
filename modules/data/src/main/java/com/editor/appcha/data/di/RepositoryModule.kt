package com.editor.appcha.data.di

import com.editor.appcha.data.repo.GreeterRepositoryImpl
import com.editor.appcha.domain.repo.GreeterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideGreeterRepository(
        greeterRepositoryImpl: GreeterRepositoryImpl
    ): GreeterRepository
}