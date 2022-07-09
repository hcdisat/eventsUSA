package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("name")
    val name: String
)