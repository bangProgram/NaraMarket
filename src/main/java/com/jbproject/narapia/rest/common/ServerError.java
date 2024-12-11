package com.jbproject.narapia.rest.common;

public interface ServerError {
    String getErrorMsg();

    String getErrorCode();

    int getStatusCode();
}
