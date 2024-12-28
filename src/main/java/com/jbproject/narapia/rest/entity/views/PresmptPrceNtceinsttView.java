package com.jbproject.narapia.rest.entity.views;

import com.jbproject.narapia.rest.entity.keys.PresmptPrceDminsttKey;
import com.jbproject.narapia.rest.entity.keys.PresmptPrceNtceinsttKey;
import groovy.transform.Immutable;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Subselect;


@Subselect(
        "select \r\n" +
                "'ALL' as ntce_instt_cd\r\n" +
                ", '전체' as ntce_instt_nm\r\n" +
                ",CASE \r\n" +
                "    WHEN presmpt_prce <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< presmpt_prce and presmpt_prce <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< presmpt_prce and presmpt_prce <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< presmpt_prce and presmpt_prce <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< presmpt_prce and presmpt_prce <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< presmpt_prce and presmpt_prce <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< presmpt_prce and presmpt_prce <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< presmpt_prce and presmpt_prce <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< presmpt_prce and presmpt_prce <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< presmpt_prce and presmpt_prce <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< presmpt_prce and presmpt_prce <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< presmpt_prce and presmpt_prce <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< presmpt_prce and presmpt_prce <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< presmpt_prce and presmpt_prce <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< presmpt_prce and presmpt_prce <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< presmpt_prce and presmpt_prce <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< presmpt_prce and presmpt_prce <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< presmpt_prce and presmpt_prce <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< presmpt_prce and presmpt_prce <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< presmpt_prce and presmpt_prce <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "END AS presmpt_prce_group \r\n" +
                ", avg(twar.prtcpt_cnum) as prtcpt_cnum_avg\r\n" +
                ", replace(rsrvtn_prce_rng_bgn_rate,'-','') as rsrvtn_prce_rng_rate\r\n" +
                ", count(1) as cnt, avg(plnprc_rate) as plnprc_rate\r\n" +
                "from tb_winbid_anal_real twar\r\n" +
                "where 1=1\r\n" +
                "group by \r\n" +
                "replace(rsrvtn_prce_rng_bgn_rate,'-',''),\r\n" +
                "CASE \r\n" +
                "    WHEN presmpt_prce <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< presmpt_prce and presmpt_prce <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< presmpt_prce and presmpt_prce <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< presmpt_prce and presmpt_prce <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< presmpt_prce and presmpt_prce <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< presmpt_prce and presmpt_prce <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< presmpt_prce and presmpt_prce <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< presmpt_prce and presmpt_prce <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< presmpt_prce and presmpt_prce <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< presmpt_prce and presmpt_prce <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< presmpt_prce and presmpt_prce <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< presmpt_prce and presmpt_prce <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< presmpt_prce and presmpt_prce <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< presmpt_prce and presmpt_prce <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< presmpt_prce and presmpt_prce <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< presmpt_prce and presmpt_prce <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< presmpt_prce and presmpt_prce <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< presmpt_prce and presmpt_prce <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< presmpt_prce and presmpt_prce <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< presmpt_prce and presmpt_prce <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "end\r\n" +
                "union all\r\n" +
                "select \r\n" +
                "twar.ntce_instt_cd\r\n" +
                ", twar.ntce_instt_nm\r\n" +
                ",CASE \r\n" +
                "    WHEN presmpt_prce <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< presmpt_prce and presmpt_prce <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< presmpt_prce and presmpt_prce <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< presmpt_prce and presmpt_prce <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< presmpt_prce and presmpt_prce <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< presmpt_prce and presmpt_prce <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< presmpt_prce and presmpt_prce <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< presmpt_prce and presmpt_prce <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< presmpt_prce and presmpt_prce <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< presmpt_prce and presmpt_prce <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< presmpt_prce and presmpt_prce <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< presmpt_prce and presmpt_prce <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< presmpt_prce and presmpt_prce <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< presmpt_prce and presmpt_prce <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< presmpt_prce and presmpt_prce <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< presmpt_prce and presmpt_prce <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< presmpt_prce and presmpt_prce <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< presmpt_prce and presmpt_prce <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< presmpt_prce and presmpt_prce <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< presmpt_prce and presmpt_prce <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "END AS presmpt_prce_group \r\n" +
                ", avg(twar.prtcpt_cnum) as prtcpt_cnum_avg\r\n" +
                ", replace(rsrvtn_prce_rng_bgn_rate,'-','') as rsrvtn_prce_rng_rate\r\n" +
                ", count(1) as cnt, avg(plnprc_rate) as plnprc_rate\r\n" +
                "from tb_winbid_anal_real twar\r\n" +
                "where 1=1\r\n" +
                "group by \r\n" +
                "replace(rsrvtn_prce_rng_bgn_rate,'-',''),\r\n" +
                "CASE \r\n" +
                "    WHEN presmpt_prce <= 10000000 THEN '0.1억 이하'\r\n" +
                "    WHEN 10000000< presmpt_prce and presmpt_prce <= 20000000 THEN '0.2억 이하'\r\n" +
                "    WHEN 20000000< presmpt_prce and presmpt_prce <= 30000000 THEN '0.3억 이하'\r\n" +
                "    WHEN 30000000< presmpt_prce and presmpt_prce <= 40000000 THEN '0.4억 이하'\r\n" +
                "    WHEN 40000000< presmpt_prce and presmpt_prce <= 50000000 THEN '0.5억 이하'\r\n" +
                "    WHEN 50000000< presmpt_prce and presmpt_prce <= 60000000 THEN '0.6억 이하'\r\n" +
                "    WHEN 60000000< presmpt_prce and presmpt_prce <= 70000000 THEN '0.7억 이하'\r\n" +
                "    WHEN 70000000< presmpt_prce and presmpt_prce <= 80000000 THEN '0.8억 이하'\r\n" +
                "    WHEN 80000000< presmpt_prce and presmpt_prce <= 90000000 THEN '0.9억 이하'\r\n" +
                "    WHEN 90000000< presmpt_prce and presmpt_prce <= 100000000 THEN '1.0억 이하'\r\n" +
                "    WHEN 100000000< presmpt_prce and presmpt_prce <= 110000000 THEN '1.1억 이하'\r\n" +
                "    WHEN 110000000< presmpt_prce and presmpt_prce <= 120000000 THEN '1.2억 이하'\r\n" +
                "    WHEN 120000000< presmpt_prce and presmpt_prce <= 130000000 THEN '1.3억 이하'\r\n" +
                "    WHEN 130000000< presmpt_prce and presmpt_prce <= 140000000 THEN '1.4억 이하'\r\n" +
                "    WHEN 140000000< presmpt_prce and presmpt_prce <= 150000000 THEN '1.5억 이하'\r\n" +
                "    WHEN 150000000< presmpt_prce and presmpt_prce <= 160000000 THEN '1.6억 이하'\r\n" +
                "    WHEN 160000000< presmpt_prce and presmpt_prce <= 170000000 THEN '1.7억 이하'\r\n" +
                "    WHEN 170000000< presmpt_prce and presmpt_prce <= 180000000 THEN '1.8억 이하'\r\n" +
                "    WHEN 180000000< presmpt_prce and presmpt_prce <= 190000000 THEN '1.9억 이하'\r\n" +
                "    WHEN 190000000< presmpt_prce and presmpt_prce <= 200000000 THEN '2.0억 이하'\r\n" +
                "    ELSE '2.0억 초과'\r\n" +
                "end,\r\n" +
                "twar.ntce_instt_cd, twar.ntce_instt_nm\r\n" +
                "order by ntce_instt_cd, presmpt_prce_group"
)
@Entity
@Immutable
@Getter
@Setter
public class PresmptPrceNtceinsttView {

    @EmbeddedId
    private PresmptPrceNtceinsttKey key;

    @Column(name = "ntce_instt_nm")
    private String dminsttNm;
    private Double prtcptCnumAvg;
    private String rsrvtnPrceRngRate;
    private Long cnt;
    private Double plnprcRate;

}
