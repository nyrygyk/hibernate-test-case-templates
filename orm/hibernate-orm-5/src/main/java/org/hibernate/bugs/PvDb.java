package org.hibernate.bugs;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PV_DB")
@Entity
public class PvDb extends PvDbCommon {

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
