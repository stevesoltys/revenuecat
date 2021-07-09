package com.stevesoltys.revenuecat.model.subscription

import com.fasterxml.jackson.annotation.JsonProperty

open class Subscription {

    @JsonProperty("billing_issues_detected_at")
    var billingIssuesDetectedAt: String? = null

    @JsonProperty("expires_date")
    var expiresDate: String? = null

    @JsonProperty("is_sandbox")
    var isSandbox: Boolean? = null

    @JsonProperty("original_purchase_date")
    var originalPurchaseDate: String? = null

    @JsonProperty("ownership_type")
    var ownershipType: String? = null

    @JsonProperty("period_type")
    var periodType: String? = null

    @JsonProperty("purchase_date")
    var purchaseDate: String? = null

    @JsonProperty("store")
    var store: String? = null

    @JsonProperty("unsubscribe_detected_at")
    var unsubscribeDetectedAt: String? = null
}