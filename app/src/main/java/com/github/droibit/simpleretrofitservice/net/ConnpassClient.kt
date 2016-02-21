package com.github.droibit.simpleretrofitservice.net

import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import java.text.SimpleDateFormat
import java.util.*

private val connpassApiUrl = "http://connpass.com"
private val defaultReturnCount = 10

private val ymFormat by lazy { SimpleDateFormat("yyyyMM") }
private val ymdFormat by lazy { SimpleDateFormat("yyyyMMdd") }

/**
 *
 *
 * @author kumagai
 */
class ConnpassClient {

    interface Service {

        @GET("/api/v1/event/")
        fun searchKeyword(@Query("keyword") keyword: String,
                          @Query("ymd") ymdDates: List<@JvmSuppressWildcards String>? = null,
                          @Query("order") order: Order = Order.EVENT,
                          @Query("start") start: Int = 0,
                          @Query("count") count: Int = defaultReturnCount): Call<EventResponse>

        @GET("/api/v1/event/")
        fun searchEventId(@Query("event_id") eventId: String,
                          @Query("ymd") ymdDates: List<@JvmSuppressWildcards String>? = null,
                          @Query("order") order: Order = Order.EVENT,
                          @Query("start") start: Int = 0,
                          @Query("count") count: Int = defaultReturnCount): Call<EventResponse>

        /** @hide */
        @GET("/api/v1/event/")
        fun search(@QueryMap query: Map<String, @JvmSuppressWildcards Any?>): Call<EventResponse>
    }

    @JvmField
    val service: Service

    constructor(baseUrl: String = connpassApiUrl) {
        val moshi = Moshi.Builder()
                .add(ResponseAdapter.factory)
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .callFactory(OkHttpClient())
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()

        service = retrofit.create(Service::class.java)
    }
}

fun ConnpassClient.Service.searchKeyword(keyword: String,
                                         ymdDates: List<@JvmSuppressWildcards Date>? = null,
                                         order: Order = Order.EVENT,
                                         start: Int = 0,
                                         count: Int = defaultReturnCount): Call<EventResponse> {
    val dates = ymdDates?.map { ymdFormat.format(it) }
    return searchEventId(keyword, dates, order, start, count)
}

fun ConnpassClient.Service.searchEventId(eventId: String,
                                         ymdDates: List<@JvmSuppressWildcards Date>? = null,
                                         order: Order = Order.EVENT,
                                         start: Int = 0,
                                         count: Int = defaultReturnCount): Call<EventResponse> {
    val dates = ymdDates?.map { ymdFormat.format(it) }
    return searchEventId(eventId, dates, order, start, count)
}



enum class Order(val index: Int) {
    UPDATED(0), // 更新日時順
    EVENT(1), // 開催日時順
    NEW(2); // 新着順

    override fun toString() = "$index"
}

