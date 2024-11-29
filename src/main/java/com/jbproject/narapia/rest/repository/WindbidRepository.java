package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.entity.WinbidEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import com.jbproject.narapia.rest.repository.custom.WinbidCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindbidRepository extends JpaRepository<WinbidEntity, WinbidKey>, WinbidCustom {
}
