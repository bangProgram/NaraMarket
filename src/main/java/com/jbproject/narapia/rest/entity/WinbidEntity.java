package com.jbproject.narapia.rest.entity;

import com.jbproject.narapia.rest.entity.base.BaseEntity;
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
@Table(name = "tb_winbid")
public class WinbidEntity extends BaseEntity implements Persistable<WinbidKey> {

    @EmbeddedId
    private WinbidKey id;

    private String rbidNo;
    private String ntceDivCd;
    private String bidNtceNm;
    private String prtcptCnum;
    private String bidwinnrNm;
    private String bidwinnrBizno;
    private String bidwinnrCeoNm;
    private String bidwinnrAdrs;
    private String bidwinnrTelNo;
    private String sucsfbidAmt;
    private String sucsfbidRate;
    private String rlOpengDt;
    private String dminsttCd;
    private String dminsttNm;
    private String rgstDt;
    private String fnlSucsfDate;
    private String fnlSucsfCorpOfcl;
    private String linkInsttNm;



    @Override
    public WinbidKey getId() {
        return id;
    }

    @Override
    public boolean isNew() {
        return getCreateDttm() == null;
    }
}
