package com.jbproject.narapia.rest.repository.custom.impl;

import com.jbproject.narapia.rest.dto.model.BidRecordModel;
import com.jbproject.narapia.rest.dto.payload.BidRecordSearchPayload;
import com.jbproject.narapia.rest.repository.custom.BidRecordCustom;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import groovy.util.logging.Slf4j;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.util.StringUtils.hasText;
import static com.jbproject.narapia.rest.entity.QBidRecordEntity.bidRecordEntity;

@Repository
@Slf4j
@RequiredArgsConstructor
public class BidRecordCustomImpl implements BidRecordCustom {

    private final JPAQueryFactory jpaQueryFactory;


    public List<BidRecordModel> getBidRecordList(BidRecordSearchPayload payload){
        BooleanBuilder whereCondition = whereBidRecordList(payload);

        return jpaQueryFactory.select(
                Projections.fields(
                        BidRecordModel.class
                        ,bidRecordEntity.id.as("id")
                        ,bidRecordEntity.marketCd.as("marketCd")
                        ,bidRecordEntity.bidNtceNo.as("bidNtceNo")
                        ,bidRecordEntity.bidNtceOrd.as("bidNtceOrd")
                        ,bidRecordEntity.bidClsfcNo.as("bidClsfcNo")
                        ,bidRecordEntity.bidNtceNm.as("bidNtceNm")
                        ,bidRecordEntity.ntceInsttCd.as("ntceInsttCd")
                        ,bidRecordEntity.ntceInsttNm.as("ntceInsttNm")
                        ,bidRecordEntity.dminsttCd.as("dminsttCd")
                        ,bidRecordEntity.dminsttNm.as("dminsttNm")
                        ,bidRecordEntity.bssamt.as("bssamt")
                        ,bidRecordEntity.presmptPrce.as("presmptPrce")
                        ,bidRecordEntity.rsrvtnPrceRngRate.as("rsrvtnPrceRngRate")
                        ,bidRecordEntity.marketNm.as("marketNm")
                        ,bidRecordEntity.expectAmt.as("expectAmt")
                        ,bidRecordEntity.sucsfbidAmt.as("sucsfbidAmt")
                        ,bidRecordEntity.bidAmt.as("bidAmt")
                        ,bidRecordEntity.sucsfbidRank.as("sucsfbidRank")
                        ,bidRecordEntity.bidAmtDiff.as("bidAmtDiff")
                        ,bidRecordEntity.sucsfbidLwltRate.as("sucsfbidLwltRate")
                        ,bidRecordEntity.bidAmtRate.as("bidAmtRate")
                        ,bidRecordEntity.sucsfbidAmtRate.as("sucsfbidAmtRate")
                )
        ).from(bidRecordEntity)
        .where(whereCondition)
        .orderBy(bidRecordEntity.createDttm.desc())
        .fetch();
    }

    BooleanBuilder whereBidRecordList(BidRecordSearchPayload payload){
        BooleanBuilder where = new BooleanBuilder();

        if(hasText(payload.getBidNtceNo())){
            where.and(bidRecordEntity.bidNtceNo.like("%"+payload.getBidNtceNo()+"%"));
        }
        if(hasText(payload.getMarketCd())){
            where.and(bidRecordEntity.marketCd.eq(payload.getMarketCd()));
        }
        if(hasText(payload.getNtceInsttCd())){
            where.and(bidRecordEntity.ntceInsttCd.eq(payload.getNtceInsttCd()));
        }
        if(hasText(payload.getDminsttCd())){
            where.and(bidRecordEntity.dminsttCd.eq(payload.getDminsttCd()));
        }

        return where;
    }
}
