package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.entity.BidNotiEntity;
import com.jbproject.narapia.rest.entity.keys.BidNotiKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidNotiRepository extends JpaRepository<BidNotiEntity, BidNotiKey> {

}
