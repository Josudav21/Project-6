package com.example.project6.depedency_injection

import com.example.project6.model.Contoh
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideClassContoh(): Contoh {
        return Contoh()
    }

}