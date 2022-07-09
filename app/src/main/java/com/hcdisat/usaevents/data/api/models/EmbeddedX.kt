package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class EmbeddedX(
    @SerializedName("attractions")
    val attractions: List<Attraction>,
    @SerializedName("venues")
    val venues: List<Venue>
)