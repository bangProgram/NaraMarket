package com.jbproject.narapia.rest.dto.payload;

import lombok.Data;

@Data
public class WinbidSearchPayload extends NaraSearchPayload {

    private int winbidId;
    private String searchText;
}
