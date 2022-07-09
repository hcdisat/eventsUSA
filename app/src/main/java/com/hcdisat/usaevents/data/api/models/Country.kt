package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("countryCode")
    val countryCode: String,
    @SerializedName("name")
    val name: String
)