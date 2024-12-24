package com.jbproject.narapia.rest.repository.custom.impl;

import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.dto.result.WinbidAnalSearchResult;
import com.jbproject.narapia.rest.repository.custom.WinbidAnalCustom;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.SimpleTemplate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static com.jbproject.narapia.rest.entity.QWinbidAnalEntity.winbidAnalEntity;
import static com.jbproject.narapia.rest.entity.views.QPresmptPrceDminsttView.presmptPrceDminsttView;
import static com.jbproject.narapia.rest.entity.views.QPresmptPrceNtceinsttView.presmptPrceNtceinsttView;
import static org.springframework.util.StringUtils.hasText;

@Repository
@Slf4j
@RequiredArgsConstructor
public class WinbidAnalCustomImpl implements WinbidAnalCustom {

    private final JPAQueryFactory jpaQueryFactory;
    @PersistenceContext
    private EntityManager entityManager;

    public List<BssamtPerRateChartResult> getRsrvtnPrceRngChartList(String rsrvtnPrceRng, WinbidAnalSearchPayload payload) {

        BooleanBuilder whereCondition = new BooleanBuilder();

        if(hasText(rsrvtnPrceRng)){
           whereCondition.and(presmptPrceDminsttView.rsrvtnPrceRngRate.eq(rsrvtnPrceRng));
        }

        if(hasText(payload.getDminsttCd()) || hasText(payload.getDminsttNm())){
            if(hasText(payload.getDminsttCd())){
                whereCondition.and(presmptPrceDminsttView.key.dminsttCd.eq(payload.getDminsttCd()));
            }else if(hasText(payload.getDminsttNm())){
                whereCondition.and(presmptPrceDminsttView.dminsttNm.eq(payload.getDminsttNm()));
            }

            return jpaQueryFactory.select(
                            Projections.fields(
                                    BssamtPerRateChartResult.class
                                    ,presmptPrceDminsttView.key.presmptPrceGroup.as("xDataGroup")
                                    ,presmptPrceDminsttView.plnprcRate.as("yDataGroup")
                                    ,presmptPrceDminsttView.key.presmptPrceGroup.as("presmptPrceGroup")
                                    ,presmptPrceDminsttView.key.dminsttCd.as("dminsttCd")
                                    ,presmptPrceDminsttView.dminsttNm.as("dminsttNm")
                                    ,presmptPrceDminsttView.prtcptCnumAvg.as("prtcptCnumAvg")
                                    ,presmptPrceDminsttView.rsrvtnPrceRngRate.as("rsrvtnPrceRngRate")
                                    ,presmptPrceDminsttView.cnt.as("cnt")
                                    ,presmptPrceDminsttView.plnprcRate.as("plnprcRate")
                            )
                    ).from(presmptPrceDminsttView)
                    .where(whereCondition)
                    .orderBy(
                            presmptPrceDminsttView.key.dminsttCd.asc()
                            , presmptPrceDminsttView.key.presmptPrceGroup.asc()
                    )
                    .fetch();
        }else if(hasText(payload.getNtceInsttCd()) || hasText(payload.getNtceInsttNm())){
            if(hasText(payload.getDminsttCd())){
                whereCondition.and(presmptPrceNtceinsttView.key.dminsttCd.eq(payload.getNtceInsttCd()));
            }else if(hasText(payload.getDminsttNm())){
                whereCondition.and(presmptPrceNtceinsttView.dminsttNm.eq(payload.getNtceInsttNm()));
            }

            return jpaQueryFactory.select(
                            Projections.fields(
                                    BssamtPerRateChartResult.class
                                    ,presmptPrceNtceinsttView.key.presmptPrceGroup.as("xDataGroup")
                                    ,presmptPrceNtceinsttView.plnprcRate.as("yDataGroup")
                                    ,presmptPrceNtceinsttView.key.presmptPrceGroup.as("presmptPrceGroup")
                                    ,presmptPrceNtceinsttView.key.dminsttCd.as("dminsttCd")
                                    ,presmptPrceNtceinsttView.dminsttNm.as("dminsttNm")
                                    ,presmptPrceNtceinsttView.prtcptCnumAvg.as("prtcptCnumAvg")
                                    ,presmptPrceNtceinsttView.rsrvtnPrceRngRate.as("rsrvtnPrceRngRate")
                                    ,presmptPrceNtceinsttView.cnt.as("cnt")
                                    ,presmptPrceNtceinsttView.plnprcRate.as("plnprcRate")
                            )
                    ).from(presmptPrceNtceinsttView)
                    .where(whereCondition)
                    .orderBy(
                            presmptPrceNtceinsttView.key.dminsttCd.asc()
                            , presmptPrceNtceinsttView.key.presmptPrceGroup.asc()
                    )
                    .fetch();
        }else{
            whereCondition.and(presmptPrceDminsttView.key.dminsttCd.eq("ALL"));

            return jpaQueryFactory.select(
                    Projections.fields(
                            BssamtPerRateChartResult.class
                            ,presmptPrceDminsttView.key.presmptPrceGroup.as("xDataGroup")
                            ,presmptPrceDminsttView.plnprcRate.as("yDataGroup")
                            ,presmptPrceDminsttView.key.presmptPrceGroup.as("presmptPrceGroup")
                            ,presmptPrceDminsttView.key.dminsttCd.as("dminsttCd")
                            ,presmptPrceDminsttView.dminsttNm.as("dminsttNm")
                            ,presmptPrceDminsttView.prtcptCnumAvg.as("prtcptCnumAvg")
                            ,presmptPrceDminsttView.rsrvtnPrceRngRate.as("rsrvtnPrceRngRate")
                            ,presmptPrceDminsttView.cnt.as("cnt")
                            ,presmptPrceDminsttView.plnprcRate.as("plnprcRate")
                    )
            ).from(presmptPrceDminsttView)
            .where(whereCondition)
            .orderBy(
                    presmptPrceDminsttView.key.dminsttCd.asc()
                    , presmptPrceDminsttView.key.presmptPrceGroup.asc()
            )
            .fetch();
        }
    }

    public List<WinBidAnalModel> getListToChartData(WinbidAnalSearchPayload payload){
        BooleanBuilder whereCondition = new BooleanBuilder();

        if(hasText(payload.getDminsttCd())){
            whereCondition.and(winbidAnalEntity.dminsttCd.eq(payload.getDminsttCd()));
        }else if(hasText(payload.getDminsttNm())){
            whereCondition.and(winbidAnalEntity.dminsttNm.eq(payload.getDminsttNm()));
        }else if(hasText(payload.getNtceInsttCd())){
            whereCondition.and(winbidAnalEntity.ntceInsttCd.eq(payload.getNtceInsttCd()));
        }else if(hasText(payload.getNtceInsttNm())){
            whereCondition.and(winbidAnalEntity.ntceInsttNm.eq(payload.getNtceInsttNm()));
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
