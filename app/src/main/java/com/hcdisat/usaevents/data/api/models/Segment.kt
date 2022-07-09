package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Segment(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)