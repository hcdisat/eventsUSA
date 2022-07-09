package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("attractions")
    val attractions: List<AttractionX>,
    @SerializedName("self")
    val self: SelfXX,
    @SerializedName("venues")
    val venues: List<VenueX>
)