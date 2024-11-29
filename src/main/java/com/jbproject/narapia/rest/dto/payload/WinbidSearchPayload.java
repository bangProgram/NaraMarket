package com.jbproject.narapia.rest.dto.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class WinbidSearchPayload {

    @Schema(title = "한 페이지 결과 수")
    private String numOfRows;
    @Schema(title = "페이지 수")
    private String pageNo;
    @Schema(title = "조회구분")
    private String inqryDiv;
    @Schema(title = "타입")
    private String type = "json";
    @Schema(title = "조회시작일시")
    private String inqryBgnDt;
    @Schema(title = "조회종료일시")
    private String inqryEndDt;
    @Schema(title = "입찰공고번호")
    private String bidNtceNo;

}
