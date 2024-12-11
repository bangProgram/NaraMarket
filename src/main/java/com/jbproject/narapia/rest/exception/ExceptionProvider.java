package com.jbproject.narapia.rest.exception;

import com.jbproject.narapia.rest.common.ServerError;
import com.jbproject.narapia.rest.constants.ServerErrorConstant;
import com.jbproject.narapia.rest.exception.model.ExceptionModel;
import lombok.Data;

public class ExceptionProvider extends RuntimeException {

    private final ExceptionModel exceptionModel;
    private final int statusCode;

    public ExceptionProvider(ServerError error) {
        this(error,null);
    }

    public ExceptionProvider(ServerError error, Throwable t){
        super(error.getErrorMsg(), t);
        this.exceptionModel = new ExceptionModel("", error.getErrorCode(), error.getErrorMsg());
        this.statusCode = error.getStatusCode();
    }

    public ExceptionModel getError() {
        return exceptionModel;
    }
    public int getStatusCode() {
        return statusCode;
    }
}
