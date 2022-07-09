package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("code")
    val code: String
)