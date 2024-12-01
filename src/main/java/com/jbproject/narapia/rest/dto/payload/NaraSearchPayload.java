package com.jbproject.narapia.rest.dto.payload;

import com.jbproject.narapia.rest.constants.ServerConstant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class NaraSearchPayload {


    @Schema(title = "한 페이지 결과 수")
    private int numOfRows = ServerConstant.WINBID_NUM_OF_ROWS;
    @Schema(title = "페이지 수")
    private int pageNo = 1;
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
