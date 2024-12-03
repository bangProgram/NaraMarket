package com.jbproject.narapia.rest.repository.custom.impl;

import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.repository.custom.WinbidCustom;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.NumberExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jbproject.narapia.rest.entity.QBidNotiEntity.bidNotiEntity;
import static com.jbproject.narapia.rest.entity.QBidNotiDetailEntity.bidNotiDetailEntity;
import static com.jbproject.narapia.rest.entity.QWinbidEntity.winbidEntity;
import static com.jbproject.narapia.rest.entity.QWinbidDetailEntity.winbidDetailEntity;

import static org.springframework.util.StringUtils.hasText;

@Repository
@Slf4j
@RequiredArgsConstructor
public class WinbidCustomImpl implements WinbidCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<WinBidAnalResult> searchWinbidAnalList(WinbidAnalSearchPayload payload){

        BooleanBuilder whereCondition = whereSearchWinbidAnalList(payload);

        return jpaQueryFactory.select(
                Projections.fields(
                        WinBidAnalResult.class
                        ,bidNotiEntity.id.bidNtceNo
                        ,bidNotiEntity.id.bidNtceOrd
                        ,bidNotiEntity.bidNtceNm
                        ,bidNotiEntity.ntceInsttCd
                        ,bidNotiEntity.ntceInsttNm
                        ,bidNotiEntity.dminsttCd
                        ,bidNotiEntity.dminsttNm
                        ,bidNotiEntity.bidMethdNm
                        ,bidNotiEntity.prearngPrceDcsnMthdNm
                        ,bidNotiDetailEntity.bssamt.coalesce(winbidDetailEntity.bssamt).as("bssamt")
                        ,bidNotiEntity.presmptPrce
                        ,bidNotiEntity.dtilPrdctClsfcNo
                        ,bidNotiEntity.dtilPrdctClsfcNoNm
                        ,bidNotiEntity.prdctQty
                        ,bidNotiEntity.prdctUprc
                        ,winbidEntity.sucsfbidAmt
                        ,winbidEntity.sucsfbidRate.as("sucsfbidLwltRate")
                        ,bidNotiDetailEntity.rsrvtnPrceRngBgnRate
                        ,bidNotiDetailEntity.rsrvtnPrceRngEndRate
                        ,bidNotiEntity.prdctQty.multiply(bidNotiEntity.prdctUprc).as("prdctAmt")
                        ,winbidEntity.sucsfbidAmt.divide(
                                bidNotiDetailEntity.bssamt.coalesce(winbidDetailEntity.bssamt)
                        ).divide(winbidEntity.sucsfbidRate).as("rsrvtnRate")
                )
        ).from(bidNotiEntity)
        .innerJoin(winbidEntity).on(
            bidNotiEntity.id.bidNtceNo.eq(winbidEntity.id.bidNtceNo)
            .and(bidNotiEntity.id.bidNtceOrd.eq(winbidEntity.id.bidNtceOrd))
        )
        .leftJoin(bidNotiDetailEntity).on(
            winbidEntity.id.bidNtceNo.eq(bidNotiDetailEntity.id.bidNtceNo)
            .and(winbidEntity.id.bidNtceOrd.eq(bidNotiDetailEntity.id.bidNtceOrd))
            .and(winbidEntity.id.bidClsfcNo.eq(bidNotiDetailEntity.id.bidClsfcNo))
        )
        .leftJoin(winbidDetailEntity).on(
                winbidEntity.id.bidNtceNo.eq(winbidDetailEntity.id.bidNtceNo)
                .and(winbidEntity.id.bidNtceOrd.eq(winbidDetailEntity.id.bidNtceOrd))
                .and(winbidEntity.id.bidClsfcNo.eq(winbidDetailEntity.id.bidClsfcNo))
        )
        .where(whereCondition)
        .fetch();
    }

    private BooleanBuilder whereSearchWinbidAnalList(WinbidAnalSearchPayload payload){
        BooleanBuilder where = new BooleanBuilder();

        if(hasText(payload.getDtilPrdctClsfcNo())){
            where.and(bidNotiEntity.dtilPrdctClsfcNo.eq(payload.getDtilPrdctClsfcNo()));
        }
        if(hasText(payload.getDtilPrdctClsfcNoNm())){
            where.and(bidNotiEntity.dtilPrdctClsfcNoNm.like("%"+payload.getDtilPrdctClsfcNoNm()+"%"));
        }
        if(hasText(payload.getNtceInsttCd())){
            where.and(bidNotiEntity.ntceInsttCd.eq(payload.getNtceInsttCd()));
        }
        if(hasText(payload.getDminsttCd())){
            where.and(bidNotiEntity.dminsttCd.eq(payload.getDminsttCd()));
        }

        return where;
    }
}
