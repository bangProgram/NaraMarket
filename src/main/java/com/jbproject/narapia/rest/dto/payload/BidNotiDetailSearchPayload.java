package com.jbproject.narapia.rest.dto.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BidNotiDetailSearchPayload extends NaraSearchPayload {

    @Schema(title = "공고타입", description = "(1. 물품, 2. 공사, 3. 외자, 4. 용역)")
    private String bidNtceType;
    private String notiId;

}
