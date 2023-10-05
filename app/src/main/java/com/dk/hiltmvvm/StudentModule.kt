package com.dk.hiltmvvm

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

@InstallIn(ActivityComponent::class)
@Module
class StudentModule @Inject constructor() {

    @Provides
    fun getAPIdb():MessageService{
        return APIDB()
    }
}