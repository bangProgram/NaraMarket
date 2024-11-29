package com.jbproject.narapia.rest.repository.custom.impl;

import com.jbproject.narapia.rest.repository.custom.WinbidCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
@RequiredArgsConstructor
public class WinbidCustomImpl implements WinbidCustom {

    private final JPAQueryFactory jpaQueryFactory;

}
