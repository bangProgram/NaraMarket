package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.entity.WinbidAnalEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidAnalKey;
import com.jbproject.narapia.rest.repository.custom.WinbidAnalCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WinbidAnalRepository extends JpaRepository<WinbidAnalEntity, WinbidAnalKey>, WinbidAnalCustom {

}
