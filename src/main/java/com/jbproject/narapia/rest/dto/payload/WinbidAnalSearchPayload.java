package com.jbproject.narapia.rest.dto.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class WinbidAnalSearchPayload {

    @Schema(title = "품명 번호", description = "물품분류번호(8자리) + 물품식별번호(앞2자리) [물품목록정보의 관리 및 이용에 관한 규정 제12조]")
    private String dtilPrdctClsfcNo;
    @Schema(title = "품명", description = "품명번호 10자리에 대한 한글명")
    private String dtilPrdctClsfcNoNm;
    @Schema(title = "공고기관코드", description = "공고를 하는 기관의 코드로 행자부코드(행정자치부에서 부여한 기관코드)")
    private String ntceInsttCd;
    @Schema(title = "수요기관코드", description = "실제 수요기관의 코드로 행자부코드(행정자치부에서 부여한 기관코드)")
    private String dminsttCd;

    @Schema(title = "숫자")
    private Double bssamtRate;
    @Schema(title = "레벨")
    private String rateLevel = "1";

}
