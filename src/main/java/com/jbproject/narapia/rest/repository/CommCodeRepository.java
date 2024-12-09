package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.entity.CommCodeEntity;
import com.jbproject.narapia.rest.entity.keys.CommCodeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommCodeRepository extends JpaRepository<CommCodeEntity, CommCodeKey> {
    List<CommCodeEntity> findByGroupCodeOrderBySeqAsc(String groupCode);
}
