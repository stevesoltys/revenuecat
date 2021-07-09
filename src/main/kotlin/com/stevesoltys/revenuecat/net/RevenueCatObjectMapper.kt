package com.stevesoltys.revenuecat.net

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper

/**
 * @author Steve Soltys
 */
class RevenueCatObjectMapper : ObjectMapper() {
    init {
        configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    }
}