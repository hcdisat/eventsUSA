package com.hcdisat.usaevents.data.api.models


import com.google.gson.annotations.SerializedName

data class ExternalLinks(
    @SerializedName("facebook")
    val facebook: List<Facebook>,
    @SerializedName("homepage")
    val homepage: List<Homepage>,
    @SerializedName("instagram")
    val instagram: List<Instagram>,
    @SerializedName("twitter")
    val twitter: List<Twitter>,
    @SerializedName("wiki")
    val wiki: List<Wiki>
)