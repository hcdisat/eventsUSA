package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Embedded(
    @SerializedName("events")
    val events: List<Event>
)