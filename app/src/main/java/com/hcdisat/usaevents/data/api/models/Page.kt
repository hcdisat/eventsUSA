package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class Page(
    @SerializedName("number")
    val number: Int,
    @SerializedName("size")
    val size: Int,
    @SerializedName("totalElements")
    val totalElements: Int,
    @SerializedName("totalPages")
    val totalPages: Int
)