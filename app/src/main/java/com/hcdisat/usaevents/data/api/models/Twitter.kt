package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Twitter(
    @SerializedName("url")
    val url: String
)