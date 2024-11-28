package com.jbproject.narapia.rest.service.impl;

import com.jbproject.narapia.rest.dto.payload.SearchPayload;
import com.jbproject.narapia.rest.service.SearchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class SearchServiceImpl implements SearchService {

    public void getSearchList(SearchPayload payload) {

    }

}
