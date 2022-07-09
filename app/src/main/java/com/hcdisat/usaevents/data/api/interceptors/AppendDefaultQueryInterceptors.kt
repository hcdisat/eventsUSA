package com.hcdisat.usaevents.data.api.interceptors

import com.hcdisat.usaevents.commons.API_KEY
import com.hcdisat.usaevents.commons.DEFAULT_COUNTRY_CODE
import okhttp3.Interceptor
import okhttp3.Response

class AppendDefaultQueryInterceptors : Interceptor {

    private val _parameters = mapOf(
        API_KEY_NAME to API_KEY,
        COUNTRY_CODE_KEY to DEFAULT_COUNTRY_CODE
    )

    override fun intercept(chain: Interceptor.Chain): Response {
        val urlBuilder = chain.request().url.newBuilder()
        _parameters.forEach {
            urlBuilder.addQueryParameter(it.key, it.value)
        }

        return chain.proceed(
            chain.request()
                .newBuilder()
                .url(urlBuilder.build())
                .build()
        )
    }

    companion object {
        private const val API_KEY_NAME = "apikey"
        private const val COUNTRY_CODE_KEY = "countryCode"
    }
}