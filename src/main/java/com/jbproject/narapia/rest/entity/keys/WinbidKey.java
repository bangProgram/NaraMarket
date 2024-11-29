package com.jbproject.narapia.rest.entity.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter @Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class WinbidKey implements Serializable {

    @Column( name = "bid_ntce_no",columnDefinition="varchar(20)")
    private String bidNtceNo;
    @Column( name = "bid_ntce_ord",columnDefinition="varchar(10)")
    private String bidNtceOrd;
    @Column( name = "bid_clsfc_no",columnDefinition="varchar(10)")
    private String bidClsfcNo;
}
