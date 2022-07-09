package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Public(
    @SerializedName("endDateTime")
    val endDateTime: String,
    @SerializedName("startDateTime")
    val startDateTime: String,
    @SerializedName("startTBA")
    val startTBA: Boolean,
    @SerializedName("startTBD")
    val startTBD: Boolean
)