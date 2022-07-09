package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Dates(
    @SerializedName("spanMultipleDays")
    val spanMultipleDays: Boolean,
    @SerializedName("start")
    val start: Start,
    @SerializedName("status")
    val status: Status
)