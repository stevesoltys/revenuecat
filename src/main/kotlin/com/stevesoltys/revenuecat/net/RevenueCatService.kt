package com.stevesoltys.revenuecat.net

import com.stevesoltys.revenuecat.model.GetOrCreateSubscriberResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author Steve Soltys
 */
interface RevenueCatService {

    @GET("subscribers/{appUserId}")
    fun getOrCreateSubscriber(
        @Path("appUserId") appUserId: String
    ): Call<GetOrCreateSubscriberResponse>
}