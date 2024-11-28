package com.jbproject.narapia.rest.dto.payload;

import lombok.Data;

@Data
public class NotiSearchPayload {

    private String numOfRows;  // 한 페이지 결과 수

    private String pageNo; //  페이지 번호

    private String serviceKey; //    공공데이터포탈에서 받은 인증키

    private String inqryDiv;    // 검색하고자하는 조회구분 1:등록일시, 2.입찰공고번호 3.변경일시 (등록일시로 검색시 방위사업청 입찰공고데이터의 등록일시는 방위사업청에서 제공하는 오픈API로 연계된 입찰공고정보가 조

    private String inqryBgnDt; //    검색하고자하는 등록일시 또는 변경일시 조회시작일시

    private String inqryEndDt; //    검색하고자하는 등록일시 또는 변경일시 조회종료일시

    private String bidNtceNo; // 검색하고자 하는 입찰공고번호, (조회구분 '2' 선택시 필수)

    private String type = "json"; //    오픈API 리턴 타입을 JSON으로 받고 싶을 경우 'json' 으로 지정
}
