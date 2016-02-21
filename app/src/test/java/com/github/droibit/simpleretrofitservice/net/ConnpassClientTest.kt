package com.github.droibit.simpleretrofitservice.net

import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.Assert.assertThat

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
        assertThat(response.body().events.size, CoreMatchers.`is`(3))
    }

    @Test
    fun searchEventId() {
        val service = connpassClient.service

        val mockResponse = MockResponse().apply {
            setBody(mockMultiEventResponse)
        }
        mockServer.enqueue(mockResponse)

        val call = service.searchEventId("hoge")
        val response = call.execute()

        println(response.raw())
        assertThat(response.body(), notNullValue())
        assertThat(response.body().events.size, CoreMatchers.`is`(3))
    }
}