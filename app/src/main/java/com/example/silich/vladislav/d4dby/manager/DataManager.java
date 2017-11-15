package com.example.silich.vladislav.d4dby.manager;


import com.example.silich.vladislav.d4dby.model.res.SparePartsRes;
import com.example.silich.vladislav.d4dby.network.D4DService;
import com.example.silich.vladislav.d4dby.network.ServiceGenerator;

import java.util.List;

import retrofit2.Call;

/**
 * Created by Lenovo on 11.09.2017.
 */

 public class DataManager {
    private static DataManager INSTANCE = null;
    private D4DService mRestService;

    private DataManager() {
        this.mRestService = ServiceGenerator.createService(D4DService.class);
    }

    public static DataManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public Call<List<SparePartsRes>> getSpare(){
        return mRestService.getSpare();
    }

}

