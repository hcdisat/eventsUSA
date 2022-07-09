package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: Self
)