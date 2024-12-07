package com.jbproject.narapia.rest.service;

import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;

import java.util.List;

public interface BidNotiService {
    BidNotiResult searchBidnoti(BidNotiSearchPayload payload);
    List<WinbidAnalSearchResult> searchWinbidAnalList(WinbidAnalSearchPayload payload);
}
