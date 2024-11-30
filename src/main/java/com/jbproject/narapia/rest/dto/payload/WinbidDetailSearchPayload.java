package com.jbproject.narapia.rest.dto.payload;

import com.jbproject.narapia.rest.constants.ServerConstant;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class WinbidDetailSearchPayload extends WinbidSearch{

    private int winbidDetailId;
    private String searchText;
}
