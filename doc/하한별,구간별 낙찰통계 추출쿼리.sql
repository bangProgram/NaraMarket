select 
'10,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 0 and 10000000
union all
select 
'20,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 10000000 and 20000000
union all
select 
'30,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 20000000 and 30000000
union all
select 
'40,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 30000000 and 40000000
union all
select 
'50,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 40000000 and 50000000
union all
select 
'60,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 50000000 and 60000000
union all
select 
'70,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 60000000 and 70000000
union all
select 
'80,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 70000000 and 80000000
union all
select 
'90,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 80000000 and 90000000
union all
select 
'100,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 90000000 and 100000000
union all
select 
'110,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 100000000 and 110000000
union all
select 
'120,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 110000000 and 120000000
union all
select 
'130,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 120000000 and 130000000
union all
select 
'140,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 130000000 and 140000000
union all
select 
'150,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 140000000 and 150000000
union all
select 
'160,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 150000000 and 160000000
union all
select 
'170,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 160000000 and 170000000
union all
select 
'180,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 170000000 and 180000000
union all
select 
'190,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 180000000 and 190000000
union all
select 
'200,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt between 190000000 and 200000000
union all
select 
'200,000,000 초과' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-3'
and rsrvtn_prce_rng_end_rate = '+3'
and bssamt > 200000000
;




select 
'10,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 0 and 10000000
union all
select 
'20,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 10000000 and 20000000
union all
select 
'30,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 20000000 and 30000000
union all
select 
'40,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 30000000 and 40000000
union all
select 
'50,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 40000000 and 50000000
union all
select 
'60,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 50000000 and 60000000
union all
select 
'70,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 60000000 and 70000000
union all
select 
'80,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 70000000 and 80000000
union all
select 
'90,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 80000000 and 90000000
union all
select 
'100,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 90000000 and 100000000
union all
select 
'110,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 100000000 and 110000000
union all
select 
'120,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 110000000 and 120000000
union all
select 
'130,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 120000000 and 130000000
union all
select 
'140,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 130000000 and 140000000
union all
select 
'150,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 140000000 and 150000000
union all
select 
'160,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 150000000 and 160000000
union all
select 
'170,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 160000000 and 170000000
union all
select 
'180,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 170000000 and 180000000
union all
select 
'190,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 180000000 and 190000000
union all
select 
'200,000,000 이하' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt between 190000000 and 200000000
union all
select 
'200,000,000 초과' as bssamt_range , avg(twar.prtcpt_cnum) as prtcpt_cnum_avg, max(replace(rsrvtn_prce_rng_bgn_rate,'-','')) as rsrvtn_prce_rng_bgn_rate, count(1) as cnt, avg(plnprc_rate) as avg_rate
from tb_winbid_anal_real twar 
where 1=1
and rsrvtn_prce_rng_bgn_rate = '-2'
and rsrvtn_prce_rng_end_rate = '+2'
and bssamt > 200000000
;