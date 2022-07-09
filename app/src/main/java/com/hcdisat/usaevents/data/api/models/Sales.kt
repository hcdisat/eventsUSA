package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Sales(
    @SerializedName("public")
    val `public`: Public
)