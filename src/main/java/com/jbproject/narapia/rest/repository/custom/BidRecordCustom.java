package com.jbproject.narapia.rest.repository.custom;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.payload.BidRecordSearchPayload;

import java.util.List;

public interface BidRecordCustom {

    List<BidRecordModel> getBidRecordList(BidRecordSearchPayload payload);
}
