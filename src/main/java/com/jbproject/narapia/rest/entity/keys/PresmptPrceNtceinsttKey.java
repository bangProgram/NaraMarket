package com.jbproject.narapia.rest.entity.keys;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;


@Getter @Setter @Embeddable
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class PresmptPrceNtceinsttKey implements Serializable {

    private String dminsttCd;
    private String presmptPrceGroup;
}
