package com.stevesoltys.revenuecat.model.subscription

import com.fasterxml.jackson.annotation.JsonProperty
import com.stevesoltys.revenuecat.model.entitlement.Entitlement

open class Subscriber {

    @JsonProperty("entitlements")
    var entitlements: Map<String, Entitlement>? = null

    @JsonProperty("first_seen")
    var firstSeen: String? = null

    @JsonProperty("original_app_user_id")
    var originalAppUserId: String? = null

    @JsonProperty("original_application_version")
    var originalApplicationVersion: Double? = null

    @JsonProperty("subscriptions")
    var subscriptions: Map<String, Subscription>? = null
}