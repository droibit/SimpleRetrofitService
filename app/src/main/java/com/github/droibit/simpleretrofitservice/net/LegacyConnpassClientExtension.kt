@file:JvmName("LegacyConnpassClientUtil")
package com.github.droibit.simpleretrofitservice.net

import retrofit2.Call

private val defaultReturnCount = 10

fun LegacyConnpassClient.Service.searchKeywordEx(
        keyword: String,
        ymdDates: List<@JvmSuppressWildcards String>? = null,
        order: Order = Order.UPDATED,
        start: Int = 0,
        count: Int = defaultReturnCount): Call<EventResponse> {
    return searchKeyword(keyword, ymdDates, order, start, count)
}

fun LegacyConnpassClient.Service.searchEventIdEx(
        eventId: String,
        ymdDates: List<@JvmSuppressWildcards String>? = null,
        order: Order = Order.UPDATED,
        start: Int = 0,
        count: Int = defaultReturnCount): Call<EventResponse> {
    return searchEventId(eventId, ymdDates, order, start, count)
}
