package com.yunuseker.rocket.data.defination;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@StringDef({
        ErrorType.FROM_SERVICE,
        ErrorType.UNKNOWN,
        ErrorType.UNKNOWN_HOST,
        ErrorType.SOCKET_TIMEOUT,
        ErrorType.SERVICE
})
@Retention(RetentionPolicy.SOURCE)
public @interface ErrorType {
    String FROM_SERVICE = "FROM_SERVICE";
    String UNKNOWN = "UNKNOWN";
    String UNKNOWN_HOST = "UNKNOWN_HOST";
    String SOCKET_TIMEOUT = "SOCKET_TIMEOUT";
    String SERVICE = "SERVICE";
}