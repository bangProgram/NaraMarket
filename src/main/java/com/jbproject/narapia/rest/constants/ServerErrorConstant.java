package com.jbproject.narapia.rest.constants;

import com.jbproject.narapia.rest.common.ServerError;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum ServerErrorConstant implements ServerError {
    COMMON_400_01(400, "COMMON.400.01", "Invalid Request")
    , COMMON_500_01(500, "COMMON.400.01", "Server Error")

    , BIDNOTI_404_01(404, "BIDNOTI.404.01", "입찰공고를 찾을 수 없습니다.")
    , BIDNOTI_RECORD_400_01(400, "BIDNOTI.RECORD.400.01", "투찰기록을 찾을 수 없습니다.")

    , WUNBID_400_01(400, "WUNBID.400.01", "낙찰이력을 찾을 수 없습니다.")
    ;

    private int responseCode;
    private String code;
    private String msg;

    @Override
    public int getStatusCode() {
        return responseCode;
    }

    @Override
    public String getErrorCode() {
        return code;
    }

    @Override
    public String getErrorMsg() {
        return msg;
    }
}
