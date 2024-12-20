package com.jbproject.narapia.rest.entity.views;

import com.jbproject.narapia.rest.entity.keys.BssamtPerRatekey;
import groovy.transform.Immutable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Subselect;


@Subselect(
        "select \r\n" +
                "'ALL' as dminstt_cd\r\n" +
                ", '전체' as dminstt_nm\r\n" +
                ",CASE \r\n" +
                "    WHEN bssamt <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< bssamt and bssamt <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< bssamt and bssamt <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< bssamt and bssamt <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< bssamt and bssamt <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< bssamt and bssamt <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< bssamt and bssamt <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< bssamt and bssamt <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< bssamt and bssamt <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< bssamt and bssamt <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< bssamt and bssamt <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< bssamt and bssamt <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< bssamt and bssamt <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< bssamt and bssamt <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< bssamt and bssamt <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< bssamt and bssamt <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< bssamt and bssamt <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< bssamt and bssamt <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< bssamt and bssamt <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< bssamt and bssamt <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "END AS bssamt_group \r\n" +
                ", avg(twar.prtcpt_cnum) as prtcpt_cnum_avg\r\n" +
                ", replace(rsrvtn_prce_rng_bgn_rate,'-','') as rsrvtn_prce_rng_rate\r\n" +
                ", count(1) as cnt, avg(plnprc_rate) as plnprc_rate\r\n" +
                "from tb_winbid_anal_real twar\r\n" +
                "where 1=1\r\n" +
                "-- and replace(rsrvtn_prce_rng_bgn_rate,'-','') = '2' \r\n" +
                "group by \r\n" +
                "replace(rsrvtn_prce_rng_bgn_rate,'-',''),\r\n" +
                "CASE \r\n" +
                "    WHEN bssamt <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< bssamt and bssamt <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< bssamt and bssamt <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< bssamt and bssamt <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< bssamt and bssamt <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< bssamt and bssamt <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< bssamt and bssamt <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< bssamt and bssamt <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< bssamt and bssamt <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< bssamt and bssamt <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< bssamt and bssamt <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< bssamt and bssamt <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< bssamt and bssamt <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< bssamt and bssamt <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< bssamt and bssamt <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< bssamt and bssamt <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< bssamt and bssamt <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< bssamt and bssamt <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< bssamt and bssamt <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< bssamt and bssamt <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "end\r\n" +
                "union all\r\n" +
                "select \r\n" +
                "twar.dminstt_cd as dinstt_cd\r\n" +
                ", twar.dminstt_nm  as dminstt_nm\r\n" +
                ",CASE \r\n" +
                "    WHEN bssamt <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< bssamt and bssamt <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< bssamt and bssamt <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< bssamt and bssamt <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< bssamt and bssamt <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< bssamt and bssamt <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< bssamt and bssamt <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< bssamt and bssamt <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< bssamt and bssamt <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< bssamt and bssamt <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< bssamt and bssamt <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< bssamt and bssamt <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< bssamt and bssamt <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< bssamt and bssamt <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< bssamt and bssamt <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< bssamt and bssamt <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< bssamt and bssamt <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< bssamt and bssamt <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< bssamt and bssamt <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< bssamt and bssamt <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "END AS bssamt_group \r\n" +
                ", avg(twar.prtcpt_cnum) as prtcpt_cnum_avg\r\n" +
                ", replace(rsrvtn_prce_rng_bgn_rate,'-','') as rsrvtn_prce_rng_rate\r\n" +
                ", count(1) as cnt, avg(plnprc_rate) as plnprc_rate\r\n" +
                "from tb_winbid_anal_real twar\r\n" +
                "where 1=1\r\n" +
                "-- and replace(rsrvtn_prce_rng_bgn_rate,'-','') = '2' \r\n" +
                "group by \r\n" +
                "replace(rsrvtn_prce_rng_bgn_rate,'-',''),\r\n" +
                "CASE \r\n" +
                "    WHEN bssamt <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< bssamt and bssamt <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< bssamt and bssamt <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< bssamt and bssamt <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< bssamt and bssamt <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< bssamt and bssamt <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< bssamt and bssamt <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< bssamt and bssamt <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< bssamt and bssamt <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< bssamt and bssamt <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< bssamt and bssamt <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< bssamt and bssamt <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< bssamt and bssamt <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< bssamt and bssamt <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< bssamt and bssamt <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< bssamt and bssamt <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< bssamt and bssamt <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< bssamt and bssamt <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< bssamt and bssamt <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< bssamt and bssamt <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "end,\r\n" +
                "twar.dminstt_cd, twar.dminstt_nm\r\n" +
                "order by dminstt_cd, bssamt_group"
)
@Entity
@Immutable
@Getter
@Setter
public class BssamtPerRateView {

    @EmbeddedId
    private BssamtPerRatekey bssamtPerRatekey;

    private String dminsttNm;
    private Double prtcptCnumAvg;
    private String rsrvtnPrceRngRate;
    private Long cnt;
    private Double plnprcRate;

}
