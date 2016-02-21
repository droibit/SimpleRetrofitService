package com.github.droibit.simpleretrofitservice.net

import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.assertThat
import java.util.*

/**
 *
 *
 * @author kumagai
 */
class ConnpassClientTest {

    @Rule
    @JvmField
    val mockServer = MockWebServer()

    lateinit var connpassClient: ConnpassClient

    @Before
    fun setup() {
        connpassClient = ConnpassClient(baseUrl = "${mockServer.url("/")}")
    }

    @After
    fun tearDown() {
        mockServer.shutdown()
    }

    @Test
    fun searchKeyword() {
        val service = connpassClient.service

        val mockResponse = MockResponse().apply {
            setBody(mockMultiEventResponse)
        }
        mockServer.enqueue(mockResponse)

        val call = service.searchKeyword("hoge")
        val response = call.execute()

        println(response.raw())
        assertThat(response.body(), notNullValue())
        assertThat(response.body().events.size, `is`(3))
    }

    @Test
    fun searchKeywordExt() {
        val service = connpassClient.service

        val mockResponse = MockResponse().apply {
            setBody(mockMultiEventResponse)
        }
        mockServer.enqueue(mockResponse)

        val call = service.searchKeyword("hoge", ymdDates = listOf(Date(), Date()))
        val response = call.execute()

        println(response.raw())
        assertThat(response.body(), notNullValue())
        assertThat(response.body().events.size, `is`(3))
    }

    @Test
    fun searchEventId() {
        val service = connpassClient.service
        service.search(emptyMap())

        val mockResponse = MockResponse().apply {
            setBody(mockMultiEventResponse)
        }
        mockServer.enqueue(mockResponse)

        val call = service.searchEventId("hoge")
        val response = call.execute()

        println(response.raw())
        assertThat(response.body(), notNullValue())
        assertThat(response.body().events.size, `is`(3))
    }

    @Test
    fun searchEventIdExt() {
        val service = connpassClient.service

        val mockResponse = MockResponse().apply {
            setBody(mockMultiEventResponse)
        }
        mockServer.enqueue(mockResponse)

        val call = service.searchEventId("hoge", ymdDates = listOf(Date(), Date()))
        val response = call.execute()

        println(response.raw())
        assertThat(response.body(), notNullValue())
        assertThat(response.body().events.size, `is`(3))
    }
}