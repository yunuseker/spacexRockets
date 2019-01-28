package com.yunuseker.rocket.data.remote;

import com.yunuseker.rocket.data.model.RocketModel;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("rockets")
    Observable<List<RocketModel>> getRockets(
            @Query("limit") int limit,
            @Query("offset") int offset
    );
}
