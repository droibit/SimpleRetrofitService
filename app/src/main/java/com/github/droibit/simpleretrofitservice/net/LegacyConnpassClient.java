package com.github.droibit.simpleretrofitservice.net;

import com.squareup.moshi.Moshi;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author kumagai
 */
public class LegacyConnpassClient {

    public interface Service {

        @GET("/api/v1/event/")
        Call<EventResponse> searchKeyword(@Query("keyword") String keyword,
                                          @Query("ymd") List<String> ymdDates,
                                          @Query("order") Order order,
                                          @Query("start") int start,
                                          @Query("count") int count);

        @GET("/api/v1/event/")
        Call<EventResponse> searchEventId(@Query("event_id") String eventId,
                                          @Query("ymd") List<String> ymdDates,
                                          @Query("order") Order order,
                                          @Query("start") int start,
                                          @Query("count") int count);
    }

    private static final String connpassUrl = "http://connpass.com";

    public final Service service;

    public LegacyConnpassClient() {
        this(connpassUrl);
    }

    public LegacyConnpassClient(String baseUrl) {
        final Moshi moshi = new Moshi.Builder()
                .add(ResponseAdapter.factory)
                .build();
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .callFactory(new OkHttpClient())
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build();
        service = retrofit.create(Service.class);
    }
}
