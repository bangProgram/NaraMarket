package com.jbproject.narapia.rest.entity.keys;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter @Setter
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class WinbidDetailKey implements Serializable {

    @Column( name = "bid_ntce_no",columnDefinition="varchar(20)")
    private String bidNtceNo;
    @Column( name = "bid_ntce_ord",columnDefinition="varchar(10)")
    private String bidNtceOrd;
    @Column( name = "bid_clsfc_no",columnDefinition="varchar(10)")
    private String bidClsfcNo;
    @Column( name = "compno_rsrvtn_prce_sno", columnDefinition="varchar(10)")
    private String compnoRsrvtnPrceSno;
}
