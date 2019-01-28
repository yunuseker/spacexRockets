package com.yunuseker.rocket.data.util;

import com.google.gson.annotations.SerializedName;
import com.yunuseker.rocket.data.defination.ErrorType;

public class BaseError {

    @ErrorType
    private String errorType;
    private int errorCode;
    private String errorMessage;

    public BaseError() {
    }

    public BaseError(String errorType) {
        this.errorType = errorType;
    }

    public BaseError(String errorType, String errorMessage) {
        this.errorType = errorType;
        this.errorMessage = errorMessage;
    }

    public static BaseError createWithErrorType(@ErrorType String errorType){
        return new BaseError(errorType);
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(@ErrorType String errorType) {
        this.errorType = errorType;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
