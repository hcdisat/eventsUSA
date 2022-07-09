package com.hcdisat.usaevents.data.api

import com.hcdisat.usaevents.data.api.models.EventsResponse
import retrofit2.Response
import javax.inject.Inject

interface EventsRepository {
    suspend fun getEvents(): Response<EventsResponse>
}

class EventsRepositoryImpl @Inject constructor(
    private val eventsApi: TicketmasterApi
): EventsRepository {
    override suspend fun getEvents(): Response<EventsResponse> = eventsApi.getEvents()
}