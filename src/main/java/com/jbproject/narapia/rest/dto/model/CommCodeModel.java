package com.jbproject.narapia.rest.dto.model;

import com.jbproject.narapia.rest.entity.CommCodeEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class CommCodeModel {

    @Schema(title = "공통 코드")
    private String code;
    @Schema(title = "그룹 코드")
    private String groupCode;
    @Schema(title = "공통코드 명")
    private String codeName;
    @Schema(title = "순서")
    private int seq;
    @Schema(title = "사용여부 Y/N")
    private String useYn;
    
    public static CommCodeModel create(CommCodeEntity entity){
        CommCodeModel result = new CommCodeModel();

        result.setCode(entity.getCode());
        result.setGroupCode(entity.getGroupCode());
        result.setCodeName(entity.getCodeName());
        result.setSeq(entity.getSeq());
        result.setUseYn(entity.getUseYn());

        return result;
    }
}
