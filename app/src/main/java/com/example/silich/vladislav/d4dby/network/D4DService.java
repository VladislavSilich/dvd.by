package com.example.silich.vladislav.d4dby.network;

import com.example.silich.vladislav.d4dby.model.res.SparePartsRes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Lenovo on 29.09.2017.
 */

public interface D4DService {
    @GET("spare_parts")
    Call<List<SparePartsRes>> getSpare();

}
