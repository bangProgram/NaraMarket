package com.jbproject.narapia.rest.service;

import com.jbproject.narapia.rest.dto.payload.BidNotiSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidNotiResult;

public interface BidNotiService {
    BidNotiResult searchBidnoti(BidNotiSearchPayload payload);
}
