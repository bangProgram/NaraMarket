package com.jbproject.narapia.rest.repository.custom;

import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import com.jbproject.narapia.rest.entity.WinbidAnalEntity;

import java.util.List;

public interface WinbidAnalCustom  {
//    List<WinbidAnalEntity> searchWinbidAnalList(WinbidAnalSearchPayload payload);

    List<WinbidAnalSearchResult> searchWinbidAnalList(WinbidAnalSearchPayload payload);
}
