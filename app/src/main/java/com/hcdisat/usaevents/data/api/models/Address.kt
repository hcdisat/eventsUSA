package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Address(
    @SerializedName("line1")
    val line1: String
)