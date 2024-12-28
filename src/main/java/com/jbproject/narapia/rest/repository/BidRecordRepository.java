package com.jbproject.narapia.rest.repository;

import com.jbproject.narapia.rest.entity.BidRecordEntity;
import com.jbproject.narapia.rest.repository.custom.BidRecordCustom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BidRecordRepository extends JpaRepository<BidRecordEntity, Long>, BidRecordCustom {

    List<BidRecordEntity> findByDminsttCdAndSucsfbidRankNotOrderByCreateDttmDesc(String dminsttCd, String sucsfbidRank);
}
