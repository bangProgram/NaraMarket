package com.jbproject.narapia.rest.service.impl;

import com.jbproject.narapia.rest.dto.model.WinBidAnalModel;
import com.jbproject.narapia.rest.dto.payload.WinbidAnalSearchPayload;
import com.jbproject.narapia.rest.dto.result.WinbidAnalChartResult;
import com.jbproject.narapia.rest.repository.WinbidAnalRepository;
import com.jbproject.narapia.rest.service.WinbidAnalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class WinbidAnalServiceImpl implements WinbidAnalService {

    private final WinbidAnalRepository winbidAnalRepository;

    public List<WinbidAnalChartResult> getListToChartData(WinbidAnalSearchPayload payload) {
        return winbidAnalRepository.getListToChartData(payload).stream().map(WinbidAnalChartResult::create).toList();
    }
}
