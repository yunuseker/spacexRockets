package com.yunuseker.rocket.base;
import com.yunuseker.rocket.data.remote.Api;

public class BaseRepository {

    private Api api;

    public BaseRepository(Api api) {
        this.api = api;
    }

    public Api getApi() {
        return api;
    }
}
