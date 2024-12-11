package com.jbproject.narapia.rest.dto.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BidRecordSearchPayload {

    @Schema(title = "조달사이트 코드")
    private String marketCd;
    @Schema(title = "공고번호")
    private String bidNtceNo;
    @Schema(title = "공고기관코드")
    private String ntceInsttCd;
    @Schema(title = "수요기관코드")
    private String dminsttCd;
}
