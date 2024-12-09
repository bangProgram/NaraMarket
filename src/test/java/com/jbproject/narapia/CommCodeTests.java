package com.jbproject.narapia;

import com.jbproject.narapia.rest.common.CommonUtil;
import com.jbproject.narapia.rest.dto.model.CommCodeModel;
import com.jbproject.narapia.rest.entity.CommCodeEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CommCodeTests {

    @Test
    void getCommCodeListByGroupCode(){
        List<CommCodeModel> commCodeModels = CommonUtil.getCommCodeListByGroupCode("MARKET_TYPE").stream().map(CommCodeModel::create).toList();

        System.out.println("commCodeModels : "+commCodeModels);
    }
}
