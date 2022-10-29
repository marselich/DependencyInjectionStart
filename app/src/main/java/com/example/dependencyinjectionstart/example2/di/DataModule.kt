package com.example.dependencyinjectionstart.example2.di

import com.example.dependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ExampleRemoteQualifier
    @ApplicationScope
    @Binds
    fun bindExampleRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @ExampleTestRemoteQualifier
    @ApplicationScope
    @Binds
    fun bindExampleTestRemoteDataSource(impl: ExampleTestRemoteDataSourceImpl): ExampleRemoteDataSource

}