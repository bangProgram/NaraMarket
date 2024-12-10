package com.jbproject.narapia.rest.service.impl;

import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.entity.BidRecordEntity;
import com.jbproject.narapia.rest.repository.BidRecordRepository;
import com.jbproject.narapia.rest.repository.CommCodeRepository;
import com.jbproject.narapia.rest.service.BidRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BidRecordServiceImpl implements BidRecordService {

    private final BidRecordRepository bidRecordRepository;

    public void cudBidRecord(BidRecordCudPayload payload) {
    }
}
