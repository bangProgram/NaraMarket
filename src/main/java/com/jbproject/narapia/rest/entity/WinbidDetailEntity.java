package com.jbproject.narapia.rest.entity;

import com.jbproject.narapia.rest.entity.base.BaseEntity;
import com.jbproject.narapia.rest.entity.keys.WinbidDetailKey;
import com.jbproject.narapia.rest.entity.keys.WinbidKey;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Persistable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_winbid_detail")
public class WinbidDetailEntity extends BaseEntity implements Persistable<WinbidDetailKey> {

    @EmbeddedId
    private WinbidDetailKey id;

    private String rbidNtceNo;
    private String bidNtceNm;
    private String plnprc;
    private String bssamt;
    private String totRsrvtnPrceNum;
    private String bsisPlnprc;
    private String drwtYn;
    private String drwtNum;
    private String bidwinrSlctnAplBssCntnts;
    private String rlOpengDt;
    private String bssamtBssUpNum;
    private String compnoRsrvtnPrceMkngDt;
    private String inptDt;
    private String PrearngPrcePurcnstcst;




    @Override
    public WinbidDetailKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
