package com.yunuseker.rocket.data.repository;

import android.databinding.ObservableField;

import com.yunuseker.rocket.base.BaseRepository;
import com.yunuseker.rocket.data.model.RocketModel;
import com.yunuseker.rocket.data.remote.Api;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

public class RocketRepository extends BaseRepository {

    public RocketRepository(Api api) {
        super(api);
    }

    public Observable<List<RocketModel>> getRockets(int offset){
       return getApi().getRockets(30,offset);
    }
}
