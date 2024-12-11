package com.jbproject.narapia.rest.service;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.dto.payload.BidRecordSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidRecordResult;

import java.util.List;

public interface BidRecordService {
    void cudBidRecord(BidRecordCudPayload payload);
    BidRecordModel findById(Long id);
    List<BidRecordResult> getBidRecordList(BidRecordSearchPayload payload);
}
