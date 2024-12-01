package com.jbproject.narapia.rest.entity;


import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.BidNotiProductKey;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "tb_bidnoti_product")
public class BidNotiProductEntity extends BaseEntity implements Persistable<BidNotiProductKey> {

    @EmbeddedId
    private BidNotiProductKey id;

    private String product;

    @Builder
    public BidNotiProductEntity(
            BidNotiProductKey id, String product
    ) {
        this.id = id;
        this.product = product;
    }

    public void update(String product) {
        this.product = product;
    }

    @Override
    public BidNotiProductKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
