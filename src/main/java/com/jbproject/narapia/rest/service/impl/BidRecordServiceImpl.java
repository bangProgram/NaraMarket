package com.jbproject.narapia.rest.service.impl;

import com.jbproject.narapia.rest.constants.ServerErrorConstant;
import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.payload.BidRecordCudPayload;
import com.jbproject.narapia.rest.dto.payload.BidRecordSearchPayload;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BidRecordResult;
import com.jbproject.narapia.rest.entity.BidRecordEntity;
import com.jbproject.narapia.rest.exception.ExceptionProvider;
import com.jbproject.narapia.rest.repository.BidRecordRepository;
import com.jbproject.narapia.rest.repository.CommCodeRepository;
import com.jbproject.narapia.rest.service.BidRecordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ServerErrorException;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class BidRecordServiceImpl implements BidRecordService {

    private final BidRecordRepository bidRecordRepository;

    public BidRecordModel findById(Long id) {
        BidRecordEntity entity = bidRecordRepository.findById(id).orElseThrow(
                () -> new ExceptionProvider(ServerErrorConstant.BIDNOTI_RECORD_400_01)
        );
        return new BidRecordModel(entity);
    }

    public List<BidRecordResult> getBidRecordList(BidRecordSearchPayload payload){
        return bidRecordRepository.getBidRecordList(payload).stream().map(BidRecordResult::create).toList();
    }

    public void cudBidRecord(BidRecordCudPayload payload) {

        if(payload.getId() != null){
            BidRecordEntity curEntity = bidRecordRepository.findById(payload.getId()).orElseThrow(
                    () -> new ExceptionProvider(ServerErrorConstant.BIDNOTI_RECORD_400_01)
            );
            curEntity.update(payload);

            bidRecordRepository.save(curEntity);
        }else{
            BidRecordEntity newEntity = BidRecordEntity.builder()
                    .marketCd(payload.getMarketCd())
                    .bidNtceNo(payload.getBidNtceNo())
                    .bidNtceOrd(payload.getBidNtceOrd())
                    .bidClsfcNo(payload.getBidClsfcNo())
                    .bidNtceNm(payload.getBidNtceNm())
                    .ntceInsttCd(payload.getNtceInsttCd())
                    .ntceInsttNm(payload.getNtceInsttNm())
                    .dminsttCd(payload.getDminsttCd())
                    .dminsttNm(payload.getDminsttNm())
                    .bssamt(payload.getBssamt())
                    .presmptPrce(payload.getPresmptPrce())
                    .rsrvtnPrceRngRate(payload.getRsrvtnPrceRngRate())
                    .marketNm(payload.getMarketNm())
                    .expectAmt(payload.getExpectAmt())
                    .sucsfbidAmt(payload.getSucsfbidAmt())
                    .bidAmt(payload.getBidAmt())
                    .sucsfbidRank(payload.getSucsfbidRank())
                    .bidAmtDiff(payload.getBidAmtDiff())
                    .sucsfbidLwltRate(payload.getSucsfbidLwltRate())
                    .bidAmtRate(payload.getBidAmtRate())
                    .sucsfbidAmtRate(payload.getSucsfbidAmtRate())
                    .build();

            bidRecordRepository.save(newEntity);
        }


    }

    public List<BidRecordModel> getLatestBidRecord(WinbidAnalSearchPayload payload){
        return bidRecordRepository.getLatestBidRecord(payload).stream().map(BidRecordModel::create).toList();
    }
}
