package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.entity.WinbidDetailEntity;
import com.jbproject.narapia.rest.entity.WinbidEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidDetailKey;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import com.jbproject.narapia.rest.repository.custom.WinbidCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WindbidDetailRepository extends JpaRepository<WinbidDetailEntity, WinbidDetailKey> {

}
