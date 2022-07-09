package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class EventsResponse(
    @SerializedName("_embedded")
    val embedded: Embedded,
    @SerializedName("page")
    val page: Page
)