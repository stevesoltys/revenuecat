package com.stevesoltys.revenuecat.model

import com.fasterxml.jackson.annotation.JsonProperty
import com.stevesoltys.revenuecat.model.subscription.Subscriber

/**
 * @author Steve Soltys
 */
open class GetOrCreateSubscriberResponse : BaseResponse() {

    @JsonProperty("subscriber")
    var subscriber: Subscriber? = null
}