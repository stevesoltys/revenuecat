package com.stevesoltys.revenuecat.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * @author Steve Soltys
 */
open class BaseResponse {

    @JsonProperty("request_date")
    var requestDate: String? = null

    @JsonProperty("request_date_ms")
    var requestDateMs: Long? = null
}