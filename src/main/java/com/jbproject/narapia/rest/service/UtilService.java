package com.jbproject.narapia.rest.service;

import com.jbproject.narapia.rest.dto.payload.BidNotiDetailSearchPayload;
import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidDetailSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidSearchPayload;

public interface UtilService {

    void saveWinbid(WinbidSearchPayload payload) throws Exception;
    void saveWinbidDetail(WinbidDetailSearchPayload payload) throws Exception;
    void saveBidNoti(BidNotiSearchPayload payload) throws Exception;
    void saveBidNotiDetail(BidNotiDetailSearchPayload payload) throws Exception;
}
