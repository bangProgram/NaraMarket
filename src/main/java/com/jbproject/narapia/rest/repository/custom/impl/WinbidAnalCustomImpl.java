package com.jbproject.narapia.rest.repository.custom.impl;

import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import com.jbproject.narapia.rest.dto.model.WinbidModel;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.WinBidAnalResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import com.jbproject.narapia.rest.entity.WinbidAnalEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidAnalKey;
import com.jbproject.narapia.rest.repository.custom.WinbidAnalCustom;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Expression;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.TemplateExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.SimpleTemplate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static com.jbproject.narapia.rest.entity.QBidNotiEntity.bidNotiEntity;
import static com.jbproject.narapia.rest.entity.QWinbidAnalEntity.winbidAnalEntity;
import static org.springframework.util.StringUtils.hasText;

@Repository
@Slf4j
@RequiredArgsConstructor
public class WinbidAnalCustomImpl implements WinbidAnalCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public List<WinBidAnalModel> getListToChartData(WinbidAnalSearchPayload payload){
        BooleanBuilder whereCondition = new BooleanBuilder();

        if(hasText(payload.getDminsttCd())){
            whereCondition.and(winbidAnalEntity.dminsttCd.eq(payload.getDminsttCd()));
        }

        return jpaQueryFactory.select(
                Projections.fields(
                        WinBidAnalModel.class
                        ,winbidAnalEntity.opengDt.as("opengDt")
                        ,winbidAnalEntity.rsrvtnPrceRngBgnRate.as("rsrvtnPrceRngBgnRate")
                        ,winbidAnalEntity.rsrvtnPrceRngEndRate.as("rsrvtnPrceRngEndRate")
                        ,winbidAnalEntity.plnprcRate.as("plnprcRate")
                )
        ).from(winbidAnalEntity)
        .where(whereCondition)
        .orderBy(winbidAnalEntity.opengDt.asc())
        .fetch();


    }

    public List<WinBidAnalModel> getListByRsrvtnAndBssAmt(WinbidAnalSearchPayload payload){
        return null;
    }

    /*
        public List<WinbidAnalEntity> searchWinbidAnalList(WinbidAnalSearchPayload payload){
            BooleanBuilder whereCondition = whereSearchWinbidAnalList(payload);

            return jpaQueryFactory.select(
                    Projections.fields(WinbidAnalEntity.class,
                        Projections.fields(WinbidAnalKey.class,
                                winbidAnalEntity.id.bidNtceNo,
                                winbidAnalEntity.id.bidNtceOrd,
                                winbidAnalEntity.id.bidClsfcNo
                        ).as("id"),
                        winbidAnalEntity.bidNtceNm,
                        winbidAnalEntity.ntceInsttCd,
                        winbidAnalEntity.ntceInsttNm,
                        winbidAnalEntity.dminsttCd,
                        winbidAnalEntity.dminsttNm,
                        winbidAnalEntity.bidMethdNm,
                        winbidAnalEntity.prearngPrceDcsnMthdNm,
                        winbidAnalEntity.opengDt,
                        winbidAnalEntity.dtilPrdctClsfcNo,
                        winbidAnalEntity.dtilPrdctClsfcNoNm,
                        winbidAnalEntity.prdctQty,
                        winbidAnalEntity.prdctUprc,
                        winbidAnalEntity.prdctAmt,
                        winbidAnalEntity.bssamt,
                        winbidAnalEntity.presmptPrce,
                        winbidAnalEntity.presmptBssamt,
                        winbidAnalEntity.sucsfbidAmt,
                        winbidAnalEntity.sucsfbidLwltRate,
                        winbidAnalEntity.rsrvtnPrceRngBgnRate,
                        winbidAnalEntity.rsrvtnPrceRngEndRate,
                        winbidAnalEntity.bssamtRate,
                        winbidAnalEntity.presmptRate
                    )
            ).from(winbidAnalEntity)
            .where(whereCondition)
            .fetch();
    }
    */

    private static BooleanBuilder whereSearchWinbidAnalList(WinbidAnalSearchPayload payload){
        BooleanBuilder where = new BooleanBuilder();

        if(hasText(payload.getDtilPrdctClsfcNo())){
            where.and(winbidAnalEntity.dtilPrdctClsfcNo.eq(payload.getDtilPrdctClsfcNo()));
        }
        if(hasText(payload.getDtilPrdctClsfcNoNm())){
            where.and(winbidAnalEntity.dtilPrdctClsfcNoNm.like("%"+payload.getDtilPrdctClsfcNoNm()+"%"));
        }
        if(hasText(payload.getNtceInsttCd())){
            where.and(winbidAnalEntity.ntceInsttCd.eq(payload.getNtceInsttCd()));
        }
        if(hasText(payload.getDminsttCd())){
            where.and(winbidAnalEntity.dminsttCd.eq(payload.getDminsttCd()));
        }

        if(payload.getBssamtRate() != null){
            int pow = Integer.parseInt(payload.getRateLevel());

            Double dwValue = payload.getBssamtRate() - (5 * Math.pow(10, -pow));
            double upValue = payload.getBssamtRate() + (5 * Math.pow(10, -pow));
            BigDecimal roundedNumber = new BigDecimal(upValue).setScale(pow, RoundingMode.HALF_UP);

            where.and(winbidAnalEntity.bssamtRate.between(dwValue,roundedNumber));
        }else{
            where.and(winbidAnalEntity.bssamtRate.between(99D,101D));
        }

        return where;
    }


    public List<WinbidAnalSearchResult> searchWinbidAnalList(WinbidAnalSearchPayload payload) {

        int level = Integer.valueOf(payload.getRateLevel());

        SimpleTemplate<Double> roundField = Expressions.template(Double.class, "ROUND({0},{1})",winbidAnalEntity.bssamtRate,level);

        List<WinbidAnalSearchResult> results = jpaQueryFactory.select(
                Projections.fields(
                        WinbidAnalSearchResult.class
                        , roundField.as("bssamtRateData"),
                        winbidAnalEntity.count().as("rateCount")
                )
        ).from(winbidAnalEntity)
        .where(
                winbidAnalEntity.bssamtRate.ne(0D)
                .and(whereSearchWinbidAnalList(payload))
        )
        .groupBy(roundField)
        .fetch();

        for(WinbidAnalSearchResult result : results){
            BigDecimal value = new BigDecimal(result.getBssamtRateData());
            System.out.println("newValue : "+value.setScale(level, RoundingMode.HALF_UP));
            result.setBssamtRate(value.setScale(level, RoundingMode.HALF_UP));
        }

        results.sort(Comparator.comparingDouble(WinbidAnalSearchResult::getBssamtRateData));

        return results;
    }
}
