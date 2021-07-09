package com.stevesoltys.revenuecat

import com.stevesoltys.revenuecat.model.GetOrCreateSubscriberResponse
import com.stevesoltys.revenuecat.net.RevenueCatHttpException
import com.stevesoltys.revenuecat.net.RevenueCatRetrofitBuilder
import com.stevesoltys.revenuecat.net.RevenueCatService
import retrofit2.Call

/**
 * @author Steve Soltys
 */
class RevenueCat(private val apiKey: String) {

    private val configuration: RevenueCatConfiguration by lazy {
        RevenueCatConfiguration(apiKey)
    }

    private val retrofitBuilder: RevenueCatRetrofitBuilder by lazy {
        RevenueCatRetrofitBuilder()
    }

    private val revenueCatService: RevenueCatService
        get() {
            return retrofitBuilder
                .build(configuration)
                .create(RevenueCatService::class.java)
        }

    /**
     * Gets the latest subscriber info or creates one if it doesn't exist.
     */
    fun getOrCreateSubscriber(
        appUserId: String
    ): GetOrCreateSubscriberResponse {
        return call(revenueCatService.getOrCreateSubscriber(appUserId))
    }

    private fun <T> call(call: Call<T>): T {
        val response = call.execute()

        if (response.isSuccessful) {
            return response.body()
                ?: throw IllegalStateException("Body should be present when call is successful.")
        }

        throw RevenueCatHttpException(response)
    }
}