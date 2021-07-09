package com.stevesoltys.revenuecat.model.entitlement

import com.fasterxml.jackson.annotation.JsonProperty

open class Entitlement {

    @JsonProperty("expires_date")
    var expiresDate: String? = null

    @JsonProperty("product_identifier")
    var productIdentifier: String? = null

    @JsonProperty("purchase_date")
    var purchaseDate: String? = null
}