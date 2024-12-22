package com.jbproject.narapia.rest.entity.keys;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;


@Getter @Setter @Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class BssamtPerRatekey implements Serializable {

    private String dminsttCd;
    private String presmptPrceGroup;
}
