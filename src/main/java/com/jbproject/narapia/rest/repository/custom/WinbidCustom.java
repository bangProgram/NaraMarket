package com.jbproject.narapia.rest.repository.custom;

import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;

import java.util.List;

public interface WinbidCustom {
    List<WinBidAnalModel> searchWinbidAnalList();
}
