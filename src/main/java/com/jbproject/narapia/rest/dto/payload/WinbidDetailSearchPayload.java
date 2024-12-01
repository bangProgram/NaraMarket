package com.jbproject.narapia.rest.dto.payload;

import lombok.Data;

@Data
public class WinbidDetailSearchPayload extends NaraSearchPayload {

    private int winbidDetailId;
    private String searchText;
}
