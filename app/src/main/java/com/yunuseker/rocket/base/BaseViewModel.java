package com.yunuseker.rocket.base;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.google.gson.Gson;
import com.yunuseker.rocket.R;
import com.yunuseker.rocket.data.defination.ErrorType;
import com.yunuseker.rocket.data.util.BaseError;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import io.reactivex.disposables.CompositeDisposable;
import retrofit2.HttpException;

/**
 * Created by yunus.seker on 26.01.2019.
 * younuseker@gmail.com
 */
public class BaseViewModel extends ViewModel {

    protected MutableLiveData<BaseError> errorMessage = new MutableLiveData<>();

    protected CompositeDisposable disposable = new CompositeDisposable();

    public MutableLiveData<BaseError> getErrorMessage() {
        return errorMessage;
    }

    protected void handleError(Throwable error) {
        if (error instanceof HttpException) {
            String errorBody;
            BaseError baseError;
            try {
                errorBody = ((HttpException) error).response().errorBody().string();
                baseError = new Gson().fromJson(errorBody, BaseError.class);
                if (baseError != null) baseError.setErrorType(ErrorType.FROM_SERVICE);
                errorMessage.postValue(baseError);
            } catch (IOException e) {
                errorMessage.setValue(BaseError.createWithErrorType(ErrorType.UNKNOWN));
            }
        } else if (error instanceof UnknownHostException) {
            errorMessage.postValue(BaseError.createWithErrorType(ErrorType.UNKNOWN_HOST));

        } else if (error instanceof SocketTimeoutException) {
            errorMessage.postValue(BaseError.createWithErrorType(ErrorType.SOCKET_TIMEOUT));

        } else {
            errorMessage.postValue(BaseError.createWithErrorType(ErrorType.UNKNOWN));
        }
    }

    @Override
    protected void onCleared() {
        disposable.clear();
        super.onCleared();
    }

}
