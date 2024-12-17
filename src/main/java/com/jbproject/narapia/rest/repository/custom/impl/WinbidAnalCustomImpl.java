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
import static com.jbproject.narapia.rest.entity.views.QBssamrPerRateView.bssamrPerRateView;
import static org.springframework.util.StringUtils.hasText;

@Repository
@Slf4j
@RequiredArgsConstructor
public class WinbidAnalCustomImpl implements WinbidAnalCustom {

    private final JPAQueryFactory jpaQueryFactory;
    @PersistenceContext
    private EntityManager entityManager;

    public List<BssamtPerRateChartResult> getRsrvtnPrceRngChartList(String rsrvtnPrceRng) {
        return jpaQueryFactory.select(
                        Projections.fields(
                                BssamtPerRateChartResult.class
                                ,bssamrPerRateView.bssamtGroup.as("bssamtGroup")
                                ,bssamrPerRateView.prtcptCnumAvg.as("prtcptCnumAvg")
                                ,bssamrPerRateView.rsrvtnPrceRngRate.as("rsrvtnPrceRngRate")
                                ,bssamrPerRateView.cnt.as("cnt")
                                ,bssamrPerRateView.plnprcRate.as("plnprcRate")
                        )
                ).from(bssamrPerRateView)
                .where(
                        bssamrPerRateView.rsrvtnPrceRngRate.eq(rsrvtnPrceRng)
                )
                .orderBy(bssamrPerRateView.bssamtGroup.asc())
                .fetch();
    }

    public List<WinBidAnalModel> getListToChartData(WinbidAnalSearchPayload payload){
        BooleanBuilder whereCondition = new BooleanBuilder();

        if(hasText(payload.getDminsttCd())){
            whereCondition.and(winbidAnalEntity.dminsttCd.eq(payload.getDminsttCd()));
        }else{
            whereCondition.and(winbidAnalEntity.dminsttCd.eq("6280000"));
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

    public List<BssamtPerRateChartResult> getRsrvtnPrceRngChartList2(String dminsttCd, String rsrvtnPrceRngRate ){

        String sql = "select  \r\n"+
                "CASE \r\n" +
                "WHEN bssamt <= 10000000 THEN '0.1억' \r\n" +
                "WHEN 10000000< bssamt and bssamt <= 20000000 THEN '0.2억' \r\n" +
                "WHEN 20000000< bssamt and bssamt <= 30000000 THEN '0.3억' \r\n" +
                "WHEN 30000000< bssamt and bssamt <= 40000000 THEN '0.4억' \r\n" +
                "WHEN 40000000< bssamt and bssamt <= 50000000 THEN '0.5억' \r\n" +
                "WHEN 50000000< bssamt and bssamt <= 60000000 THEN '0.6억' \r\n" +
                "WHEN 60000000< bssamt and bssamt <= 70000000 THEN '0.7억' \r\n" +
                "WHEN 70000000< bssamt and bssamt <= 80000000 THEN '0.8억' \r\n" +
                "WHEN 80000000< bssamt and bssamt <= 90000000 THEN '0.9억' \r\n" +
                "WHEN 90000000< bssamt and bssamt <= 100000000 THEN '1.0억' \r\n" +
                "WHEN 100000000< bssamt and bssamt <= 110000000 THEN '1.1억' \r\n" +
                "WHEN 110000000< bssamt and bssamt <= 120000000 THEN '1.2억' \r\n" +
                "WHEN 120000000< bssamt and bssamt <= 130000000 THEN '1.3억' \r\n" +
                "WHEN 130000000< bssamt and bssamt <= 140000000 THEN '1.4억' \r\n" +
                "WHEN 140000000< bssamt and bssamt <= 150000000 THEN '1.5억' \r\n" +
                "WHEN 150000000< bssamt and bssamt <= 160000000 THEN '1.6억' \r\n" +
                "WHEN 160000000< bssamt and bssamt <= 170000000 THEN '1.7억' \r\n" +
                "WHEN 170000000< bssamt and bssamt <= 180000000 THEN '1.8억' \r\n" +
                "WHEN 180000000< bssamt and bssamt <= 190000000 THEN '1.9억' \r\n" +
                "WHEN 190000000< bssamt and bssamt <= 200000000 THEN '2.0억' \r\n" +
                "ELSE '2.0억 초과' \r\n" +
                "END AS bssamtGroup \r\n" +
                ", avg(twar.prtcpt_cnum) as prtcptCnumAvg, replace(rsrvtn_prce_rng_bgn_rate,'-','') as rsrvtnPrceRngRate, count(1) as cnt, avg(plnprc_rate) as plnprcRate \r\n" +
                "from tb_winbid_anal_real twar \r\n" +
                "where  (:dminsttCd IS NULL OR twar.dminstt_cd = :dminsttCd) \r\n"+
                "and replace(rsrvtn_prce_rng_bgn_rate, '-', '') = :rsrvtnPrceRngRate \r\n"+
                "group by \r\n" +
                "replace(rsrvtn_prce_rng_bgn_rate,'-',''), \r\n" +
                "CASE \r\n" +
                "WHEN bssamt <= 10000000 THEN '0.1억' \r\n" +
                "WHEN 10000000< bssamt and bssamt <= 20000000 THEN '0.2억' \r\n" +
                "WHEN 20000000< bssamt and bssamt <= 30000000 THEN '0.3억' \r\n" +
                "WHEN 30000000< bssamt and bssamt <= 40000000 THEN '0.4억' \r\n" +
                "WHEN 40000000< bssamt and bssamt <= 50000000 THEN '0.5억' \r\n" +
                "WHEN 50000000< bssamt and bssamt <= 60000000 THEN '0.6억' \r\n" +
                "WHEN 60000000< bssamt and bssamt <= 70000000 THEN '0.7억' \r\n" +
                "WHEN 70000000< bssamt and bssamt <= 80000000 THEN '0.8억' \r\n" +
                "WHEN 80000000< bssamt and bssamt <= 90000000 THEN '0.9억' \r\n" +
                "WHEN 90000000< bssamt and bssamt <= 100000000 THEN '1.0억' \r\n" +
                "WHEN 100000000< bssamt and bssamt <= 110000000 THEN '1.1억' \r\n" +
                "WHEN 110000000< bssamt and bssamt <= 120000000 THEN '1.2억' \r\n" +
                "WHEN 120000000< bssamt and bssamt <= 130000000 THEN '1.3억' \r\n" +
                "WHEN 130000000< bssamt and bssamt <= 140000000 THEN '1.4억' \r\n" +
                "WHEN 140000000< bssamt and bssamt <= 150000000 THEN '1.5억' \r\n" +
                "WHEN 150000000< bssamt and bssamt <= 160000000 THEN '1.6억' \r\n" +
                "WHEN 160000000< bssamt and bssamt <= 170000000 THEN '1.7억' \r\n" +
                "WHEN 170000000< bssamt and bssamt <= 180000000 THEN '1.8억' \r\n" +
                "WHEN 180000000< bssamt and bssamt <= 190000000 THEN '1.9억' \r\n" +
                "WHEN 190000000< bssamt and bssamt <= 200000000 THEN '2.0억' \r\n" +
                "ELSE '2.0억 초과' \r\n" +
                "end \r\n" +
                "order by bssamtGroup";


                List<BssamtPerRateChartResult> resultList = entityManager
                .createQuery(sql, BssamtPerRateChartResult.class)
                .setParameter("dminsttCd", dminsttCd)
                .setParameter("rsrvtnPrceRngRate", rsrvtnPrceRngRate)
                .getResultList();

                return resultList;
    }

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
