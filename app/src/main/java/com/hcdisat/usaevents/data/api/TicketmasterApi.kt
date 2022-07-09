package com.hcdisat.usaevents.data.api

import com.hcdisat.usaevents.commons.API_EVENTS_PATH
import com.hcdisat.usaevents.data.api.models.EventsResponse
import retrofit2.Response
import retrofit2.http.GET

interface TicketmasterApi {

    @GET(API_EVENTS_PATH)
    suspend fun getEvents(): Response<EventsResponse>
}