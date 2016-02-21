package com.github.droibit.simpleretrofitservice.net

import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import java.io.IOException
import org.junit.Assert.assertThat

/**
 *
 *
 * @author kumagai
 */
class LegacyConnpassClientExtensionTest {

    @Rule
    @JvmField
    var mockWebServer = MockWebServer()

    private lateinit var connpassClient: LegacyConnpassClient

    @Before
    fun setup() {
        connpassClient = LegacyConnpassClient(mockWebServer.url("/").toString())
    }

    @Test
    @Throws(IOException::class)
    fun searchKeyword() {
        val service = connpassClient.service

        val mockResponse = MockResponse()
        mockResponse.setBody(mockMultiEventResponse)
        mockWebServer.enqueue(mockResponse)

        val call = service.searchKeywordEx("hoge", ymdDates = listOf("2015/01/01", "2015/01/02"))
        val response = call.execute()

        println(response.raw().toString())
        assertThat(response.body(), notNullValue())
        assertThat(response.body().events.size, `is`(3))
    }

    @Test
    @Throws(IOException::class)
    fun searchEventId() {
        val service = connpassClient.service

        val mockResponse = MockResponse()
        mockResponse.setBody(mockMultiEventResponse)
        mockWebServer.enqueue(mockResponse)

        val call = service.searchEventIdEx("hoge")
        val response = call.execute()

        println(response.raw().toString())
        assertThat(response.body(), notNullValue())
        assertThat(response.body().events.size, `is`(3))
    }
}