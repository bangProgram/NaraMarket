package com.jbproject.narapia.rest.exception.model;

import com.jbproject.narapia.rest.common.ServerError;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ExceptionModel {
    private Error error;

    public ExceptionModel(String request, String errorCode, String errorMsg) {
        this.error = new Error(request, errorCode, errorMsg);
    }

    @Getter
    @Setter
    public static class Error {
        private String request;
        private String errorCode;
        private String errorMsg;

        public Error(String request, String errorCode, String errorMsg) {
            this.request = request;
            this.errorCode = errorCode;
            this.errorMsg = errorMsg;
        }
    }
}
