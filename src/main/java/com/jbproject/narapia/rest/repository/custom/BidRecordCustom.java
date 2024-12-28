package com.jbproject.narapia.rest.repository.custom;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.payload.BidRecordSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.entity.BidRecordEntity;

import java.util.List;

public interface BidRecordCustom {

    List<BidRecordEntity> getLatestBidRecord(WinbidAnalSearchPayload payload);
    List<BidRecordModel> getBidRecordList(BidRecordSearchPayload payload);
}
