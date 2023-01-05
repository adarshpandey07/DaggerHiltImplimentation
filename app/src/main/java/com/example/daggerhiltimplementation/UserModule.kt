package com.example.daggerhiltimplementation

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {
    @Provides
    @Named("Firebase")
    fun providesFirebaseRepository() : UserRepository{
        return FirebaseRepository()
    }
    @Provides
    @Named("sql")
    fun provideSQLRepository(sqlRepository: SQLRepository):UserRepository{
        return  sqlRepository
    }


}