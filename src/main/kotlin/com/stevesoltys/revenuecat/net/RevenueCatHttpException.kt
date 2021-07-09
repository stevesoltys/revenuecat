package com.stevesoltys.revenuecat.net

import retrofit2.Response

/**
 * @author Steve Soltys
 */
class RevenueCatHttpException(val response: Response<*>) :
    RuntimeException(
        "Error during RevenueCat HTTP call: " +
            "${response.message()} (${response.code()})"
    )