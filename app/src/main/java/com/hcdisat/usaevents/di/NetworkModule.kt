package com.hcdisat.usaevents.di

import com.hcdisat.usaevents.commons.API_BASE_URL
import com.hcdisat.usaevents.commons.REQUEST_TIMEOUT
import com.hcdisat.usaevents.data.api.EventsRepository
import com.hcdisat.usaevents.data.api.EventsRepositoryImpl
import com.hcdisat.usaevents.data.api.TicketmasterApi
import com.hcdisat.usaevents.data.api.interceptors.AppendDefaultQueryInterceptors
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun providesHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

    @Provides
    fun providesOkHttpClient(okhttpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(AppendDefaultQueryInterceptors())
            .addInterceptor(okhttpLoggingInterceptor)
            .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
            .build()

    @Provides
    fun providesTicketmasterApi(client: OkHttpClient): TicketmasterApi {
        return Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TicketmasterApi::class.java)
    }

    @Provides
    fun providesEventsRepository(ticketmasterApi: TicketmasterApi): EventsRepository =
        EventsRepositoryImpl(ticketmasterApi)
}