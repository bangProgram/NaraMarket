package com.jbproject.narapia.rest.entity.keys;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

import java.io.Serializable;

@Getter @Setter @Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class BidNotiProductKey implements Serializable {

    @Column( name = "bid_ntce_no",columnDefinition="varchar(20)")
    private String bidNtceNo;
    @Column( name = "bid_ntce_ord",columnDefinition="varchar(10)")
    private String bidNtceOrd;
    private String productOrder;
    private String productCode;
}
