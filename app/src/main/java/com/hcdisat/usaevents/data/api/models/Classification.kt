package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Classification(
    @SerializedName("family")
    val family: Boolean,
    @SerializedName("genre")
    val genre: Genre,
    @SerializedName("primary")
    val primary: Boolean,
    @SerializedName("segment")
    val segment: Segment,
    @SerializedName("subGenre")
    val subGenre: SubGenre
)