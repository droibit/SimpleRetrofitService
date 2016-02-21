package com.github.droibit.simpleretrofitservice.net;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.IOException;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import retrofit2.Call;
import retrofit2.Response;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * @author kumagai
 */
public class ConnpassClientJavaTest {

    @Rule
    public MockWebServer mockWebServer = new MockWebServer();

    private ConnpassClient connpassClient;

    @Before
    public void setup() {
        connpassClient = new ConnpassClient(mockWebServer.url("/").toString());
    }

    @Test
    public void searchKeyword() throws IOException {
        final ConnpassClient.Service service = connpassClient.service;

        final MockResponse mockResponse = new MockResponse();
        mockResponse.setBody(MockResponses.mockMultiEventResponse);
        mockWebServer.enqueue(mockResponse);

        final Call<EventResponse> call = service.searchKeyword("hoge", null, Order.EVENT, 0, 10);
        final Response<EventResponse> response = call.execute();

        System.out.println(response.raw().toString());
        assertThat(response.body(), notNullValue());
        assertThat(response.body().events.size(), CoreMatchers.is(3));
    }

    @Test
    public void searchEventId() throws IOException {
        final ConnpassClient.Service service = connpassClient.service;

        final MockResponse mockResponse = new MockResponse();
        mockResponse.setBody(MockResponses.mockMultiEventResponse);
        mockWebServer.enqueue(mockResponse);

        final Call<EventResponse> call = service.searchKeyword("hoge", null, Order.EVENT, 0, 10);
        final Response<EventResponse> response = call.execute();

        System.out.println(response.raw().toString());
        assertThat(response.body(), notNullValue());
        assertThat(response.body().events.size(), CoreMatchers.is(3));
    }
}
