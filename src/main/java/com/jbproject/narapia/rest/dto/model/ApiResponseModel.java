package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.List;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class ApiResponseModel {

    @JsonProperty("header")
    private Header header;
    @JsonProperty("body")
    private Object body;

    @Getter @Setter @ToString
    @NoArgsConstructor
    public static class Header{
        private String resultCode;
        private String resultMsg;
    }

}
