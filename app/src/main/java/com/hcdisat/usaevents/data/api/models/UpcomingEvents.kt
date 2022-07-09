package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class UpcomingEvents(
    @SerializedName("_filtered")
    val filtered: Int,
    @SerializedName("ticketmaster")
    val ticketmaster: Int,
    @SerializedName("tmr")
    val tmr: Int,
    @SerializedName("_total")
    val total: Int
)