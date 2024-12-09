package com.jbproject.narapia.rest.dto.result;

import lombok.Data;

@Data
public class BidNotiResult {

    private String bidNtceNo;
    private String bidNtceOrd;
    private String bidClsfcNo;

    private String bidNtceNm;
    private String ntceInsttCd;
    private String ntceInsttNm;
    private String dminsttCd;
    private String dminsttNm;
    private String bidMethdNm;
    private String prearngPrceDcsnMthdNm;
    private String bssamt;
    private String presmptPrce;
    private String rsrvtnPrceRngBgnRate;
    private String rsrvtnPrceRngEndRate;
    private String sucsfbidLwltRate;

    private String dtilPrdctClsfcNo;
    private String dtilPrdctClsfcNoNm;
    private String prdctSpecNm;
    private String prdctQty;
    private String prdctUnit;
    private String prdctUprc;


}
