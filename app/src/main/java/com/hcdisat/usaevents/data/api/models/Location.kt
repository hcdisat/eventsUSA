package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("latitude")
    val latitude: String,
    @SerializedName("longitude")
    val longitude: String
)