package org.hibernate.bugs;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PvDbCommon {
    @Id
    private Integer id;

    private String externalId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}
