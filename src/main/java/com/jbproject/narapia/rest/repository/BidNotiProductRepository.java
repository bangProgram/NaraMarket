package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.entity.BidNotiEntity;
import com.jbproject.narapia.rest.entity.BidNotiProductEntity;
import com.jbproject.narapia.rest.entity.keys.BidNotiKey;
import com.jbproject.narapia.rest.entity.keys.BidNotiProductKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidNotiProductRepository extends JpaRepository<BidNotiProductEntity, BidNotiProductKey> {

}
