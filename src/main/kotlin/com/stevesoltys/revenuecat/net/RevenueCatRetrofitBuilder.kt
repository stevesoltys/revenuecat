package com.stevesoltys.revenuecat.net

import com.stevesoltys.revenuecat.RevenueCatConfiguration
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

/**
 * @author Steve Soltys
 */
class RevenueCatRetrofitBuilder {

    private val objectMapper = RevenueCatObjectMapper()

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor { chain ->
            val newRequest: Request = chain.request().newBuilder()
                .addHeader("Authorization", "Bearer $apiKey")
                .build()

            chain.proceed(newRequest)
        }
        .build()

    private lateinit var apiKey: String

    fun build(configuration: RevenueCatConfiguration): Retrofit {
        this.apiKey = configuration.apiKey

        return Retrofit.Builder()
            .baseUrl("https://api.revenuecat.com/v1/")
            .client(okHttpClient)
            .addConverterFactory(JacksonConverterFactory.create(objectMapper))
            .build()
    }
}