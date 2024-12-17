package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.dto.result.BssamtPerRateChartResult;
import com.jbproject.narapia.rest.entity.WinbidAnalEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidAnalKey;
import com.jbproject.narapia.rest.repository.custom.WinbidAnalCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WinbidAnalRepository extends JpaRepository<WinbidAnalEntity, WinbidAnalKey>, WinbidAnalCustom {


}
