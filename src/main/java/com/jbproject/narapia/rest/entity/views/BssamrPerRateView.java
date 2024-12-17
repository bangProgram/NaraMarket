package com.jbproject.narapia.rest.entity.views;

import groovy.transform.Immutable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Subselect(
        "select  \r\n"+
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
        "END AS bssamt_group \r\n" +
        ", avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, replace(rsrvtn_prce_rng_bgn_rate,'-','') as rsrvtn_prce_rng_rate, count(1) as cnt, avg(plnprc_rate) as plnprc_rate \r\n" +
        "from tb_winbid_anal_real twar \r\n" +
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
        "order by bssamt_group"
)
@Data
public class BssamrPerRateView {

    @Id
    private String bssamtGroup;

    private Double prtcptCnumAvg;
    private String rsrvtnPrceRngRate;
    private Long cnt;
    private Double plnprcRate;

}
