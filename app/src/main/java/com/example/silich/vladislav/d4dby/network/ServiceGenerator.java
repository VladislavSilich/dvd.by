package com.example.silich.vladislav.d4dby.network;

import com.example.silich.vladislav.d4dby.utills.ConstatntManager;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lenovo on 11.09.2017.
 */

public class ServiceGenerator {
    public static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder sBuilder = new Retrofit.Builder().baseUrl(ConstatntManager.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass){
        Retrofit retrofit = sBuilder.client(httpClient.build())
                .build();
        return retrofit.create(serviceClass);
    }
}
