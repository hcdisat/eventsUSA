package com.hcdisat.usaevents.domain.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.hcdisat.usaevents.data.api.models.Event
import java.io.File

fun getEventFromJson(): Event {
    val type = object : TypeToken<Event>() {}.type
    return Gson().fromJson(EVENT_JSON, type)
}

val EVENT_JSON = """{
  "name": "Boston Red Sox vs. New York Yankees",
  "type": "event",
  "id": "Z7r9jZ1AdFNbI",
  "test": false,
  "url": "https://www.ticketmaster.com/event/Z7r9jZ1AdFNbI",
  "locale": "en-us",
  "images": [
    {
      "ratio": "3_2",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_TABLET_LANDSCAPE_3_2.jpg",
      "width": 1024,
      "height": 683,
      "fallback": false
    },
    {
      "ratio": "16_9",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_TABLET_LANDSCAPE_LARGE_16_9.jpg",
      "width": 2048,
      "height": 1152,
      "fallback": false
    },
    {
      "ratio": "16_9",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_EVENT_DETAIL_PAGE_16_9.jpg",
      "width": 205,
      "height": 115,
      "fallback": false
    },
    {
      "ratio": "16_9",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RECOMENDATION_16_9.jpg",
      "width": 100,
      "height": 56,
      "fallback": false
    },
    {
      "ratio": "16_9",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_TABLET_LANDSCAPE_16_9.jpg",
      "width": 1024,
      "height": 576,
      "fallback": false
    },
    {
      "ratio": "3_2",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_ARTIST_PAGE_3_2.jpg",
      "width": 305,
      "height": 203,
      "fallback": false
    },
    {
      "ratio": "4_3",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_CUSTOM.jpg",
      "width": 305,
      "height": 225,
      "fallback": false
    },
    {
      "ratio": "3_2",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RETINA_PORTRAIT_3_2.jpg",
      "width": 640,
      "height": 427,
      "fallback": false
    },
    {
      "ratio": "16_9",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RETINA_LANDSCAPE_16_9.jpg",
      "width": 1136,
      "height": 639,
      "fallback": false
    },
    {
      "ratio": "16_9",
      "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RETINA_PORTRAIT_16_9.jpg",
      "width": 640,
      "height": 360,
      "fallback": false
    }
  ],
  "sales": {
    "public": {
      "startDateTime": "1900-01-01T18:00:00Z",
      "startTBD": false,
      "startTBA": false,
      "endDateTime": "2022-07-09T23:15:00Z"
    }
  },
  "dates": {
    "start": {
      "localDate": "2022-07-09",
      "localTime": "19:15:00",
      "dateTime": "2022-07-09T23:15:00Z",
      "dateTBD": false,
      "dateTBA": false,
      "timeTBA": false,
      "noSpecificTime": false
    },
    "status": {
      "code": "onsale"
    },
    "spanMultipleDays": false
  },
  "classifications": [
    {
      "primary": true,
      "segment": {
        "id": "KZFzniwnSyZfZ7v7nE",
        "name": "Sports"
      },
      "genre": {
        "id": "KnvZfZ7vAdv",
        "name": "Baseball"
      },
      "subGenre": {
        "id": "KZazBEonSMnZfZ7vF1n",
        "name": "MLB"
      },
      "family": false
    }
  ],
  "outlets": [
    {
      "url": "https://www.mlb.com/redsox",
      "type": "venueBoxOffice"
    },
    {
      "url": "https://www.ticketmaster.com/boston-red-sox-vs-new-york-boston-massachusetts-07-09-2022/event/Zu0FM1R0e5t8bEK",
      "type": "tmMarketPlace"
    }
  ],
  "seatmap": {
    "staticUrl": "https://content.resale.ticketmaster.com/graphics/TMResale/1/VenueMaps/551-107-3-0-FenwayParkBostonRedSox.png"
  },
  "_links": {
    "self": {
      "href": "/discovery/v2/events/Z7r9jZ1AdFNbI?locale=en-us"
    },
    "attractions": [
      {
        "href": "/discovery/v2/attractions/K8vZ9171okf?locale=en-us"
      },
      {
        "href": "/discovery/v2/attractions/K8vZ9171okV?locale=en-us"
      }
    ],
    "venues": [
      {
        "href": "/discovery/v2/venues/Z6r9jZkkee?locale=en-us"
      }
    ]
  },
  "_embedded": {
    "venues": [
      {
        "name": "Fenway Park",
        "type": "venue",
        "id": "Z6r9jZkkee",
        "test": false,
        "locale": "en-us",
        "postalCode": "02215",
        "timezone": "America/New_York",
        "city": {
          "name": "Boston"
        },
        "state": {
          "name": "Massachusetts",
          "stateCode": "MA"
        },
        "country": {
          "name": "United States Of America",
          "countryCode": "US"
        },
        "address": {
          "line1": "4 Yawkey Way"
        },
        "location": {
          "longitude": "-71.102501",
          "latitude": "42.346901"
        },
        "dmas": [
          {
            "id": 235
          }
        ],
        "upcomingEvents": {
          "_total": 61,
          "tmr": 49,
          "ticketmaster": 12,
          "_filtered": 0
        },
        "_links": {
          "self": {
            "href": "/discovery/v2/venues/Z6r9jZkkee?locale=en-us"
          }
        }
      }
    ],
    "attractions": [
      {
        "name": "Boston Red Sox",
        "type": "attraction",
        "id": "K8vZ9171okf",
        "test": false,
        "url": "https://www.ticketmaster.com/boston-red-sox-tickets/artist/805904",
        "locale": "en-us",
        "externalLinks": {
          "twitter": [
            {
              "url": "https://twitter.com/redsox"
            }
          ],
          "wiki": [
            {
              "url": "https://en.wikipedia.org/wiki/Boston_Red_Sox"
            }
          ],
          "facebook": [
            {
              "url": "https://www.facebook.com/RedSox"
            }
          ],
          "instagram": [
            {
              "url": "https://www.instagram.com/redsox"
            }
          ],
          "homepage": [
            {
              "url": "https://www.mlb.com/redsox"
            }
          ]
        },
        "images": [
          {
            "ratio": "3_2",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_TABLET_LANDSCAPE_3_2.jpg",
            "width": 1024,
            "height": 683,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_TABLET_LANDSCAPE_LARGE_16_9.jpg",
            "width": 2048,
            "height": 1152,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_EVENT_DETAIL_PAGE_16_9.jpg",
            "width": 205,
            "height": 115,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RECOMENDATION_16_9.jpg",
            "width": 100,
            "height": 56,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_TABLET_LANDSCAPE_16_9.jpg",
            "width": 1024,
            "height": 576,
            "fallback": false
          },
          {
            "ratio": "3_2",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_ARTIST_PAGE_3_2.jpg",
            "width": 305,
            "height": 203,
            "fallback": false
          },
          {
            "ratio": "4_3",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_CUSTOM.jpg",
            "width": 305,
            "height": 225,
            "fallback": false
          },
          {
            "ratio": "3_2",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RETINA_PORTRAIT_3_2.jpg",
            "width": 640,
            "height": 427,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RETINA_LANDSCAPE_16_9.jpg",
            "width": 1136,
            "height": 639,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/eef/8d86cdb2-b3aa-44db-9088-f8e598f45eef_1343381_RETINA_PORTRAIT_16_9.jpg",
            "width": 640,
            "height": 360,
            "fallback": false
          }
        ],
        "classifications": [
          {
            "primary": true,
            "segment": {
              "id": "KZFzniwnSyZfZ7v7nE",
              "name": "Sports"
            },
            "genre": {
              "id": "KnvZfZ7vAdv",
              "name": "Baseball"
            },
            "subGenre": {
              "id": "KZazBEonSMnZfZ7vF1n",
              "name": "MLB"
            },
            "type": {
              "id": "KZAyXgnZfZ7v7l1",
              "name": "Group"
            },
            "subType": {
              "id": "KZFzBErXgnZfZ7vA7d",
              "name": "Team"
            },
            "family": false
          }
        ],
        "upcomingEvents": {
          "_total": 120,
          "tmr": 67,
          "ticketmaster": 53,
          "_filtered": 0
        },
        "_links": {
          "self": {
            "href": "/discovery/v2/attractions/K8vZ9171okf?locale=en-us"
          }
        }
      },
      {
        "name": "New York Yankees",
        "type": "attraction",
        "id": "K8vZ9171okV",
        "test": false,
        "url": "https://www.ticketmaster.com/new-york-yankees-tickets/artist/805992",
        "locale": "en-us",
        "externalLinks": {
          "twitter": [
            {
              "url": "https://twitter.com/Yankees"
            }
          ],
          "wiki": [
            {
              "url": "https://en.wikipedia.org/wiki/New_York_Yankees"
            }
          ],
          "facebook": [
            {
              "url": "https://www.facebook.com/Yankees"
            }
          ],
          "instagram": [
            {
              "url": "https://www.instagram.com/yankees"
            }
          ],
          "homepage": [
            {
              "url": "https://www.mlb.com/yankees"
            }
          ]
        },
        "images": [
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_RECOMENDATION_16_9.jpg",
            "width": 100,
            "height": 56,
            "fallback": false
          },
          {
            "ratio": "3_2",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_TABLET_LANDSCAPE_3_2.jpg",
            "width": 1024,
            "height": 683,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_RETINA_PORTRAIT_16_9.jpg",
            "width": 640,
            "height": 360,
            "fallback": false
          },
          {
            "ratio": "3_2",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_RETINA_PORTRAIT_3_2.jpg",
            "width": 640,
            "height": 427,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_TABLET_LANDSCAPE_16_9.jpg",
            "width": 1024,
            "height": 576,
            "fallback": false
          },
          {
            "ratio": "3_2",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_ARTIST_PAGE_3_2.jpg",
            "width": 305,
            "height": 203,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_EVENT_DETAIL_PAGE_16_9.jpg",
            "width": 205,
            "height": 115,
            "fallback": false
          },
          {
            "ratio": "4_3",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_CUSTOM.jpg",
            "width": 305,
            "height": 225,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_RETINA_LANDSCAPE_16_9.jpg",
            "width": 1136,
            "height": 639,
            "fallback": false
          },
          {
            "ratio": "16_9",
            "url": "https://s1.ticketm.net/dam/a/4af/0f77afd9-acc2-4347-aa81-66aa7004f4af_1343881_TABLET_LANDSCAPE_LARGE_16_9.jpg",
            "width": 2048,
            "height": 1152,
            "fallback": false
          }
        ],
        "classifications": [
          {
            "primary": true,
            "segment": {
              "id": "KZFzniwnSyZfZ7v7nE",
              "name": "Sports"
            },
            "genre": {
              "id": "KnvZfZ7vAdv",
              "name": "Baseball"
            },
            "subGenre": {
              "id": "KZazBEonSMnZfZ7vF1n",
              "name": "MLB"
            },
            "type": {
              "id": "KZAyXgnZfZ7v7l1",
              "name": "Group"
            },
            "subType": {
              "id": "KZFzBErXgnZfZ7vA7d",
              "name": "Team"
            },
            "family": false
          }
        ],
        "upcomingEvents": {
          "_total": 180,
          "tmr": 34,
          "ticketmaster": 146,
          "_filtered": 0
        },
        "_links": {
          "self": {
            "href": "/discovery/v2/attractions/K8vZ9171okV?locale=en-us"
          }
        }
      }
    ]
  }
}
""".trimIndent()