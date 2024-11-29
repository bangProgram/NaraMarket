package com.jbproject.narapia.rest.entity.base;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column(name = "create_dttm", updatable = false)
    private LocalDateTime createDttm;

    @Column(name = "create_id", updatable = false)
    private String createId;

    @LastModifiedDate
    @Column(name = "update_dttm")
    private LocalDateTime updateDttm;

    private String updateId;
}
