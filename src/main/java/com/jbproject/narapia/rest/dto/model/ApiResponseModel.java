package com.jbproject.narapia.rest.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.*;

import java.util.List;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true,value = "response")
public class ApiResponseModel<T> {

    @JsonProperty("header")
    private Header header;
    @JsonProperty("body")
    private Body<T> body;

    @Getter @Setter @ToString
    @NoArgsConstructor
    public static class Header{
        private String resultCode;
        private String resultMsg;
    }

    @Getter @Setter @ToString
    @NoArgsConstructor
    public static class Body<T> {
        private List<T> items;
        private int numOfRows;
        private int pageNo;
        private int totalCount;

    }

}
