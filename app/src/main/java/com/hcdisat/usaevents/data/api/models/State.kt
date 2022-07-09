package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class State(
    @SerializedName("name")
    val name: String,
    @SerializedName("stateCode")
    val stateCode: String
)